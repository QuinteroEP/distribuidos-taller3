import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Servicio de usuarios
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: servicioUsuario.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class userServiceGrpc {

  private userServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "userService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ServicioUsuario.datosUsuario,
      ServicioUsuario.success> getRegistrarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registrar",
      requestType = ServicioUsuario.datosUsuario.class,
      responseType = ServicioUsuario.success.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ServicioUsuario.datosUsuario,
      ServicioUsuario.success> getRegistrarMethod() {
    io.grpc.MethodDescriptor<ServicioUsuario.datosUsuario, ServicioUsuario.success> getRegistrarMethod;
    if ((getRegistrarMethod = userServiceGrpc.getRegistrarMethod) == null) {
      synchronized (userServiceGrpc.class) {
        if ((getRegistrarMethod = userServiceGrpc.getRegistrarMethod) == null) {
          userServiceGrpc.getRegistrarMethod = getRegistrarMethod =
              io.grpc.MethodDescriptor.<ServicioUsuario.datosUsuario, ServicioUsuario.success>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registrar"))
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
    io.grpc.stub.AbstractStub.StubFactory<userServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userServiceStub>() {
        @java.lang.Override
        public userServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userServiceStub(channel, callOptions);
        }
      };
    return userServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userServiceBlockingStub>() {
        @java.lang.Override
        public userServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userServiceBlockingStub(channel, callOptions);
        }
      };
    return userServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static userServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<userServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<userServiceFutureStub>() {
        @java.lang.Override
        public userServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new userServiceFutureStub(channel, callOptions);
        }
      };
    return userServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void registrar(ServicioUsuario.datosUsuario request,
        io.grpc.stub.StreamObserver<ServicioUsuario.success> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegistrarMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service userService.
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public static abstract class userServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return userServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service userService.
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public static final class userServiceStub
      extends io.grpc.stub.AbstractAsyncStub<userServiceStub> {
    private userServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userServiceStub(channel, callOptions);
    }

    /**
     */
    public void registrar(ServicioUsuario.datosUsuario request,
        io.grpc.stub.StreamObserver<ServicioUsuario.success> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegistrarMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service userService.
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public static final class userServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<userServiceBlockingStub> {
    private userServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ServicioUsuario.success registrar(ServicioUsuario.datosUsuario request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegistrarMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service userService.
   * <pre>
   * Servicio de usuarios
   * </pre>
   */
  public static final class userServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<userServiceFutureStub> {
    private userServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new userServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ServicioUsuario.success> registrar(
        ServicioUsuario.datosUsuario request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegistrarMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRAR = 0;

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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegistrarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ServicioUsuario.datosUsuario,
              ServicioUsuario.success>(
                service, METHODID_REGISTRAR)))
        .build();
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
    private final java.lang.String methodName;

    userServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
