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
 * <pre>
 *register service for ApplicationCode, this service is called when service starts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.8.0)",
    comments = "Source: register/Register.proto")
public final class RegisterGrpc {

  private RegisterGrpc() {}

  public static final String SERVICE_NAME = "Register";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDoServiceRegisterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.Services,
      org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping> METHOD_DO_SERVICE_REGISTER = getDoServiceRegisterMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.Services,
      org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping> getDoServiceRegisterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.Services,
      org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping> getDoServiceRegisterMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.Services, org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping> getDoServiceRegisterMethod;
    if ((getDoServiceRegisterMethod = RegisterGrpc.getDoServiceRegisterMethod) == null) {
      synchronized (RegisterGrpc.class) {
        if ((getDoServiceRegisterMethod = RegisterGrpc.getDoServiceRegisterMethod) == null) {
          RegisterGrpc.getDoServiceRegisterMethod = getDoServiceRegisterMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.register.v2.Services, org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Register", "doServiceRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.Services.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping.getDefaultInstance()))
                  .setSchemaDescriptor(new RegisterMethodDescriptorSupplier("doServiceRegister"))
                  .build();
          }
        }
     }
     return getDoServiceRegisterMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDoServiceInstanceRegisterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceInstances,
      org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping> METHOD_DO_SERVICE_INSTANCE_REGISTER = getDoServiceInstanceRegisterMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceInstances,
      org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping> getDoServiceInstanceRegisterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceInstances,
      org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping> getDoServiceInstanceRegisterMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceInstances, org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping> getDoServiceInstanceRegisterMethod;
    if ((getDoServiceInstanceRegisterMethod = RegisterGrpc.getDoServiceInstanceRegisterMethod) == null) {
      synchronized (RegisterGrpc.class) {
        if ((getDoServiceInstanceRegisterMethod = RegisterGrpc.getDoServiceInstanceRegisterMethod) == null) {
          RegisterGrpc.getDoServiceInstanceRegisterMethod = getDoServiceInstanceRegisterMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.register.v2.ServiceInstances, org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Register", "doServiceInstanceRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.ServiceInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping.getDefaultInstance()))
                  .setSchemaDescriptor(new RegisterMethodDescriptorSupplier("doServiceInstanceRegister"))
                  .build();
          }
        }
     }
     return getDoServiceInstanceRegisterMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDoEndpointRegisterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.Enpoints,
      org.apache.skywalking.apm.network.register.v2.EndpointMapping> METHOD_DO_ENDPOINT_REGISTER = getDoEndpointRegisterMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.Enpoints,
      org.apache.skywalking.apm.network.register.v2.EndpointMapping> getDoEndpointRegisterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.Enpoints,
      org.apache.skywalking.apm.network.register.v2.EndpointMapping> getDoEndpointRegisterMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.Enpoints, org.apache.skywalking.apm.network.register.v2.EndpointMapping> getDoEndpointRegisterMethod;
    if ((getDoEndpointRegisterMethod = RegisterGrpc.getDoEndpointRegisterMethod) == null) {
      synchronized (RegisterGrpc.class) {
        if ((getDoEndpointRegisterMethod = RegisterGrpc.getDoEndpointRegisterMethod) == null) {
          RegisterGrpc.getDoEndpointRegisterMethod = getDoEndpointRegisterMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.register.v2.Enpoints, org.apache.skywalking.apm.network.register.v2.EndpointMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Register", "doEndpointRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.Enpoints.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.EndpointMapping.getDefaultInstance()))
                  .setSchemaDescriptor(new RegisterMethodDescriptorSupplier("doEndpointRegister"))
                  .build();
          }
        }
     }
     return getDoEndpointRegisterMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDoNetworkAddressRegisterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.NetAddresses,
      org.apache.skywalking.apm.network.register.v2.NetAddressMapping> METHOD_DO_NETWORK_ADDRESS_REGISTER = getDoNetworkAddressRegisterMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.NetAddresses,
      org.apache.skywalking.apm.network.register.v2.NetAddressMapping> getDoNetworkAddressRegisterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.NetAddresses,
      org.apache.skywalking.apm.network.register.v2.NetAddressMapping> getDoNetworkAddressRegisterMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.NetAddresses, org.apache.skywalking.apm.network.register.v2.NetAddressMapping> getDoNetworkAddressRegisterMethod;
    if ((getDoNetworkAddressRegisterMethod = RegisterGrpc.getDoNetworkAddressRegisterMethod) == null) {
      synchronized (RegisterGrpc.class) {
        if ((getDoNetworkAddressRegisterMethod = RegisterGrpc.getDoNetworkAddressRegisterMethod) == null) {
          RegisterGrpc.getDoNetworkAddressRegisterMethod = getDoNetworkAddressRegisterMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.register.v2.NetAddresses, org.apache.skywalking.apm.network.register.v2.NetAddressMapping>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Register", "doNetworkAddressRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.NetAddresses.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.NetAddressMapping.getDefaultInstance()))
                  .setSchemaDescriptor(new RegisterMethodDescriptorSupplier("doNetworkAddressRegister"))
                  .build();
          }
        }
     }
     return getDoNetworkAddressRegisterMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDoServiceAndNetworkAddressMappingRegisterMethod()} instead. 
  public static final io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings,
      org.apache.skywalking.apm.network.common.Commands> METHOD_DO_SERVICE_AND_NETWORK_ADDRESS_MAPPING_REGISTER = getDoServiceAndNetworkAddressMappingRegisterMethod();

  private static volatile io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings,
      org.apache.skywalking.apm.network.common.Commands> getDoServiceAndNetworkAddressMappingRegisterMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings,
      org.apache.skywalking.apm.network.common.Commands> getDoServiceAndNetworkAddressMappingRegisterMethod() {
    io.grpc.MethodDescriptor<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings, org.apache.skywalking.apm.network.common.Commands> getDoServiceAndNetworkAddressMappingRegisterMethod;
    if ((getDoServiceAndNetworkAddressMappingRegisterMethod = RegisterGrpc.getDoServiceAndNetworkAddressMappingRegisterMethod) == null) {
      synchronized (RegisterGrpc.class) {
        if ((getDoServiceAndNetworkAddressMappingRegisterMethod = RegisterGrpc.getDoServiceAndNetworkAddressMappingRegisterMethod) == null) {
          RegisterGrpc.getDoServiceAndNetworkAddressMappingRegisterMethod = getDoServiceAndNetworkAddressMappingRegisterMethod = 
              io.grpc.MethodDescriptor.<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings, org.apache.skywalking.apm.network.common.Commands>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Register", "doServiceAndNetworkAddressMappingRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.skywalking.apm.network.common.Commands.getDefaultInstance()))
                  .setSchemaDescriptor(new RegisterMethodDescriptorSupplier("doServiceAndNetworkAddressMappingRegister"))
                  .build();
          }
        }
     }
     return getDoServiceAndNetworkAddressMappingRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegisterStub newStub(io.grpc.Channel channel) {
    return new RegisterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegisterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegisterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegisterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegisterFutureStub(channel);
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static abstract class RegisterImplBase implements io.grpc.BindableService {

    /**
     */
    public void doServiceRegister(org.apache.skywalking.apm.network.register.v2.Services request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping> responseObserver) {
      asyncUnimplementedUnaryCall(getDoServiceRegisterMethod(), responseObserver);
    }

    /**
     */
    public void doServiceInstanceRegister(org.apache.skywalking.apm.network.register.v2.ServiceInstances request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping> responseObserver) {
      asyncUnimplementedUnaryCall(getDoServiceInstanceRegisterMethod(), responseObserver);
    }

    /**
     */
    public void doEndpointRegister(org.apache.skywalking.apm.network.register.v2.Enpoints request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.EndpointMapping> responseObserver) {
      asyncUnimplementedUnaryCall(getDoEndpointRegisterMethod(), responseObserver);
    }

    /**
     */
    public void doNetworkAddressRegister(org.apache.skywalking.apm.network.register.v2.NetAddresses request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.NetAddressMapping> responseObserver) {
      asyncUnimplementedUnaryCall(getDoNetworkAddressRegisterMethod(), responseObserver);
    }

    /**
     */
    public void doServiceAndNetworkAddressMappingRegister(org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      asyncUnimplementedUnaryCall(getDoServiceAndNetworkAddressMappingRegisterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoServiceRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.register.v2.Services,
                org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping>(
                  this, METHODID_DO_SERVICE_REGISTER)))
          .addMethod(
            getDoServiceInstanceRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.register.v2.ServiceInstances,
                org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping>(
                  this, METHODID_DO_SERVICE_INSTANCE_REGISTER)))
          .addMethod(
            getDoEndpointRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.register.v2.Enpoints,
                org.apache.skywalking.apm.network.register.v2.EndpointMapping>(
                  this, METHODID_DO_ENDPOINT_REGISTER)))
          .addMethod(
            getDoNetworkAddressRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.register.v2.NetAddresses,
                org.apache.skywalking.apm.network.register.v2.NetAddressMapping>(
                  this, METHODID_DO_NETWORK_ADDRESS_REGISTER)))
          .addMethod(
            getDoServiceAndNetworkAddressMappingRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings,
                org.apache.skywalking.apm.network.common.Commands>(
                  this, METHODID_DO_SERVICE_AND_NETWORK_ADDRESS_MAPPING_REGISTER)))
          .build();
    }
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static final class RegisterStub extends io.grpc.stub.AbstractStub<RegisterStub> {
    private RegisterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterStub(channel, callOptions);
    }

    /**
     */
    public void doServiceRegister(org.apache.skywalking.apm.network.register.v2.Services request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoServiceRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doServiceInstanceRegister(org.apache.skywalking.apm.network.register.v2.ServiceInstances request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoServiceInstanceRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doEndpointRegister(org.apache.skywalking.apm.network.register.v2.Enpoints request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.EndpointMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoEndpointRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doNetworkAddressRegister(org.apache.skywalking.apm.network.register.v2.NetAddresses request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.NetAddressMapping> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoNetworkAddressRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doServiceAndNetworkAddressMappingRegister(org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings request,
        io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.common.Commands> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDoServiceAndNetworkAddressMappingRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static final class RegisterBlockingStub extends io.grpc.stub.AbstractStub<RegisterBlockingStub> {
    private RegisterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping doServiceRegister(org.apache.skywalking.apm.network.register.v2.Services request) {
      return blockingUnaryCall(
          getChannel(), getDoServiceRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping doServiceInstanceRegister(org.apache.skywalking.apm.network.register.v2.ServiceInstances request) {
      return blockingUnaryCall(
          getChannel(), getDoServiceInstanceRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.skywalking.apm.network.register.v2.EndpointMapping doEndpointRegister(org.apache.skywalking.apm.network.register.v2.Enpoints request) {
      return blockingUnaryCall(
          getChannel(), getDoEndpointRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.skywalking.apm.network.register.v2.NetAddressMapping doNetworkAddressRegister(org.apache.skywalking.apm.network.register.v2.NetAddresses request) {
      return blockingUnaryCall(
          getChannel(), getDoNetworkAddressRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.skywalking.apm.network.common.Commands doServiceAndNetworkAddressMappingRegister(org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings request) {
      return blockingUnaryCall(
          getChannel(), getDoServiceAndNetworkAddressMappingRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *register service for ApplicationCode, this service is called when service starts.
   * </pre>
   */
  public static final class RegisterFutureStub extends io.grpc.stub.AbstractStub<RegisterFutureStub> {
    private RegisterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisterFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping> doServiceRegister(
        org.apache.skywalking.apm.network.register.v2.Services request) {
      return futureUnaryCall(
          getChannel().newCall(getDoServiceRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping> doServiceInstanceRegister(
        org.apache.skywalking.apm.network.register.v2.ServiceInstances request) {
      return futureUnaryCall(
          getChannel().newCall(getDoServiceInstanceRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.register.v2.EndpointMapping> doEndpointRegister(
        org.apache.skywalking.apm.network.register.v2.Enpoints request) {
      return futureUnaryCall(
          getChannel().newCall(getDoEndpointRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.register.v2.NetAddressMapping> doNetworkAddressRegister(
        org.apache.skywalking.apm.network.register.v2.NetAddresses request) {
      return futureUnaryCall(
          getChannel().newCall(getDoNetworkAddressRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.skywalking.apm.network.common.Commands> doServiceAndNetworkAddressMappingRegister(
        org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings request) {
      return futureUnaryCall(
          getChannel().newCall(getDoServiceAndNetworkAddressMappingRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_SERVICE_REGISTER = 0;
  private static final int METHODID_DO_SERVICE_INSTANCE_REGISTER = 1;
  private static final int METHODID_DO_ENDPOINT_REGISTER = 2;
  private static final int METHODID_DO_NETWORK_ADDRESS_REGISTER = 3;
  private static final int METHODID_DO_SERVICE_AND_NETWORK_ADDRESS_MAPPING_REGISTER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegisterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegisterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_SERVICE_REGISTER:
          serviceImpl.doServiceRegister((org.apache.skywalking.apm.network.register.v2.Services) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.ServiceRegisterMapping>) responseObserver);
          break;
        case METHODID_DO_SERVICE_INSTANCE_REGISTER:
          serviceImpl.doServiceInstanceRegister((org.apache.skywalking.apm.network.register.v2.ServiceInstances) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.ServiceInstanceRegisterMapping>) responseObserver);
          break;
        case METHODID_DO_ENDPOINT_REGISTER:
          serviceImpl.doEndpointRegister((org.apache.skywalking.apm.network.register.v2.Enpoints) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.EndpointMapping>) responseObserver);
          break;
        case METHODID_DO_NETWORK_ADDRESS_REGISTER:
          serviceImpl.doNetworkAddressRegister((org.apache.skywalking.apm.network.register.v2.NetAddresses) request,
              (io.grpc.stub.StreamObserver<org.apache.skywalking.apm.network.register.v2.NetAddressMapping>) responseObserver);
          break;
        case METHODID_DO_SERVICE_AND_NETWORK_ADDRESS_MAPPING_REGISTER:
          serviceImpl.doServiceAndNetworkAddressMappingRegister((org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings) request,
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

  private static abstract class RegisterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegisterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Register");
    }
  }

  private static final class RegisterFileDescriptorSupplier
      extends RegisterBaseDescriptorSupplier {
    RegisterFileDescriptorSupplier() {}
  }

  private static final class RegisterMethodDescriptorSupplier
      extends RegisterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegisterMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegisterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegisterFileDescriptorSupplier())
              .addMethod(getDoServiceRegisterMethod())
              .addMethod(getDoServiceInstanceRegisterMethod())
              .addMethod(getDoEndpointRegisterMethod())
              .addMethod(getDoNetworkAddressRegisterMethod())
              .addMethod(getDoServiceAndNetworkAddressMappingRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
