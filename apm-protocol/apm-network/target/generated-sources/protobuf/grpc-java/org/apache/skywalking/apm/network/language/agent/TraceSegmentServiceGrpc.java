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
    comments = "Source: language-agent/TraceSegmentService.proto")
public final class TraceSegmentServiceGrpc {

  private TraceSegmentServiceGrpc() {}

  public static final String SERVICE_NAME = "TraceSegmentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCollectMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.UpstreamSegment,
      org.apache.skywalking.apm.network.language.agent.Downstream> METHOD_COLLECT = getCollectMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.UpstreamSegment,
      org.apache.skywalking.apm.network.language.agent.Downstream> getCollectMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.UpstreamSegment,
      org.apache.skywalking.apm.network.language.agent.Downstream> getCollectMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.UpstreamSegment, org.apache.skywalking.apm.network.language.agent.Downstream> getCollectMethod;
    if ((getCollectMethod = TraceSegmentServiceGrpc.getCollectMethod) == null) {
      synchronized (TraceSegmentServiceGrpc.class) {
        if ((getCollectMethod = TraceSegmentServiceGrpc.getCollectMethod) == null) {
          TraceSegmentServiceGrpc.getCollectMethod = getCollectMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.UpstreamSegment, org.apache.skywalking.apm.network.language.agent.Downstream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TraceSegmentService", "collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.UpstreamSegment.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.Downstream.getDefaultInstance()))
                  .setSchemaDescriptor(new TraceSegmentServiceMethodDescriptorSupplier("collect"))
                  .build();
          }
        }
     }
     return getCollectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TraceSegmentServiceStub newStub(io.grpc.Channel channel) {
    return new TraceSegmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TraceSegmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TraceSegmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TraceSegmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TraceSegmentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TraceSegmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.UpstreamSegment> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.Downstream> responseObserver) {
      return asyncUnimplementedStreamingCall(getCollectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.UpstreamSegment,
                org.apache.skywalking.apm.network.language.agent.Downstream>(
                  this, METHODID_COLLECT)))
          .build();
    }
  }

  /**
   */
  public static final class TraceSegmentServiceStub extends io.grpc.stub.AbstractStub<TraceSegmentServiceStub> {
    private TraceSegmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceSegmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.UpstreamSegment> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.Downstream> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TraceSegmentServiceBlockingStub extends io.grpc.stub.AbstractStub<TraceSegmentServiceBlockingStub> {
    private TraceSegmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceSegmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class TraceSegmentServiceFutureStub extends io.grpc.stub.AbstractStub<TraceSegmentServiceFutureStub> {
    private TraceSegmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TraceSegmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TraceSegmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TraceSegmentServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COLLECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TraceSegmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TraceSegmentServiceImplBase serviceImpl, int methodId) {
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
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.Downstream>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TraceSegmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TraceSegmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.TraceSegmentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TraceSegmentService");
    }
  }

  private static final class TraceSegmentServiceFileDescriptorSupplier
      extends TraceSegmentServiceBaseDescriptorSupplier {
    TraceSegmentServiceFileDescriptorSupplier() {}
  }

  private static final class TraceSegmentServiceMethodDescriptorSupplier
      extends TraceSegmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TraceSegmentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TraceSegmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TraceSegmentServiceFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
