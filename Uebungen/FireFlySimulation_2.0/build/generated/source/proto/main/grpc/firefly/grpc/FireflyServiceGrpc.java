package firefly.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: firefly.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FireflyServiceGrpc {

  private FireflyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "FireflyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<firefly.grpc.FireflyProto.FireflyRequest,
      firefly.grpc.FireflyProto.FireflyReply> getNotifyFireflyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "notifyFirefly",
      requestType = firefly.grpc.FireflyProto.FireflyRequest.class,
      responseType = firefly.grpc.FireflyProto.FireflyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<firefly.grpc.FireflyProto.FireflyRequest,
      firefly.grpc.FireflyProto.FireflyReply> getNotifyFireflyMethod() {
    io.grpc.MethodDescriptor<firefly.grpc.FireflyProto.FireflyRequest, firefly.grpc.FireflyProto.FireflyReply> getNotifyFireflyMethod;
    if ((getNotifyFireflyMethod = FireflyServiceGrpc.getNotifyFireflyMethod) == null) {
      synchronized (FireflyServiceGrpc.class) {
        if ((getNotifyFireflyMethod = FireflyServiceGrpc.getNotifyFireflyMethod) == null) {
          FireflyServiceGrpc.getNotifyFireflyMethod = getNotifyFireflyMethod =
              io.grpc.MethodDescriptor.<firefly.grpc.FireflyProto.FireflyRequest, firefly.grpc.FireflyProto.FireflyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "notifyFirefly"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  firefly.grpc.FireflyProto.FireflyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  firefly.grpc.FireflyProto.FireflyReply.getDefaultInstance()))
              .setSchemaDescriptor(new FireflyServiceMethodDescriptorSupplier("notifyFirefly"))
              .build();
        }
      }
    }
    return getNotifyFireflyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FireflyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FireflyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FireflyServiceStub>() {
        @java.lang.Override
        public FireflyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FireflyServiceStub(channel, callOptions);
        }
      };
    return FireflyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FireflyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FireflyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FireflyServiceBlockingStub>() {
        @java.lang.Override
        public FireflyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FireflyServiceBlockingStub(channel, callOptions);
        }
      };
    return FireflyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FireflyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FireflyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FireflyServiceFutureStub>() {
        @java.lang.Override
        public FireflyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FireflyServiceFutureStub(channel, callOptions);
        }
      };
    return FireflyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void notifyFirefly(firefly.grpc.FireflyProto.FireflyRequest request,
        io.grpc.stub.StreamObserver<firefly.grpc.FireflyProto.FireflyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNotifyFireflyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FireflyService.
   */
  public static abstract class FireflyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FireflyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FireflyService.
   */
  public static final class FireflyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FireflyServiceStub> {
    private FireflyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FireflyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FireflyServiceStub(channel, callOptions);
    }

    /**
     */
    public void notifyFirefly(firefly.grpc.FireflyProto.FireflyRequest request,
        io.grpc.stub.StreamObserver<firefly.grpc.FireflyProto.FireflyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNotifyFireflyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FireflyService.
   */
  public static final class FireflyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FireflyServiceBlockingStub> {
    private FireflyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FireflyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FireflyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public firefly.grpc.FireflyProto.FireflyReply notifyFirefly(firefly.grpc.FireflyProto.FireflyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNotifyFireflyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FireflyService.
   */
  public static final class FireflyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FireflyServiceFutureStub> {
    private FireflyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FireflyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FireflyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<firefly.grpc.FireflyProto.FireflyReply> notifyFirefly(
        firefly.grpc.FireflyProto.FireflyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNotifyFireflyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY_FIREFLY = 0;

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
        case METHODID_NOTIFY_FIREFLY:
          serviceImpl.notifyFirefly((firefly.grpc.FireflyProto.FireflyRequest) request,
              (io.grpc.stub.StreamObserver<firefly.grpc.FireflyProto.FireflyReply>) responseObserver);
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
          getNotifyFireflyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              firefly.grpc.FireflyProto.FireflyRequest,
              firefly.grpc.FireflyProto.FireflyReply>(
                service, METHODID_NOTIFY_FIREFLY)))
        .build();
  }

  private static abstract class FireflyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FireflyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return firefly.grpc.FireflyProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FireflyService");
    }
  }

  private static final class FireflyServiceFileDescriptorSupplier
      extends FireflyServiceBaseDescriptorSupplier {
    FireflyServiceFileDescriptorSupplier() {}
  }

  private static final class FireflyServiceMethodDescriptorSupplier
      extends FireflyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FireflyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FireflyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FireflyServiceFileDescriptorSupplier())
              .addMethod(getNotifyFireflyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
