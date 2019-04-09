package org.apache.skywalking.apm.network.language.agent;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: language-agent/DiscoveryService.proto")
public final class InstanceDiscoveryServiceGrpc {

  private InstanceDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "InstanceDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegisterInstanceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ApplicationInstance,
      org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping> METHOD_REGISTER_INSTANCE = getRegisterInstanceMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ApplicationInstance,
      org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping> getRegisterInstanceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ApplicationInstance,
      org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping> getRegisterInstanceMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ApplicationInstance, org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping> getRegisterInstanceMethod;
    if ((getRegisterInstanceMethod = InstanceDiscoveryServiceGrpc.getRegisterInstanceMethod) == null) {
      synchronized (InstanceDiscoveryServiceGrpc.class) {
        if ((getRegisterInstanceMethod = InstanceDiscoveryServiceGrpc.getRegisterInstanceMethod) == null) {
          InstanceDiscoveryServiceGrpc.getRegisterInstanceMethod = getRegisterInstanceMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.ApplicationInstance, org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InstanceDiscoveryService", "registerInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.ApplicationInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping.getDefaultInstance()))
                  .setSchemaDescriptor(new InstanceDiscoveryServiceMethodDescriptorSupplier("registerInstance"))
                  .build();
          }
        }
     }
     return getRegisterInstanceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getHeartbeatMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat,
      org.apache.skywalking.apm.network.language.agent.Downstream> METHOD_HEARTBEAT = getHeartbeatMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat,
      org.apache.skywalking.apm.network.language.agent.Downstream> getHeartbeatMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat,
      org.apache.skywalking.apm.network.language.agent.Downstream> getHeartbeatMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat, org.apache.skywalking.apm.network.language.agent.Downstream> getHeartbeatMethod;
    if ((getHeartbeatMethod = InstanceDiscoveryServiceGrpc.getHeartbeatMethod) == null) {
      synchronized (InstanceDiscoveryServiceGrpc.class) {
        if ((getHeartbeatMethod = InstanceDiscoveryServiceGrpc.getHeartbeatMethod) == null) {
          InstanceDiscoveryServiceGrpc.getHeartbeatMethod = getHeartbeatMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat, org.apache.skywalking.apm.network.language.agent.Downstream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "InstanceDiscoveryService", "heartbeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.Downstream.getDefaultInstance()))
                  .setSchemaDescriptor(new InstanceDiscoveryServiceMethodDescriptorSupplier("heartbeat"))
                  .build();
          }
        }
     }
     return getHeartbeatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InstanceDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    return new InstanceDiscoveryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InstanceDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new InstanceDiscoveryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InstanceDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new InstanceDiscoveryServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class InstanceDiscoveryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerInstance(org.apache.skywalking.apm.network.language.agent.ApplicationInstance request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterInstanceMethod(), responseObserver);
    }

    /**
     */
    public void heartbeat(org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.Downstream> responseObserver) {
      asyncUnimplementedUnaryCall(getHeartbeatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.ApplicationInstance,
                org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping>(
                  this, METHODID_REGISTER_INSTANCE)))
          .addMethod(
            getHeartbeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat,
                org.apache.skywalking.apm.network.language.agent.Downstream>(
                  this, METHODID_HEARTBEAT)))
          .build();
    }
  }

  /**
   */
  public static final class InstanceDiscoveryServiceStub extends io.grpc.stub.AbstractStub<InstanceDiscoveryServiceStub> {
    private InstanceDiscoveryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceDiscoveryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceDiscoveryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceDiscoveryServiceStub(channel, callOptions);
    }

    /**
     */
    public void registerInstance(org.apache.skywalking.apm.network.language.agent.ApplicationInstance request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void heartbeat(org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.Downstream> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InstanceDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractStub<InstanceDiscoveryServiceBlockingStub> {
    private InstanceDiscoveryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceDiscoveryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceDiscoveryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceDiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping registerInstance(org.apache.skywalking.apm.network.language.agent.ApplicationInstance request) {
      return blockingUnaryCall(
          getChannel(), getRegisterInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.skywalking.apm.network.language.agent.Downstream heartbeat(org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat request) {
      return blockingUnaryCall(
          getChannel(), getHeartbeatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InstanceDiscoveryServiceFutureStub extends io.grpc.stub.AbstractStub<InstanceDiscoveryServiceFutureStub> {
    private InstanceDiscoveryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private InstanceDiscoveryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InstanceDiscoveryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new InstanceDiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping> registerInstance(
        org.apache.skywalking.apm.network.language.agent.ApplicationInstance request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.language.agent.Downstream> heartbeat(
        org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat request) {
      return futureUnaryCall(
          getChannel().newCall(getHeartbeatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_INSTANCE = 0;
  private static final int METHODID_HEARTBEAT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InstanceDiscoveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InstanceDiscoveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_INSTANCE:
          serviceImpl.registerInstance((org.apache.skywalking.apm.network.language.agent.ApplicationInstance) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ApplicationInstanceMapping>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((org.apache.skywalking.apm.network.language.agent.ApplicationInstanceHeartbeat) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.Downstream>) responseObserver);
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

  private static abstract class InstanceDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InstanceDiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.DiscoveryService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InstanceDiscoveryService");
    }
  }

  private static final class InstanceDiscoveryServiceFileDescriptorSupplier
      extends InstanceDiscoveryServiceBaseDescriptorSupplier {
    InstanceDiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class InstanceDiscoveryServiceMethodDescriptorSupplier
      extends InstanceDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InstanceDiscoveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InstanceDiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InstanceDiscoveryServiceFileDescriptorSupplier())
              .addMethod(getRegisterInstanceMethod())
              .addMethod(getHeartbeatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
