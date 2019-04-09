package org.apache.skywalking.apm.network.servicemesh;

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
    comments = "Source: service-mesh-probe/service-mesh.proto")
public final class ServiceMeshMetricServiceGrpc {

  private ServiceMeshMetricServiceGrpc() {}

  public static final String SERVICE_NAME = "ServiceMeshMetricService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCollectMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric,
      org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream> METHOD_COLLECT = getCollectMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric,
      org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream> getCollectMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric,
      org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream> getCollectMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric, org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream> getCollectMethod;
    if ((getCollectMethod = ServiceMeshMetricServiceGrpc.getCollectMethod) == null) {
      synchronized (ServiceMeshMetricServiceGrpc.class) {
        if ((getCollectMethod = ServiceMeshMetricServiceGrpc.getCollectMethod) == null) {
          ServiceMeshMetricServiceGrpc.getCollectMethod = getCollectMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric, org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ServiceMeshMetricService", "collect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceMeshMetricServiceMethodDescriptorSupplier("collect"))
                  .build();
          }
        }
     }
     return getCollectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceMeshMetricServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceMeshMetricServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceMeshMetricServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceMeshMetricServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceMeshMetricServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceMeshMetricServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceMeshMetricServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream> responseObserver) {
      return asyncUnimplementedStreamingCall(getCollectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCollectMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric,
                org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream>(
                  this, METHODID_COLLECT)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceMeshMetricServiceStub extends io.grpc.stub.AbstractStub<ServiceMeshMetricServiceStub> {
    private ServiceMeshMetricServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceMeshMetricServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceMeshMetricServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceMeshMetricServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.servicemesh.ServiceMeshMetric> collect(
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCollectMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ServiceMeshMetricServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceMeshMetricServiceBlockingStub> {
    private ServiceMeshMetricServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceMeshMetricServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceMeshMetricServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceMeshMetricServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class ServiceMeshMetricServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceMeshMetricServiceFutureStub> {
    private ServiceMeshMetricServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceMeshMetricServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceMeshMetricServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceMeshMetricServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_COLLECT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceMeshMetricServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceMeshMetricServiceImplBase serviceImpl, int methodId) {
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
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.servicemesh.MeshProbeDownstream>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServiceMeshMetricServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceMeshMetricServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.servicemesh.ServiceMesh.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceMeshMetricService");
    }
  }

  private static final class ServiceMeshMetricServiceFileDescriptorSupplier
      extends ServiceMeshMetricServiceBaseDescriptorSupplier {
    ServiceMeshMetricServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMeshMetricServiceMethodDescriptorSupplier
      extends ServiceMeshMetricServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceMeshMetricServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceMeshMetricServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceMeshMetricServiceFileDescriptorSupplier())
              .addMethod(getCollectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
