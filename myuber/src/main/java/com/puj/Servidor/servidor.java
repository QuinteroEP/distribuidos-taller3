package com.puj.Servidor;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class servidor {
    public static void main(String[] args){
        System.out.println("Inicializando servidor de MyUber");

        Server server = ServerBuilder
            .forPort(1080)
            .build();
        
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Servidor iniciado en el puerto " + server.getPort());
        System.out.println("Esperando conexiones de clientes");

        try {
            server.awaitTermination();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
