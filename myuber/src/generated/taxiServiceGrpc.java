import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Servicio de taxis
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: myuber/src/main/proto/servicioTaxi.proto")
public final class taxiServiceGrpc {

  private taxiServiceGrpc() {}

  public static final String SERVICE_NAME = "taxiService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPedirTaxiMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ServicioTaxi.peticionTaxi,
      ServicioTaxi.peticionRespuesta> METHOD_PEDIR_TAXI = getPedirTaxiMethod();

  private static volatile io.grpc.MethodDescriptor<ServicioTaxi.peticionTaxi,
      ServicioTaxi.peticionRespuesta> getPedirTaxiMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ServicioTaxi.peticionTaxi,
      ServicioTaxi.peticionRespuesta> getPedirTaxiMethod() {
    io.grpc.MethodDescriptor<ServicioTaxi.peticionTaxi, ServicioTaxi.peticionRespuesta> getPedirTaxiMethod;
    if ((getPedirTaxiMethod = taxiServiceGrpc.getPedirTaxiMethod) == null) {
      synchronized (taxiServiceGrpc.class) {
        if ((getPedirTaxiMethod = taxiServiceGrpc.getPedirTaxiMethod) == null) {
          taxiServiceGrpc.getPedirTaxiMethod = getPedirTaxiMethod = 
              io.grpc.MethodDescriptor.<ServicioTaxi.peticionTaxi, ServicioTaxi.peticionRespuesta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taxiService", "pedirTaxi"))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListaServiciosMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ServicioTaxi.Empty,
      ServicioTaxi.serviciosDeTaxi> METHOD_LISTA_SERVICIOS = getListaServiciosMethod();

  private static volatile io.grpc.MethodDescriptor<ServicioTaxi.Empty,
      ServicioTaxi.serviciosDeTaxi> getListaServiciosMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ServicioTaxi.Empty,
      ServicioTaxi.serviciosDeTaxi> getListaServiciosMethod() {
    io.grpc.MethodDescriptor<ServicioTaxi.Empty, ServicioTaxi.serviciosDeTaxi> getListaServiciosMethod;
    if ((getListaServiciosMethod = taxiServiceGrpc.getListaServiciosMethod) == null) {
      synchronized (taxiServiceGrpc.class) {
        if ((getListaServiciosMethod = taxiServiceGrpc.getListaServiciosMethod) == null) {
          taxiServiceGrpc.getListaServiciosMethod = getListaServiciosMethod = 
              io.grpc.MethodDescriptor.<ServicioTaxi.Empty, ServicioTaxi.serviciosDeTaxi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "taxiService", "listaServicios"))
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
    return new taxiServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static taxiServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new taxiServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static taxiServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new taxiServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public static abstract class taxiServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void pedirTaxi(ServicioTaxi.peticionTaxi request,
        io.grpc.stub.StreamObserver<ServicioTaxi.peticionRespuesta> responseObserver) {
      asyncUnimplementedUnaryCall(getPedirTaxiMethod(), responseObserver);
    }

    /**
     */
    public void listaServicios(ServicioTaxi.Empty request,
        io.grpc.stub.StreamObserver<ServicioTaxi.serviciosDeTaxi> responseObserver) {
      asyncUnimplementedUnaryCall(getListaServiciosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPedirTaxiMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ServicioTaxi.peticionTaxi,
                ServicioTaxi.peticionRespuesta>(
                  this, METHODID_PEDIR_TAXI)))
          .addMethod(
            getListaServiciosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ServicioTaxi.Empty,
                ServicioTaxi.serviciosDeTaxi>(
                  this, METHODID_LISTA_SERVICIOS)))
          .build();
    }
  }

  /**
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public static final class taxiServiceStub extends io.grpc.stub.AbstractStub<taxiServiceStub> {
    private taxiServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private taxiServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taxiServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new taxiServiceStub(channel, callOptions);
    }

    /**
     */
    public void pedirTaxi(ServicioTaxi.peticionTaxi request,
        io.grpc.stub.StreamObserver<ServicioTaxi.peticionRespuesta> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPedirTaxiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listaServicios(ServicioTaxi.Empty request,
        io.grpc.stub.StreamObserver<ServicioTaxi.serviciosDeTaxi> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListaServiciosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public static final class taxiServiceBlockingStub extends io.grpc.stub.AbstractStub<taxiServiceBlockingStub> {
    private taxiServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private taxiServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taxiServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new taxiServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ServicioTaxi.peticionRespuesta pedirTaxi(ServicioTaxi.peticionTaxi request) {
      return blockingUnaryCall(
          getChannel(), getPedirTaxiMethod(), getCallOptions(), request);
    }

    /**
     */
    public ServicioTaxi.serviciosDeTaxi listaServicios(ServicioTaxi.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListaServiciosMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Servicio de taxis
   * </pre>
   */
  public static final class taxiServiceFutureStub extends io.grpc.stub.AbstractStub<taxiServiceFutureStub> {
    private taxiServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private taxiServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected taxiServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new taxiServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioTaxi.peticionRespuesta> pedirTaxi(
        ServicioTaxi.peticionTaxi request) {
      return futureUnaryCall(
          getChannel().newCall(getPedirTaxiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioTaxi.serviciosDeTaxi> listaServicios(
        ServicioTaxi.Empty request) {
      return futureUnaryCall(
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
    private final taxiServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(taxiServiceImplBase serviceImpl, int methodId) {
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
    private final String methodName;

    taxiServiceMethodDescriptorSupplier(String methodName) {
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
