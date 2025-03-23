package com.puj.myuber.Cliente;

import java.util.Iterator;
import java.util.Scanner;

import com.puj.myuber.stubs.Myuber.Empty;
import com.puj.myuber.stubs.Myuber.datosUsuario;
import com.puj.myuber.stubs.Myuber.peticionRespuesta;
import com.puj.myuber.stubs.Myuber.peticionTaxi;
import com.puj.myuber.stubs.Myuber.serviciosDeTaxi;
import com.puj.myuber.stubs.myuberServiceGrpc;
import com.puj.myuber.stubs.myuberServiceGrpc.myuberServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class myUber {
    public static void main(String[] args){

        //Establecer conexion con el servidor
        String server = "192.168.10.6"; //Cambiar segun la IP del servidor
        int port = 1080;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
    
        System.out.println("Conectando con el servidor");

        //Crear el canal
        ManagedChannel channel = ManagedChannelBuilder.forAddress(server, port)
                .usePlaintext()
                .build();

        //Crear el Stub
        myuberServiceBlockingStub uberStub = myuberServiceGrpc.newBlockingStub(channel);
        System.out.println("Conectado al servidor: " + channel.authority());

        //Uso
        System.out.println("\t||Bienvenido a MyUber||\n");

        //Ingresar datos de registro
        System.out.println("\t|Registro|");
        System.out.println("Nombre: ");
        String nombre = input.nextLine();
        System.out.println("Telefono: ");
        Long telefono = input.nextLong();

        //Enviar datos de registro al servidor
        datosUsuario datos = datosUsuario.newBuilder()
                .setNombre(nombre)
                .setTelefono(telefono)
                .build(); 

        uberStub.register(datos);

        System.out.println("\t|Desea consultar la lista de servicios antes de realizar la solicitud?|");
        System.out.println("1. Si");
        System.out.println("2. No");
        
        int opt = input.nextInt();

        if(opt == 1){
            System.out.println("\t|Lista de servicios|");

            Empty request = Empty.newBuilder().build();

            Iterator<serviciosDeTaxi> response = uberStub.listaServicios(request);

            //Recibir los mensajes del servidor
            while (response.hasNext()) {
                serviciosDeTaxi servicio = response.next();
                System.out.println("Tipo de servicio: " + servicio.getTipo(0));
                System.out.println("Costo por hora: " + servicio.getCosto(0));
                System.out.println("Descripcion: " + servicio.getDescripcion(0));
                System.out.println("\n");
            }
        }

        System.out.println("\t|Solicitud de taxi|");
        //Ingresar posicion
        System.out.println("Ingrese su posicion en X: ");
        int posX = input.nextInt();
        System.out.println("Ingrese la posicion en Y: ");
        int posY = input.nextInt();

        //Enviar peticion al servidor
        peticionTaxi peticion = peticionTaxi.newBuilder()
                .setPosX(posX)
                .setPosY(posY)
                .setUsuario(nombre)
                .build();

        peticionRespuesta response = uberStub.pedirTaxi(peticion);
        System.out.println("Su taxi viene en camino. Placas " + response.getPlacaTaxi());

        //Cerrar el canal
        channel.shutdown();
    } 
}
