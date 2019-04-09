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
 * <pre>
 *discovery service for ServiceName by Network address or application code
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: language-agent/DiscoveryService.proto")
public final class ServiceNameDiscoveryServiceGrpc {

  private ServiceNameDiscoveryServiceGrpc() {}

  public static final String SERVICE_NAME = "ServiceNameDiscoveryService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDiscoveryMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ServiceNameCollection,
      org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection> METHOD_DISCOVERY = getDiscoveryMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ServiceNameCollection,
      org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection> getDiscoveryMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ServiceNameCollection,
      org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection> getDiscoveryMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.ServiceNameCollection, org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection> getDiscoveryMethod;
    if ((getDiscoveryMethod = ServiceNameDiscoveryServiceGrpc.getDiscoveryMethod) == null) {
      synchronized (ServiceNameDiscoveryServiceGrpc.class) {
        if ((getDiscoveryMethod = ServiceNameDiscoveryServiceGrpc.getDiscoveryMethod) == null) {
          ServiceNameDiscoveryServiceGrpc.getDiscoveryMethod = getDiscoveryMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.ServiceNameCollection, org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceNameDiscoveryService", "discovery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.ServiceNameCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceNameDiscoveryServiceMethodDescriptorSupplier("discovery"))
                  .build();
          }
        }
     }
     return getDiscoveryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceNameDiscoveryServiceStub newStub(io.grpc.Channel channel) {
    return new ServiceNameDiscoveryServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceNameDiscoveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceNameDiscoveryServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceNameDiscoveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceNameDiscoveryServiceFutureStub(channel);
  }

  /**
   * <pre>
   *discovery service for ServiceName by Network address or application code
   * </pre>
   */
  public static abstract class ServiceNameDiscoveryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void discovery(org.apache.skywalking.apm.network.language.agent.ServiceNameCollection request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection> responseObserver) {
      asyncUnimplementedUnaryCall(getDiscoveryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDiscoveryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.ServiceNameCollection,
                org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection>(
                  this, METHODID_DISCOVERY)))
          .build();
    }
  }

  /**
   * <pre>
   *discovery service for ServiceName by Network address or application code
   * </pre>
   */
  public static final class ServiceNameDiscoveryServiceStub extends io.grpc.stub.AbstractStub<ServiceNameDiscoveryServiceStub> {
    private ServiceNameDiscoveryServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceNameDiscoveryServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameDiscoveryServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceNameDiscoveryServiceStub(channel, callOptions);
    }

    /**
     */
    public void discovery(org.apache.skywalking.apm.network.language.agent.ServiceNameCollection request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDiscoveryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *discovery service for ServiceName by Network address or application code
   * </pre>
   */
  public static final class ServiceNameDiscoveryServiceBlockingStub extends io.grpc.stub.AbstractStub<ServiceNameDiscoveryServiceBlockingStub> {
    private ServiceNameDiscoveryServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceNameDiscoveryServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameDiscoveryServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceNameDiscoveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection discovery(org.apache.skywalking.apm.network.language.agent.ServiceNameCollection request) {
      return blockingUnaryCall(
          getChannel(), getDiscoveryMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *discovery service for ServiceName by Network address or application code
   * </pre>
   */
  public static final class ServiceNameDiscoveryServiceFutureStub extends io.grpc.stub.AbstractStub<ServiceNameDiscoveryServiceFutureStub> {
    private ServiceNameDiscoveryServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceNameDiscoveryServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceNameDiscoveryServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceNameDiscoveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection> discovery(
        org.apache.skywalking.apm.network.language.agent.ServiceNameCollection request) {
      return futureUnaryCall(
          getChannel().newCall(getDiscoveryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DISCOVERY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceNameDiscoveryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceNameDiscoveryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DISCOVERY:
          serviceImpl.discovery((org.apache.skywalking.apm.network.language.agent.ServiceNameCollection) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ServiceNameMappingCollection>) responseObserver);
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

  private static abstract class ServiceNameDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceNameDiscoveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.DiscoveryService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceNameDiscoveryService");
    }
  }

  private static final class ServiceNameDiscoveryServiceFileDescriptorSupplier
      extends ServiceNameDiscoveryServiceBaseDescriptorSupplier {
    ServiceNameDiscoveryServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceNameDiscoveryServiceMethodDescriptorSupplier
      extends ServiceNameDiscoveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceNameDiscoveryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceNameDiscoveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceNameDiscoveryServiceFileDescriptorSupplier())
              .addMethod(getDiscoveryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
