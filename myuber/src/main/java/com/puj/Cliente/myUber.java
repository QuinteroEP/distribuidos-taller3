package com.puj.Cliente;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class myUber {
    public static void main(String[] args){
        String server = "192.168.10.6"; //Cambiar segund la IP del servidor
        int port = 1080;
    
        System.out.println("Conectando con el servidor");

        ManagedChannel channel = ManagedChannelBuilder.forAddress(server, port)
                .build();

        System.out.println("\t||Bienvenido a MyUber||");

        channel.shutdown();
    }
}
