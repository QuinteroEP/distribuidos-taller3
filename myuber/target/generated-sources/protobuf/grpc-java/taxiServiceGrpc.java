import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Servicio de taxis
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: servicioTaxi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class taxiServiceGrpc {

  private taxiServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "taxiService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ServicioTaxi.peticionTaxi,
      ServicioTaxi.peticionRespuesta> getPedirTaxiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pedirTaxi",
      requestType = ServicioTaxi.peticionTaxi.class,
      responseType = ServicioTaxi.peticionRespuesta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServicioTaxi.peticionTaxi,
      ServicioTaxi.peticionRespuesta> getPedirTaxiMethod() {
    io.grpc.MethodDescriptor<ServicioTaxi.peticionTaxi, ServicioTaxi.peticionRespuesta> getPedirTaxiMethod;
    if ((getPedirTaxiMethod = taxiServiceGrpc.getPedirTaxiMethod) == null) {
      synchronized (taxiServiceGrpc.class) {
        if ((getPedirTaxiMethod = taxiServiceGrpc.getPedirTaxiMethod) == null) {
          taxiServiceGrpc.getPedirTaxiMethod = getPedirTaxiMethod =
              io.grpc.MethodDescriptor.<ServicioTaxi.peticionTaxi, ServicioTaxi.peticionRespuesta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pedirTaxi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioTaxi.peticionTaxi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioTaxi.peticionRespuesta.getDefaultInstance()))
              .setSchemaDescriptor(new taxiServiceMethodDescriptorSupplier("pedirTaxi"))
              .build();
        }
      }
    }
    return getPedirTaxiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ServicioTaxi.Empty,
      ServicioTaxi.serviciosDeTaxi> getListaServiciosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listaServicios",
      requestType = ServicioTaxi.Empty.class,
      responseType = ServicioTaxi.serviciosDeTaxi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServicioTaxi.Empty,
      ServicioTaxi.serviciosDeTaxi> getListaServiciosMethod() {
    io.grpc.MethodDescriptor<ServicioTaxi.Empty, ServicioTaxi.serviciosDeTaxi> getListaServiciosMethod;
    if ((getListaServiciosMethod = taxiServiceGrpc.getListaServiciosMethod) == null) {
      synchronized (taxiServiceGrpc.class) {
        if ((getListaServiciosMethod = taxiServiceGrpc.getListaServiciosMethod) == null) {
          taxiServiceGrpc.getListaServiciosMethod = getListaServiciosMethod =
              io.grpc.MethodDescriptor.<ServicioTaxi.Empty, ServicioTaxi.serviciosDeTaxi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listaServicios"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioTaxi.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioTaxi.serviciosDeTaxi.getDefaultInstance()))
              .setSchemaDescriptor(new taxiServiceMethodDescriptorSupplier("listaServicios"))
              .build();
        }
      }
    }
    return getListaServiciosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static taxiServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<taxiServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<taxiServiceStub>() {
        @java.lang.Override
        public taxiServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new taxiServiceStub(channel, callOptions);
        }
      };
    return taxiServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static taxiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<taxiServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<taxiServiceBlockingStub>() {
        @java.lang.Override
        public taxiServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new taxiServiceBlockingStub(channel, callOptions);
        }
      };
    return taxiServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static taxiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<taxiServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<taxiServiceFutureStub>() {
        @java.lang.Override
        public taxiServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new taxiServiceFutureStub(channel, callOptions);
        }
      };
    return taxiServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void pedirTaxi(ServicioTaxi.peticionTaxi request,
        io.grpc.stub.StreamObserver<ServicioTaxi.peticionRespuesta> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPedirTaxiMethod(), responseObserver);
    }

    /**
     */
    default void listaServicios(ServicioTaxi.Empty request,
        io.grpc.stub.StreamObserver<ServicioTaxi.serviciosDeTaxi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListaServiciosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service taxiService.
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public static abstract class taxiServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return taxiServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service taxiService.
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public static final class taxiServiceStub
      extends io.grpc.stub.AbstractAsyncStub<taxiServiceStub> {
    private taxiServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taxiServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new taxiServiceStub(channel, callOptions);
    }

    /**
     */
    public void pedirTaxi(ServicioTaxi.peticionTaxi request,
        io.grpc.stub.StreamObserver<ServicioTaxi.peticionRespuesta> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPedirTaxiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listaServicios(ServicioTaxi.Empty request,
        io.grpc.stub.StreamObserver<ServicioTaxi.serviciosDeTaxi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListaServiciosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service taxiService.
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public static final class taxiServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<taxiServiceBlockingStub> {
    private taxiServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taxiServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new taxiServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ServicioTaxi.peticionRespuesta pedirTaxi(ServicioTaxi.peticionTaxi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPedirTaxiMethod(), getCallOptions(), request);
    }

    /**
     */
    public ServicioTaxi.serviciosDeTaxi listaServicios(ServicioTaxi.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListaServiciosMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service taxiService.
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public static final class taxiServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<taxiServiceFutureStub> {
    private taxiServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taxiServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new taxiServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioTaxi.peticionRespuesta> pedirTaxi(
        ServicioTaxi.peticionTaxi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPedirTaxiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioTaxi.serviciosDeTaxi> listaServicios(
        ServicioTaxi.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListaServiciosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PEDIR_TAXI = 0;
  private static final int METHODID_LISTA_SERVICIOS = 1;

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
          serviceImpl.pedirTaxi((ServicioTaxi.peticionTaxi) request,
              (io.grpc.stub.StreamObserver<ServicioTaxi.peticionRespuesta>) responseObserver);
          break;
        case METHODID_LISTA_SERVICIOS:
          serviceImpl.listaServicios((ServicioTaxi.Empty) request,
              (io.grpc.stub.StreamObserver<ServicioTaxi.serviciosDeTaxi>) responseObserver);
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
              ServicioTaxi.peticionTaxi,
              ServicioTaxi.peticionRespuesta>(
                service, METHODID_PEDIR_TAXI)))
        .addMethod(
          getListaServiciosMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ServicioTaxi.Empty,
              ServicioTaxi.serviciosDeTaxi>(
                service, METHODID_LISTA_SERVICIOS)))
        .build();
  }

  private static abstract class taxiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    taxiServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServicioTaxi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("taxiService");
    }
  }

  private static final class taxiServiceFileDescriptorSupplier
      extends taxiServiceBaseDescriptorSupplier {
    taxiServiceFileDescriptorSupplier() {}
  }

  private static final class taxiServiceMethodDescriptorSupplier
      extends taxiServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    taxiServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (taxiServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new taxiServiceFileDescriptorSupplier())
              .addMethod(getPedirTaxiMethod())
              .addMethod(getListaServiciosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
