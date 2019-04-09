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
    comments = "Source: language-agent/NetworkAddressRegisterService.proto")
public final class NetworkAddressRegisterServiceGrpc {

  private NetworkAddressRegisterServiceGrpc() {}

  public static final String SERVICE_NAME = "NetworkAddressRegisterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getBatchRegisterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.NetworkAddresses,
      org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings> METHOD_BATCH_REGISTER = getBatchRegisterMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.NetworkAddresses,
      org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings> getBatchRegisterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.NetworkAddresses,
      org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings> getBatchRegisterMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.NetworkAddresses, org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings> getBatchRegisterMethod;
    if ((getBatchRegisterMethod = NetworkAddressRegisterServiceGrpc.getBatchRegisterMethod) == null) {
      synchronized (NetworkAddressRegisterServiceGrpc.class) {
        if ((getBatchRegisterMethod = NetworkAddressRegisterServiceGrpc.getBatchRegisterMethod) == null) {
          NetworkAddressRegisterServiceGrpc.getBatchRegisterMethod = getBatchRegisterMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.NetworkAddresses, org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NetworkAddressRegisterService", "batchRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.NetworkAddresses.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings.getDefaultInstance()))
                  .setSchemaDescriptor(new NetworkAddressRegisterServiceMethodDescriptorSupplier("batchRegister"))
                  .build();
          }
        }
     }
     return getBatchRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkAddressRegisterServiceStub newStub(io.grpc.Channel channel) {
    return new NetworkAddressRegisterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkAddressRegisterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetworkAddressRegisterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkAddressRegisterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetworkAddressRegisterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NetworkAddressRegisterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void batchRegister(org.apache.skywalking.apm.network.language.agent.NetworkAddresses request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchRegisterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBatchRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.NetworkAddresses,
                org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings>(
                  this, METHODID_BATCH_REGISTER)))
          .build();
    }
  }

  /**
   */
  public static final class NetworkAddressRegisterServiceStub extends io.grpc.stub.AbstractStub<NetworkAddressRegisterServiceStub> {
    private NetworkAddressRegisterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkAddressRegisterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkAddressRegisterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkAddressRegisterServiceStub(channel, callOptions);
    }

    /**
     */
    public void batchRegister(org.apache.skywalking.apm.network.language.agent.NetworkAddresses request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NetworkAddressRegisterServiceBlockingStub extends io.grpc.stub.AbstractStub<NetworkAddressRegisterServiceBlockingStub> {
    private NetworkAddressRegisterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkAddressRegisterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkAddressRegisterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkAddressRegisterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings batchRegister(org.apache.skywalking.apm.network.language.agent.NetworkAddresses request) {
      return blockingUnaryCall(
          getChannel(), getBatchRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NetworkAddressRegisterServiceFutureStub extends io.grpc.stub.AbstractStub<NetworkAddressRegisterServiceFutureStub> {
    private NetworkAddressRegisterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetworkAddressRegisterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkAddressRegisterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetworkAddressRegisterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings> batchRegister(
        org.apache.skywalking.apm.network.language.agent.NetworkAddresses request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCH_REGISTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkAddressRegisterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkAddressRegisterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BATCH_REGISTER:
          serviceImpl.batchRegister((org.apache.skywalking.apm.network.language.agent.NetworkAddresses) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.NetworkAddressMappings>) responseObserver);
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

  private static abstract class NetworkAddressRegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkAddressRegisterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.NetworkAddressRegisterServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkAddressRegisterService");
    }
  }

  private static final class NetworkAddressRegisterServiceFileDescriptorSupplier
      extends NetworkAddressRegisterServiceBaseDescriptorSupplier {
    NetworkAddressRegisterServiceFileDescriptorSupplier() {}
  }

  private static final class NetworkAddressRegisterServiceMethodDescriptorSupplier
      extends NetworkAddressRegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkAddressRegisterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkAddressRegisterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkAddressRegisterServiceFileDescriptorSupplier())
              .addMethod(getBatchRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
