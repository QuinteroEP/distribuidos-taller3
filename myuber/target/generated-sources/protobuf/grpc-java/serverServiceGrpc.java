import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Servicio del servidor
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: servicioServidor.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class serverServiceGrpc {

  private serverServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "serverService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ServicioServidor.peticionTaxi,
      ServicioServidor.peticionRespuesta> getPedirTaxiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pedirTaxi",
      requestType = ServicioServidor.peticionTaxi.class,
      responseType = ServicioServidor.peticionRespuesta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServicioServidor.peticionTaxi,
      ServicioServidor.peticionRespuesta> getPedirTaxiMethod() {
    io.grpc.MethodDescriptor<ServicioServidor.peticionTaxi, ServicioServidor.peticionRespuesta> getPedirTaxiMethod;
    if ((getPedirTaxiMethod = serverServiceGrpc.getPedirTaxiMethod) == null) {
      synchronized (serverServiceGrpc.class) {
        if ((getPedirTaxiMethod = serverServiceGrpc.getPedirTaxiMethod) == null) {
          serverServiceGrpc.getPedirTaxiMethod = getPedirTaxiMethod =
              io.grpc.MethodDescriptor.<ServicioServidor.peticionTaxi, ServicioServidor.peticionRespuesta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pedirTaxi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioServidor.peticionTaxi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioServidor.peticionRespuesta.getDefaultInstance()))
              .setSchemaDescriptor(new serverServiceMethodDescriptorSupplier("pedirTaxi"))
              .build();
        }
      }
    }
    return getPedirTaxiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ServicioServidor.Empty,
      ServicioServidor.serviciosDeTaxi> getListaServiciosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listaServicios",
      requestType = ServicioServidor.Empty.class,
      responseType = ServicioServidor.serviciosDeTaxi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServicioServidor.Empty,
      ServicioServidor.serviciosDeTaxi> getListaServiciosMethod() {
    io.grpc.MethodDescriptor<ServicioServidor.Empty, ServicioServidor.serviciosDeTaxi> getListaServiciosMethod;
    if ((getListaServiciosMethod = serverServiceGrpc.getListaServiciosMethod) == null) {
      synchronized (serverServiceGrpc.class) {
        if ((getListaServiciosMethod = serverServiceGrpc.getListaServiciosMethod) == null) {
          serverServiceGrpc.getListaServiciosMethod = getListaServiciosMethod =
              io.grpc.MethodDescriptor.<ServicioServidor.Empty, ServicioServidor.serviciosDeTaxi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listaServicios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioServidor.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioServidor.serviciosDeTaxi.getDefaultInstance()))
              .setSchemaDescriptor(new serverServiceMethodDescriptorSupplier("listaServicios"))
              .build();
        }
      }
    }
    return getListaServiciosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ServicioServidor.datosUsuario,
      ServicioServidor.success> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = ServicioServidor.datosUsuario.class,
      responseType = ServicioServidor.success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServicioServidor.datosUsuario,
      ServicioServidor.success> getRegisterMethod() {
    io.grpc.MethodDescriptor<ServicioServidor.datosUsuario, ServicioServidor.success> getRegisterMethod;
    if ((getRegisterMethod = serverServiceGrpc.getRegisterMethod) == null) {
      synchronized (serverServiceGrpc.class) {
        if ((getRegisterMethod = serverServiceGrpc.getRegisterMethod) == null) {
          serverServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<ServicioServidor.datosUsuario, ServicioServidor.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioServidor.datosUsuario.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioServidor.success.getDefaultInstance()))
              .setSchemaDescriptor(new serverServiceMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static serverServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<serverServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<serverServiceStub>() {
        @java.lang.Override
        public serverServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new serverServiceStub(channel, callOptions);
        }
      };
    return serverServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static serverServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<serverServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<serverServiceBlockingStub>() {
        @java.lang.Override
        public serverServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new serverServiceBlockingStub(channel, callOptions);
        }
      };
    return serverServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static serverServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<serverServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<serverServiceFutureStub>() {
        @java.lang.Override
        public serverServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new serverServiceFutureStub(channel, callOptions);
        }
      };
    return serverServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void pedirTaxi(ServicioServidor.peticionTaxi request,
        io.grpc.stub.StreamObserver<ServicioServidor.peticionRespuesta> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPedirTaxiMethod(), responseObserver);
    }

    /**
     */
    default void listaServicios(ServicioServidor.Empty request,
        io.grpc.stub.StreamObserver<ServicioServidor.serviciosDeTaxi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListaServiciosMethod(), responseObserver);
    }

    /**
     */
    default void register(ServicioServidor.datosUsuario request,
        io.grpc.stub.StreamObserver<ServicioServidor.success> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service serverService.
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public static abstract class serverServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return serverServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service serverService.
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public static final class serverServiceStub
      extends io.grpc.stub.AbstractAsyncStub<serverServiceStub> {
    private serverServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serverServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new serverServiceStub(channel, callOptions);
    }

    /**
     */
    public void pedirTaxi(ServicioServidor.peticionTaxi request,
        io.grpc.stub.StreamObserver<ServicioServidor.peticionRespuesta> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPedirTaxiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listaServicios(ServicioServidor.Empty request,
        io.grpc.stub.StreamObserver<ServicioServidor.serviciosDeTaxi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListaServiciosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void register(ServicioServidor.datosUsuario request,
        io.grpc.stub.StreamObserver<ServicioServidor.success> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service serverService.
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public static final class serverServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<serverServiceBlockingStub> {
    private serverServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serverServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new serverServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ServicioServidor.peticionRespuesta pedirTaxi(ServicioServidor.peticionTaxi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPedirTaxiMethod(), getCallOptions(), request);
    }

    /**
     */
    public ServicioServidor.serviciosDeTaxi listaServicios(ServicioServidor.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListaServiciosMethod(), getCallOptions(), request);
    }

    /**
     */
    public ServicioServidor.success register(ServicioServidor.datosUsuario request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service serverService.
   * <pre>
   * Servicio del servidor
   * </pre>
   */
  public static final class serverServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<serverServiceFutureStub> {
    private serverServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serverServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new serverServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioServidor.peticionRespuesta> pedirTaxi(
        ServicioServidor.peticionTaxi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPedirTaxiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioServidor.serviciosDeTaxi> listaServicios(
        ServicioServidor.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListaServiciosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioServidor.success> register(
        ServicioServidor.datosUsuario request) {
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
          serviceImpl.pedirTaxi((ServicioServidor.peticionTaxi) request,
              (io.grpc.stub.StreamObserver<ServicioServidor.peticionRespuesta>) responseObserver);
          break;
        case METHODID_LISTA_SERVICIOS:
          serviceImpl.listaServicios((ServicioServidor.Empty) request,
              (io.grpc.stub.StreamObserver<ServicioServidor.serviciosDeTaxi>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((ServicioServidor.datosUsuario) request,
              (io.grpc.stub.StreamObserver<ServicioServidor.success>) responseObserver);
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
              ServicioServidor.peticionTaxi,
              ServicioServidor.peticionRespuesta>(
                service, METHODID_PEDIR_TAXI)))
        .addMethod(
          getListaServiciosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ServicioServidor.Empty,
              ServicioServidor.serviciosDeTaxi>(
                service, METHODID_LISTA_SERVICIOS)))
        .addMethod(
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ServicioServidor.datosUsuario,
              ServicioServidor.success>(
                service, METHODID_REGISTER)))
        .build();
  }

  private static abstract class serverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    serverServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServicioServidor.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("serverService");
    }
  }

  private static final class serverServiceFileDescriptorSupplier
      extends serverServiceBaseDescriptorSupplier {
    serverServiceFileDescriptorSupplier() {}
  }

  private static final class serverServiceMethodDescriptorSupplier
      extends serverServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    serverServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (serverServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new serverServiceFileDescriptorSupplier())
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
