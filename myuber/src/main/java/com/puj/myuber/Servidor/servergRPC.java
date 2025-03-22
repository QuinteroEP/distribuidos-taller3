package com.puj.myuber.Servidor;

import com.puj.myuber.Myuber.datosUsuario;
import com.puj.myuber.Myuber.peticionRespuesta;
import com.puj.myuber.Myuber.peticionTaxi;
import com.puj.myuber.Myuber.success;
import com.puj.myuber.myuberServiceGrpc;

public class servergRPC extends myuberServiceGrpc.myuberServiceImplBase {
    //Implementacion de los stubs
    @Override
    public void listaServicios(com.puj.myuber.Myuber.Empty request, io.grpc.stub.StreamObserver<com.puj.myuber.Myuber.Empty> responseObserver) {
        System.out.println("Lista de servicios:");
        responseObserver.onNext(com.puj.myuber.Myuber.Empty.newBuilder().build());
        responseObserver.onCompleted();
    }
    
    @Override
    public void pedirTaxi(peticionTaxi request, io.grpc.stub.StreamObserver<peticionRespuesta> responseObserver) {
        System.out.println("Coordenada en X: " + request.getPosX());
        System.out.println("Coordenada en Y: " + request.getPosY());

        responseObserver.onNext(peticionRespuesta.newBuilder().setPlacaTaxi("ABC123").build());
        responseObserver.onCompleted();
    }

    @Override
    public void register(datosUsuario request, io.grpc.stub.StreamObserver<success> responseObserver) {
        responseObserver.onNext(success.newBuilder().setStatus("Usuario registrado exitosamente").build());
        responseObserver.onCompleted();
    }
} 
