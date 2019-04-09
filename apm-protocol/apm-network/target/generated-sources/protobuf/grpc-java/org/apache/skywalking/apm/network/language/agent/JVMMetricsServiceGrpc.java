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
    comments = "Source: language-agent/JVMMetricsService.proto")
public final class JVMMetricsServiceGrpc {

  private JVMMetricsServiceGrpc() {}

  public static final String SERVICE_NAME = "JVMMetricsService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCollectMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.JVMMetrics,
      org.apache.skywalking.apm.network.language.agent.Downstream> METHOD_COLLECT = getCollectMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.JVMMetrics,
      org.apache.skywalking.apm.network.language.agent.Downstream> getCollectMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.JVMMetrics,
      org.apache.skywalking.apm.network.language.agent.Downstream> getCollectMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.JVMMetrics, org.apache.skywalking.apm.network.language.agent.Downstream> getCollectMethod;
    if ((getCollectMethod = JVMMetricsServiceGrpc.getCollectMethod) == null) {
      synchronized (JVMMetricsServiceGrpc.class) {
        if ((getCollectMethod = JVMMetricsServiceGrpc.getCollectMethod) == null) {
          JVMMetricsServiceGrpc.getCollectMethod = getCollectMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.JVMMetrics, org.apache.skywalking.apm.network.language.agent.Downstream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "JVMMetricsService", "collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.JVMMetrics.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.Downstream.getDefaultInstance()))
                  .setSchemaDescriptor(new JVMMetricsServiceMethodDescriptorSupplier("collect"))
                  .build();
          }
        }
     }
     return getCollectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JVMMetricsServiceStub newStub(io.grpc.Channel channel) {
    return new JVMMetricsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JVMMetricsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JVMMetricsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JVMMetricsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JVMMetricsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JVMMetricsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void collect(org.apache.skywalking.apm.network.language.agent.JVMMetrics request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.Downstream> responseObserver) {
      asyncUnimplementedUnaryCall(getCollectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.JVMMetrics,
                org.apache.skywalking.apm.network.language.agent.Downstream>(
                  this, METHODID_COLLECT)))
          .build();
    }
  }

  /**
   */
  public static final class JVMMetricsServiceStub extends io.grpc.stub.AbstractStub<JVMMetricsServiceStub> {
    private JVMMetricsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JVMMetricsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricsServiceStub(channel, callOptions);
    }

    /**
     */
    public void collect(org.apache.skywalking.apm.network.language.agent.JVMMetrics request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.Downstream> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JVMMetricsServiceBlockingStub extends io.grpc.stub.AbstractStub<JVMMetricsServiceBlockingStub> {
    private JVMMetricsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JVMMetricsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.language.agent.Downstream collect(org.apache.skywalking.apm.network.language.agent.JVMMetrics request) {
      return blockingUnaryCall(
          getChannel(), getCollectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JVMMetricsServiceFutureStub extends io.grpc.stub.AbstractStub<JVMMetricsServiceFutureStub> {
    private JVMMetricsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JVMMetricsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.language.agent.Downstream> collect(
        org.apache.skywalking.apm.network.language.agent.JVMMetrics request) {
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
    private final JVMMetricsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JVMMetricsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT:
          serviceImpl.collect((org.apache.skywalking.apm.network.language.agent.JVMMetrics) request,
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

  private static abstract class JVMMetricsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JVMMetricsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.JVMMetricsServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JVMMetricsService");
    }
  }

  private static final class JVMMetricsServiceFileDescriptorSupplier
      extends JVMMetricsServiceBaseDescriptorSupplier {
    JVMMetricsServiceFileDescriptorSupplier() {}
  }

  private static final class JVMMetricsServiceMethodDescriptorSupplier
      extends JVMMetricsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JVMMetricsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JVMMetricsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JVMMetricsServiceFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
