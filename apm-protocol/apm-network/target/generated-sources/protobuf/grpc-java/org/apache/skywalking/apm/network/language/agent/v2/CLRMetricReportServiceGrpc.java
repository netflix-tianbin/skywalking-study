package org.apache.skywalking.apm.network.language.agent.v2;

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
    comments = "Source: language-agent-v2/CLRMetric.proto")
public final class CLRMetricReportServiceGrpc {

  private CLRMetricReportServiceGrpc() {}

  public static final String SERVICE_NAME = "CLRMetricReportService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCollectMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection,
      org.apache.skywalking.apm.network.common.Commands> METHOD_COLLECT = getCollectMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection,
      org.apache.skywalking.apm.network.common.Commands> getCollectMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection,
      org.apache.skywalking.apm.network.common.Commands> getCollectMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection, org.apache.skywalking.apm.network.common.Commands> getCollectMethod;
    if ((getCollectMethod = CLRMetricReportServiceGrpc.getCollectMethod) == null) {
      synchronized (CLRMetricReportServiceGrpc.class) {
        if ((getCollectMethod = CLRMetricReportServiceGrpc.getCollectMethod) == null) {
          CLRMetricReportServiceGrpc.getCollectMethod = getCollectMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection, org.apache.skywalking.apm.network.common.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CLRMetricReportService", "collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.Commands.getDefaultInstance()))
                  .setSchemaDescriptor(new CLRMetricReportServiceMethodDescriptorSupplier("collect"))
                  .build();
          }
        }
     }
     return getCollectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CLRMetricReportServiceStub newStub(io.grpc.Channel channel) {
    return new CLRMetricReportServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CLRMetricReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CLRMetricReportServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CLRMetricReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CLRMetricReportServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CLRMetricReportServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void collect(org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      asyncUnimplementedUnaryCall(getCollectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection,
                org.apache.skywalking.apm.network.common.Commands>(
                  this, METHODID_COLLECT)))
          .build();
    }
  }

  /**
   */
  public static final class CLRMetricReportServiceStub extends io.grpc.stub.AbstractStub<CLRMetricReportServiceStub> {
    private CLRMetricReportServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CLRMetricReportServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CLRMetricReportServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CLRMetricReportServiceStub(channel, callOptions);
    }

    /**
     */
    public void collect(org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CLRMetricReportServiceBlockingStub extends io.grpc.stub.AbstractStub<CLRMetricReportServiceBlockingStub> {
    private CLRMetricReportServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CLRMetricReportServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CLRMetricReportServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CLRMetricReportServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.common.Commands collect(org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection request) {
      return blockingUnaryCall(
          getChannel(), getCollectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CLRMetricReportServiceFutureStub extends io.grpc.stub.AbstractStub<CLRMetricReportServiceFutureStub> {
    private CLRMetricReportServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CLRMetricReportServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CLRMetricReportServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CLRMetricReportServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.common.Commands> collect(
        org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection request) {
      return futureUnaryCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_COLLECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CLRMetricReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CLRMetricReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT:
          serviceImpl.collect((org.apache.skywalking.apm.network.language.agent.v2.CLRMetricCollection) request,
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

  private static abstract class CLRMetricReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CLRMetricReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v2.CLRMetric.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CLRMetricReportService");
    }
  }

  private static final class CLRMetricReportServiceFileDescriptorSupplier
      extends CLRMetricReportServiceBaseDescriptorSupplier {
    CLRMetricReportServiceFileDescriptorSupplier() {}
  }

  private static final class CLRMetricReportServiceMethodDescriptorSupplier
      extends CLRMetricReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CLRMetricReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CLRMetricReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CLRMetricReportServiceFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
