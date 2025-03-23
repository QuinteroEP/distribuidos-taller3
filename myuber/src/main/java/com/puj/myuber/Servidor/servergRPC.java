package com.puj.myuber.Servidor;
 
import com.puj.myuber.stubs.Myuber.datosUsuario;
import com.puj.myuber.stubs.Myuber.peticionRespuesta;
import com.puj.myuber.stubs.Myuber.peticionTaxi;
import com.puj.myuber.stubs.Myuber.serviciosDeTaxi;
import com.puj.myuber.stubs.Myuber.success;
import com.puj.myuber.stubs.myuberServiceGrpc;

public class servergRPC extends myuberServiceGrpc.myuberServiceImplBase {
    //Datos de taxis
    //Posicion
    double[][] taxis_posicion = {
        {1, 5, 6, 3, 4, 2},
        {1, 4, 9, 8, 4, 3}
    };

    //Placas
    String[] taxis_placa = {
        "XXC23", 
        "XCV33", 
        "GHJ45",
        "RR167",
        "GGT55",
        "HHW33"
    };

    //Metodos para actualizar la lista de taxis
    public String[] removeTaxiAtIndex(String[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Invalid index");
        }
    
        String[] newArray = new String[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }

    public double[][] removeTaxiPositionAtIndex(double[][] array, int index) {
        if (index < 0 || index >= array[0].length) {
            throw new IllegalArgumentException("Invalid index");
        }
    
        double[][] newArray = new double[array.length][array[0].length - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, k = 0; j < array[i].length; j++) {
                if (j != index) {
                    newArray[i][k++] = array[i][j];
                }
            }
        }
        return newArray;
    }

    //Implementacion de los stubs
    @Override
    public void register(datosUsuario request, io.grpc.stub.StreamObserver<success> responseObserver) {
        //Registrar un nuevo usuario
        responseObserver.onNext(success.newBuilder().setStatus("Success").build());
        System.out.println("Nuevo usuario registrado: " + request.getNombre());
        responseObserver.onCompleted();
    }

    @Override
    public void listaServicios(com.puj.myuber.stubs.Myuber.Empty request, io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.serviciosDeTaxi> responseObserver) {
        //Enviar la lista de servicios disponibles
        System.out.println("Enviando lista de servicios\n");
        responseObserver.onNext(serviciosDeTaxi.newBuilder()
            .addTipo("Normal")
            .addCosto(50000)
            .addDescripcion("Servicio de taxi estándar")
            .build());

        responseObserver.onNext(serviciosDeTaxi.newBuilder()
            .addTipo("Express")
            .addCosto(70000)
            .addDescripcion("Servicio de taxi de lujo")
            .build());

        responseObserver.onNext(serviciosDeTaxi.newBuilder()
            .addTipo("Excursion")
            .addCosto(120000)
            .addDescripcion("Servicio de taxi compartido")
            .build());

        responseObserver.onCompleted();
    }
    
    @Override
    public void pedirTaxi(peticionTaxi request, io.grpc.stub.StreamObserver<peticionRespuesta> responseObserver) { 
        //Pedir un taxi
        System.out.println("Petcion de taxi recibida para las coordenadas: " + request.getPosX() + ", " + request.getPosY());
        double coordX = request.getPosX();
        double coordY = request.getPosY();
        double distancia = 100;
        int index_taxi = 0;

        System.out.println("Taxis disponibles:");
        for(int i = 0; i < taxis_posicion[0].length; i++){
            System.out.println(taxis_placa[i] + " (" + taxis_posicion[0][i] + ", " + taxis_posicion[1][i] + ")");
        }
        System.out.println("\n");

        //Calcular el taxi más cercano
        for(int i = 0; i < taxis_posicion[0].length; i++){
            double x = taxis_posicion[0][i];
            double y = taxis_posicion[1][i];
            double dist = Math.sqrt(Math.pow((coordX - x), 2) + Math.pow((coordY - y), 2));
            if(dist < distancia){
                distancia = dist;
                index_taxi = i;
            }
        }

        System.out.println("Taxi asignado: " + taxis_placa[index_taxi] + "\n");

        responseObserver.onNext(peticionRespuesta.newBuilder().setPlacaTaxi(taxis_placa[index_taxi]).build());
        responseObserver.onCompleted();

        //Eliminar el taxi asignado de la lista de taxis disponibles
        taxis_placa = removeTaxiAtIndex(taxis_placa, index_taxi);
        taxis_posicion = removeTaxiPositionAtIndex(taxis_posicion, index_taxi);
    }
}
