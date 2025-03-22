package com.puj.myuber.Cliente;

import java.util.Scanner;

import com.puj.myuber.Myuber.datosUsuario;
import com.puj.myuber.myuberServiceGrpc;
import com.puj.myuber.myuberServiceGrpc.myuberServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class myUber {
    public static void main(String[] args){
        //Establecer conexion con el servidor
        String server = "192.168.10.6"; //Cambiar segun la IP del servidor
        int port = 1080;
        Scanner input = new Scanner(System.in);
    
        System.out.println("Conectando con el servidor");

        ManagedChannel channel = ManagedChannelBuilder.forAddress(server, port)
                .usePlaintext()
                .build();

        myuberServiceBlockingStub uberStub = myuberServiceGrpc.newBlockingStub(channel);

        //Uso
        System.out.println("\t||Bienvenido a MyUber||");

        System.out.println("\t|Registro|");
        System.out.println("Nombre: ");
        String nombre = input.nextLine();
        System.out.println("Telefono: ");
        Long telefono = input.nextLong();

        datosUsuario datos = datosUsuario.newBuilder()
                .setNombre(nombre)
                .setTelefono(telefono)
                .build(); 

        uberStub.register(datos);
        
        System.out.println("\t|Servicios disponibles|");

        System.out.println("\t|Desea consultar la lista de servicios antes de realizar la solicitud?|");
        System.out.println("1. Si");
        System.out.println("2. No");
        
        int opt = input.nextInt();

        if(opt == 1){
            System.out.println("\t|Lista de servicios|");
        }

        System.out.println("\t|Solicitud de taxi|");
        System.out.println("Ingrese la coordenada en X: ");
        int posX = input.nextInt();
        System.out.println("Ingrese la coordenada en Y: ");
        int posY = input.nextInt();

        
        channel.shutdown();
    }
}
