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
    comments = "Source: language-agent-v2/trace.proto")
public final class TraceSegmentReportServiceGrpc {

  private TraceSegmentReportServiceGrpc() {}

  public static final String SERVICE_NAME = "TraceSegmentReportService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCollectMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.UpstreamSegment,
      org.apache.skywalking.apm.network.common.Commands> METHOD_COLLECT = getCollectMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.UpstreamSegment,
      org.apache.skywalking.apm.network.common.Commands> getCollectMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.UpstreamSegment,
      org.apache.skywalking.apm.network.common.Commands> getCollectMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.UpstreamSegment, org.apache.skywalking.apm.network.common.Commands> getCollectMethod;
    if ((getCollectMethod = TraceSegmentReportServiceGrpc.getCollectMethod) == null) {
      synchronized (TraceSegmentReportServiceGrpc.class) {
        if ((getCollectMethod = TraceSegmentReportServiceGrpc.getCollectMethod) == null) {
          TraceSegmentReportServiceGrpc.getCollectMethod = getCollectMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.UpstreamSegment, org.apache.skywalking.apm.network.common.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TraceSegmentReportService", "collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.UpstreamSegment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.Commands.getDefaultInstance()))
                  .setSchemaDescriptor(new TraceSegmentReportServiceMethodDescriptorSupplier("collect"))
                  .build();
          }
        }
     }
     return getCollectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TraceSegmentReportServiceStub newStub(io.grpc.Channel channel) {
    return new TraceSegmentReportServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TraceSegmentReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TraceSegmentReportServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TraceSegmentReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TraceSegmentReportServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TraceSegmentReportServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.UpstreamSegment> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      return asyncUnimplementedStreamingCall(getCollectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.UpstreamSegment,
                org.apache.skywalking.apm.network.common.Commands>(
                  this, METHODID_COLLECT)))
          .build();
    }
  }

  /**
   */
  public static final class TraceSegmentReportServiceStub extends io.grpc.stub.AbstractStub<TraceSegmentReportServiceStub> {
    private TraceSegmentReportServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentReportServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceSegmentReportServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentReportServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.UpstreamSegment> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TraceSegmentReportServiceBlockingStub extends io.grpc.stub.AbstractStub<TraceSegmentReportServiceBlockingStub> {
    private TraceSegmentReportServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentReportServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceSegmentReportServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentReportServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class TraceSegmentReportServiceFutureStub extends io.grpc.stub.AbstractStub<TraceSegmentReportServiceFutureStub> {
    private TraceSegmentReportServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentReportServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceSegmentReportServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentReportServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COLLECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TraceSegmentReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TraceSegmentReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.collect(
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TraceSegmentReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TraceSegmentReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v2.Trace.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TraceSegmentReportService");
    }
  }

  private static final class TraceSegmentReportServiceFileDescriptorSupplier
      extends TraceSegmentReportServiceBaseDescriptorSupplier {
    TraceSegmentReportServiceFileDescriptorSupplier() {}
  }

  private static final class TraceSegmentReportServiceMethodDescriptorSupplier
      extends TraceSegmentReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TraceSegmentReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TraceSegmentReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TraceSegmentReportServiceFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
