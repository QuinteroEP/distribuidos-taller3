package com.puj.myuber.Servidor;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class server {
    public static void main(String[] args){
        System.out.println("Inicializando servidor de MyUber");

        Server server = ServerBuilder
            .forPort(1080)
            .addService(new servergRPC()) 
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

        System.out.println("Cliente conectado");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            server.shutdown();
            System.out.println("Conexion terminada");
        }));
    }
}
