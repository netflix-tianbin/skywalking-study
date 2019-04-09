package org.apache.skywalking.apm.network.register.v2;

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
    comments = "Source: register/InstancePing.proto")
public final class ServiceInstancePingGrpc {

  private ServiceInstancePingGrpc() {}

  public static final String SERVICE_NAME = "ServiceInstancePing";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDoPingMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg,
      org.apache.skywalking.apm.network.common.Commands> METHOD_DO_PING = getDoPingMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg,
      org.apache.skywalking.apm.network.common.Commands> getDoPingMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg,
      org.apache.skywalking.apm.network.common.Commands> getDoPingMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg, org.apache.skywalking.apm.network.common.Commands> getDoPingMethod;
    if ((getDoPingMethod = ServiceInstancePingGrpc.getDoPingMethod) == null) {
      synchronized (ServiceInstancePingGrpc.class) {
        if ((getDoPingMethod = ServiceInstancePingGrpc.getDoPingMethod) == null) {
          ServiceInstancePingGrpc.getDoPingMethod = getDoPingMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg, org.apache.skywalking.apm.network.common.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceInstancePing", "doPing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.Commands.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceInstancePingMethodDescriptorSupplier("doPing"))
                  .build();
          }
        }
     }
     return getDoPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceInstancePingStub newStub(io.grpc.Channel channel) {
    return new ServiceInstancePingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceInstancePingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceInstancePingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceInstancePingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceInstancePingFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceInstancePingImplBase implements io.grpc.BindableService {

    /**
     */
    public void doPing(org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      asyncUnimplementedUnaryCall(getDoPingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg,
                org.apache.skywalking.apm.network.common.Commands>(
                  this, METHODID_DO_PING)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceInstancePingStub extends io.grpc.stub.AbstractStub<ServiceInstancePingStub> {
    private ServiceInstancePingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceInstancePingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceInstancePingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceInstancePingStub(channel, callOptions);
    }

    /**
     */
    public void doPing(org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceInstancePingBlockingStub extends io.grpc.stub.AbstractStub<ServiceInstancePingBlockingStub> {
    private ServiceInstancePingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceInstancePingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceInstancePingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceInstancePingBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.common.Commands doPing(org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg request) {
      return blockingUnaryCall(
          getChannel(), getDoPingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceInstancePingFutureStub extends io.grpc.stub.AbstractStub<ServiceInstancePingFutureStub> {
    private ServiceInstancePingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceInstancePingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceInstancePingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceInstancePingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.common.Commands> doPing(
        org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg request) {
      return futureUnaryCall(
          getChannel().newCall(getDoPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_PING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceInstancePingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceInstancePingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_PING:
          serviceImpl.doPing((org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands>) responseObserver);
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

  private static abstract class ServiceInstancePingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceInstancePingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.register.v2.InstancePing.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceInstancePing");
    }
  }

  private static final class ServiceInstancePingFileDescriptorSupplier
      extends ServiceInstancePingBaseDescriptorSupplier {
    ServiceInstancePingFileDescriptorSupplier() {}
  }

  private static final class ServiceInstancePingMethodDescriptorSupplier
      extends ServiceInstancePingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceInstancePingMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceInstancePingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceInstancePingFileDescriptorSupplier())
              .addMethod(getDoPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
