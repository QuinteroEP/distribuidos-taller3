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
 * Servicio de usuarios
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: myuber/src/main/proto/servicioUsuario.proto")
public final class userServiceGrpc {

  private userServiceGrpc() {}

  public static final String SERVICE_NAME = "userService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegistrarMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ServicioUsuario.datosUsuario,
      ServicioUsuario.success> METHOD_REGISTRAR = getRegistrarMethod();

  private static volatile io.grpc.MethodDescriptor<ServicioUsuario.datosUsuario,
      ServicioUsuario.success> getRegistrarMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ServicioUsuario.datosUsuario,
      ServicioUsuario.success> getRegistrarMethod() {
    io.grpc.MethodDescriptor<ServicioUsuario.datosUsuario, ServicioUsuario.success> getRegistrarMethod;
    if ((getRegistrarMethod = userServiceGrpc.getRegistrarMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getRegistrarMethod = userServiceGrpc.getRegistrarMethod) == null) {
          userServiceGrpc.getRegistrarMethod = getRegistrarMethod = 
              io.grpc.MethodDescriptor.<ServicioUsuario.datosUsuario, ServicioUsuario.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "userService", "registrar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioUsuario.datosUsuario.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServicioUsuario.success.getDefaultInstance()))
                  .setSchemaDescriptor(new userServiceMethodDescriptorSupplier("registrar"))
                  .build();
          }
        }
     }
     return getRegistrarMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userServiceStub newStub(io.grpc.Channel channel) {
    return new userServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public static abstract class userServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registrar(ServicioUsuario.datosUsuario request,
        io.grpc.stub.StreamObserver<ServicioUsuario.success> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrarMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistrarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ServicioUsuario.datosUsuario,
                ServicioUsuario.success>(
                  this, METHODID_REGISTRAR)))
          .build();
    }
  }

  /**
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public static final class userServiceStub extends io.grpc.stub.AbstractStub<userServiceStub> {
    private userServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceStub(channel, callOptions);
    }

    /**
     */
    public void registrar(ServicioUsuario.datosUsuario request,
        io.grpc.stub.StreamObserver<ServicioUsuario.success> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public static final class userServiceBlockingStub extends io.grpc.stub.AbstractStub<userServiceBlockingStub> {
    private userServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ServicioUsuario.success registrar(ServicioUsuario.datosUsuario request) {
      return blockingUnaryCall(
          getChannel(), getRegistrarMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public static final class userServiceFutureStub extends io.grpc.stub.AbstractStub<userServiceFutureStub> {
    private userServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioUsuario.success> registrar(
        ServicioUsuario.datosUsuario request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRAR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRAR:
          serviceImpl.registrar((ServicioUsuario.datosUsuario) request,
              (io.grpc.stub.StreamObserver<ServicioUsuario.success>) responseObserver);
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

  private static abstract class userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    userServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServicioUsuario.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("userService");
    }
  }

  private static final class userServiceFileDescriptorSupplier
      extends userServiceBaseDescriptorSupplier {
    userServiceFileDescriptorSupplier() {}
  }

  private static final class userServiceMethodDescriptorSupplier
      extends userServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    userServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (userServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userServiceFileDescriptorSupplier())
              .addMethod(getRegistrarMethod())
              .build();
        }
      }
    }
    return result;
  }
}
