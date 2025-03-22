package com.puj.myuber.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Servicio del servidor
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: myuber.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class myuberServiceGrpc {

  private myuberServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "myuberService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.peticionTaxi,
      com.puj.myuber.stubs.Myuber.peticionRespuesta> getPedirTaxiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pedirTaxi",
      requestType = com.puj.myuber.stubs.Myuber.peticionTaxi.class,
      responseType = com.puj.myuber.stubs.Myuber.peticionRespuesta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.peticionTaxi,
      com.puj.myuber.stubs.Myuber.peticionRespuesta> getPedirTaxiMethod() {
    io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.peticionTaxi, com.puj.myuber.stubs.Myuber.peticionRespuesta> getPedirTaxiMethod;
    if ((getPedirTaxiMethod = myuberServiceGrpc.getPedirTaxiMethod) == null) {
      synchronized (myuberServiceGrpc.class) {
        if ((getPedirTaxiMethod = myuberServiceGrpc.getPedirTaxiMethod) == null) {
          myuberServiceGrpc.getPedirTaxiMethod = getPedirTaxiMethod =
              io.grpc.MethodDescriptor.<com.puj.myuber.stubs.Myuber.peticionTaxi, com.puj.myuber.stubs.Myuber.peticionRespuesta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pedirTaxi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.puj.myuber.stubs.Myuber.peticionTaxi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.puj.myuber.stubs.Myuber.peticionRespuesta.getDefaultInstance()))
              .setSchemaDescriptor(new myuberServiceMethodDescriptorSupplier("pedirTaxi"))
              .build();
        }
      }
    }
    return getPedirTaxiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.Empty,
      com.puj.myuber.stubs.Myuber.Empty> getListaServiciosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listaServicios",
      requestType = com.puj.myuber.stubs.Myuber.Empty.class,
      responseType = com.puj.myuber.stubs.Myuber.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.Empty,
      com.puj.myuber.stubs.Myuber.Empty> getListaServiciosMethod() {
    io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.Empty, com.puj.myuber.stubs.Myuber.Empty> getListaServiciosMethod;
    if ((getListaServiciosMethod = myuberServiceGrpc.getListaServiciosMethod) == null) {
      synchronized (myuberServiceGrpc.class) {
        if ((getListaServiciosMethod = myuberServiceGrpc.getListaServiciosMethod) == null) {
          myuberServiceGrpc.getListaServiciosMethod = getListaServiciosMethod =
              io.grpc.MethodDescriptor.<com.puj.myuber.stubs.Myuber.Empty, com.puj.myuber.stubs.Myuber.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listaServicios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.puj.myuber.stubs.Myuber.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.puj.myuber.stubs.Myuber.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new myuberServiceMethodDescriptorSupplier("listaServicios"))
              .build();
        }
      }
    }
    return getListaServiciosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.datosUsuario,
      com.puj.myuber.stubs.Myuber.success> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = com.puj.myuber.stubs.Myuber.datosUsuario.class,
      responseType = com.puj.myuber.stubs.Myuber.success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.datosUsuario,
      com.puj.myuber.stubs.Myuber.success> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.puj.myuber.stubs.Myuber.datosUsuario, com.puj.myuber.stubs.Myuber.success> getRegisterMethod;
    if ((getRegisterMethod = myuberServiceGrpc.getRegisterMethod) == null) {
      synchronized (myuberServiceGrpc.class) {
        if ((getRegisterMethod = myuberServiceGrpc.getRegisterMethod) == null) {
          myuberServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<com.puj.myuber.stubs.Myuber.datosUsuario, com.puj.myuber.stubs.Myuber.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.puj.myuber.stubs.Myuber.datosUsuario.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.puj.myuber.stubs.Myuber.success.getDefaultInstance()))
              .setSchemaDescriptor(new myuberServiceMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static myuberServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<myuberServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<myuberServiceStub>() {
        @java.lang.Override
        public myuberServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new myuberServiceStub(channel, callOptions);
        }
      };
    return myuberServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static myuberServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<myuberServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<myuberServiceBlockingStub>() {
        @java.lang.Override
        public myuberServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new myuberServiceBlockingStub(channel, callOptions);
        }
      };
    return myuberServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static myuberServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<myuberServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<myuberServiceFutureStub>() {
        @java.lang.Override
        public myuberServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new myuberServiceFutureStub(channel, callOptions);
        }
      };
    return myuberServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void pedirTaxi(com.puj.myuber.stubs.Myuber.peticionTaxi request,
        io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.peticionRespuesta> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPedirTaxiMethod(), responseObserver);
    }

    /**
     */
    default void listaServicios(com.puj.myuber.stubs.Myuber.Empty request,
        io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListaServiciosMethod(), responseObserver);
    }

    /**
     */
    default void register(com.puj.myuber.stubs.Myuber.datosUsuario request,
        io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.success> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service myuberService.
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public static abstract class myuberServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return myuberServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service myuberService.
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public static final class myuberServiceStub
      extends io.grpc.stub.AbstractAsyncStub<myuberServiceStub> {
    private myuberServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected myuberServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new myuberServiceStub(channel, callOptions);
    }

    /**
     */
    public void pedirTaxi(com.puj.myuber.stubs.Myuber.peticionTaxi request,
        io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.peticionRespuesta> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPedirTaxiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listaServicios(com.puj.myuber.stubs.Myuber.Empty request,
        io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListaServiciosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void register(com.puj.myuber.stubs.Myuber.datosUsuario request,
        io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.success> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service myuberService.
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public static final class myuberServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<myuberServiceBlockingStub> {
    private myuberServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected myuberServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new myuberServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.puj.myuber.stubs.Myuber.peticionRespuesta pedirTaxi(com.puj.myuber.stubs.Myuber.peticionTaxi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPedirTaxiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.puj.myuber.stubs.Myuber.Empty listaServicios(com.puj.myuber.stubs.Myuber.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListaServiciosMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.puj.myuber.stubs.Myuber.success register(com.puj.myuber.stubs.Myuber.datosUsuario request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service myuberService.
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public static final class myuberServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<myuberServiceFutureStub> {
    private myuberServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected myuberServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new myuberServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.puj.myuber.stubs.Myuber.peticionRespuesta> pedirTaxi(
        com.puj.myuber.stubs.Myuber.peticionTaxi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPedirTaxiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.puj.myuber.stubs.Myuber.Empty> listaServicios(
        com.puj.myuber.stubs.Myuber.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListaServiciosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.puj.myuber.stubs.Myuber.success> register(
        com.puj.myuber.stubs.Myuber.datosUsuario request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PEDIR_TAXI = 0;
  private static final int METHODID_LISTA_SERVICIOS = 1;
  private static final int METHODID_REGISTER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PEDIR_TAXI:
          serviceImpl.pedirTaxi((com.puj.myuber.stubs.Myuber.peticionTaxi) request,
              (io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.peticionRespuesta>) responseObserver);
          break;
        case METHODID_LISTA_SERVICIOS:
          serviceImpl.listaServicios((com.puj.myuber.stubs.Myuber.Empty) request,
              (io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.Empty>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((com.puj.myuber.stubs.Myuber.datosUsuario) request,
              (io.grpc.stub.StreamObserver<com.puj.myuber.stubs.Myuber.success>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getPedirTaxiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.puj.myuber.stubs.Myuber.peticionTaxi,
              com.puj.myuber.stubs.Myuber.peticionRespuesta>(
                service, METHODID_PEDIR_TAXI)))
        .addMethod(
          getListaServiciosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.puj.myuber.stubs.Myuber.Empty,
              com.puj.myuber.stubs.Myuber.Empty>(
                service, METHODID_LISTA_SERVICIOS)))
        .addMethod(
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.puj.myuber.stubs.Myuber.datosUsuario,
              com.puj.myuber.stubs.Myuber.success>(
                service, METHODID_REGISTER)))
        .build();
  }

  private static abstract class myuberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    myuberServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.puj.myuber.stubs.Myuber.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("myuberService");
    }
  }

  private static final class myuberServiceFileDescriptorSupplier
      extends myuberServiceBaseDescriptorSupplier {
    myuberServiceFileDescriptorSupplier() {}
  }

  private static final class myuberServiceMethodDescriptorSupplier
      extends myuberServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    myuberServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (myuberServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new myuberServiceFileDescriptorSupplier())
              .addMethod(getPedirTaxiMethod())
              .addMethod(getListaServiciosMethod())
              .addMethod(getRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
