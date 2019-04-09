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
 *register service for ApplicationCode, this service is called when service starts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: language-agent/ApplicationRegisterService.proto")
public final class ApplicationRegisterServiceGrpc {

  private ApplicationRegisterServiceGrpc() {}

  public static final String SERVICE_NAME = "ApplicationRegisterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getApplicationCodeRegisterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.Application,
      org.apache.skywalking.apm.network.language.agent.ApplicationMapping> METHOD_APPLICATION_CODE_REGISTER = getApplicationCodeRegisterMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.Application,
      org.apache.skywalking.apm.network.language.agent.ApplicationMapping> getApplicationCodeRegisterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.Application,
      org.apache.skywalking.apm.network.language.agent.ApplicationMapping> getApplicationCodeRegisterMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.language.agent.Application, org.apache.skywalking.apm.network.language.agent.ApplicationMapping> getApplicationCodeRegisterMethod;
    if ((getApplicationCodeRegisterMethod = ApplicationRegisterServiceGrpc.getApplicationCodeRegisterMethod) == null) {
      synchronized (ApplicationRegisterServiceGrpc.class) {
        if ((getApplicationCodeRegisterMethod = ApplicationRegisterServiceGrpc.getApplicationCodeRegisterMethod) == null) {
          ApplicationRegisterServiceGrpc.getApplicationCodeRegisterMethod = getApplicationCodeRegisterMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.language.agent.Application, org.apache.skywalking.apm.network.language.agent.ApplicationMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ApplicationRegisterService", "applicationCodeRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.Application.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.language.agent.ApplicationMapping.getDefaultInstance()))
                  .setSchemaDescriptor(new ApplicationRegisterServiceMethodDescriptorSupplier("applicationCodeRegister"))
                  .build();
          }
        }
     }
     return getApplicationCodeRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApplicationRegisterServiceStub newStub(io.grpc.Channel channel) {
    return new ApplicationRegisterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApplicationRegisterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ApplicationRegisterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApplicationRegisterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ApplicationRegisterServiceFutureStub(channel);
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static abstract class ApplicationRegisterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void applicationCodeRegister(org.apache.skywalking.apm.network.language.agent.Application request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ApplicationMapping> responseObserver) {
      asyncUnimplementedUnaryCall(getApplicationCodeRegisterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getApplicationCodeRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.language.agent.Application,
                org.apache.skywalking.apm.network.language.agent.ApplicationMapping>(
                  this, METHODID_APPLICATION_CODE_REGISTER)))
          .build();
    }
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static final class ApplicationRegisterServiceStub extends io.grpc.stub.AbstractStub<ApplicationRegisterServiceStub> {
    private ApplicationRegisterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationRegisterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationRegisterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationRegisterServiceStub(channel, callOptions);
    }

    /**
     */
    public void applicationCodeRegister(org.apache.skywalking.apm.network.language.agent.Application request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ApplicationMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getApplicationCodeRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static final class ApplicationRegisterServiceBlockingStub extends io.grpc.stub.AbstractStub<ApplicationRegisterServiceBlockingStub> {
    private ApplicationRegisterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationRegisterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationRegisterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationRegisterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.language.agent.ApplicationMapping applicationCodeRegister(org.apache.skywalking.apm.network.language.agent.Application request) {
      return blockingUnaryCall(
          getChannel(), getApplicationCodeRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static final class ApplicationRegisterServiceFutureStub extends io.grpc.stub.AbstractStub<ApplicationRegisterServiceFutureStub> {
    private ApplicationRegisterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ApplicationRegisterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApplicationRegisterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ApplicationRegisterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.language.agent.ApplicationMapping> applicationCodeRegister(
        org.apache.skywalking.apm.network.language.agent.Application request) {
      return futureUnaryCall(
          getChannel().newCall(getApplicationCodeRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_APPLICATION_CODE_REGISTER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApplicationRegisterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApplicationRegisterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_APPLICATION_CODE_REGISTER:
          serviceImpl.applicationCodeRegister((org.apache.skywalking.apm.network.language.agent.Application) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.language.agent.ApplicationMapping>) responseObserver);
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

  private static abstract class ApplicationRegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApplicationRegisterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.ApplicationRegisterServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApplicationRegisterService");
    }
  }

  private static final class ApplicationRegisterServiceFileDescriptorSupplier
      extends ApplicationRegisterServiceBaseDescriptorSupplier {
    ApplicationRegisterServiceFileDescriptorSupplier() {}
  }

  private static final class ApplicationRegisterServiceMethodDescriptorSupplier
      extends ApplicationRegisterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApplicationRegisterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ApplicationRegisterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApplicationRegisterServiceFileDescriptorSupplier())
              .addMethod(getApplicationCodeRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
