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
    comments = "Source: language-agent-v2/JVMMetric.proto")
public final class JVMMetricReportServiceGrpc {

  private JVMMetricReportServiceGrpc() {}

  public static final String SERVICE_NAME = "JVMMetricReportService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCollectMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection,
      org.apache.skywalking.apm.network.common.Commands> METHOD_COLLECT = getCollectMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection,
      org.apache.skywalking.apm.network.common.Commands> getCollectMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection,
      org.apache.skywalking.apm.network.common.Commands> getCollectMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection, org.apache.skywalking.apm.network.common.Commands> getCollectMethod;
    if ((getCollectMethod = JVMMetricReportServiceGrpc.getCollectMethod) == null) {
      synchronized (JVMMetricReportServiceGrpc.class) {
        if ((getCollectMethod = JVMMetricReportServiceGrpc.getCollectMethod) == null) {
          JVMMetricReportServiceGrpc.getCollectMethod = getCollectMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection, org.apache.skywalking.apm.network.common.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "JVMMetricReportService", "collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.Commands.getDefaultInstance()))
                  .setSchemaDescriptor(new JVMMetricReportServiceMethodDescriptorSupplier("collect"))
                  .build();
          }
        }
     }
     return getCollectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JVMMetricReportServiceStub newStub(io.grpc.Channel channel) {
    return new JVMMetricReportServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JVMMetricReportServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JVMMetricReportServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JVMMetricReportServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JVMMetricReportServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JVMMetricReportServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void collect(org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      asyncUnimplementedUnaryCall(getCollectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection,
                org.apache.skywalking.apm.network.common.Commands>(
                  this, METHODID_COLLECT)))
          .build();
    }
  }

  /**
   */
  public static final class JVMMetricReportServiceStub extends io.grpc.stub.AbstractStub<JVMMetricReportServiceStub> {
    private JVMMetricReportServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricReportServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JVMMetricReportServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricReportServiceStub(channel, callOptions);
    }

    /**
     */
    public void collect(org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JVMMetricReportServiceBlockingStub extends io.grpc.stub.AbstractStub<JVMMetricReportServiceBlockingStub> {
    private JVMMetricReportServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricReportServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JVMMetricReportServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricReportServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.common.Commands collect(org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection request) {
      return blockingUnaryCall(
          getChannel(), getCollectMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JVMMetricReportServiceFutureStub extends io.grpc.stub.AbstractStub<JVMMetricReportServiceFutureStub> {
    private JVMMetricReportServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JVMMetricReportServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JVMMetricReportServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JVMMetricReportServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.common.Commands> collect(
        org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection request) {
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
    private final JVMMetricReportServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JVMMetricReportServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_COLLECT:
          serviceImpl.collect((org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection) request,
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

  private static abstract class JVMMetricReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JVMMetricReportServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v2.JVMMetric.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JVMMetricReportService");
    }
  }

  private static final class JVMMetricReportServiceFileDescriptorSupplier
      extends JVMMetricReportServiceBaseDescriptorSupplier {
    JVMMetricReportServiceFileDescriptorSupplier() {}
  }

  private static final class JVMMetricReportServiceMethodDescriptorSupplier
      extends JVMMetricReportServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JVMMetricReportServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JVMMetricReportServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JVMMetricReportServiceFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
