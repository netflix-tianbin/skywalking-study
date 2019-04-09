// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/InstancePing.proto

package org.apache.skywalking.apm.network.register.v2;

/**
 * Protobuf type {@code ServiceInstancePingPkg}
 */
public  final class ServiceInstancePingPkg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceInstancePingPkg)
    ServiceInstancePingPkgOrBuilder {
  // Use ServiceInstancePingPkg.newBuilder() to construct.
  private ServiceInstancePingPkg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceInstancePingPkg() {
    serviceInstanceId_ = 0;
    time_ = 0L;
    serviceInstanceUUID_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ServiceInstancePingPkg(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            serviceInstanceId_ = input.readInt32();
            break;
          }
          case 16: {

            time_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceInstanceUUID_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.register.v2.InstancePing.internal_static_ServiceInstancePingPkg_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.register.v2.InstancePing.internal_static_ServiceInstancePingPkg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg.class, org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg.Builder.class);
  }

  public static final int SERVICEINSTANCEID_FIELD_NUMBER = 1;
  private int serviceInstanceId_;
  /**
   * <code>int32 serviceInstanceId = 1;</code>
   */
  public int getServiceInstanceId() {
    return serviceInstanceId_;
  }

  public static final int TIME_FIELD_NUMBER = 2;
  private long time_;
  /**
   * <code>int64 time = 2;</code>
   */
  public long getTime() {
    return time_;
  }

  public static final int SERVICEINSTANCEUUID_FIELD_NUMBER = 3;
  private volatile java.lang.Object serviceInstanceUUID_;
  /**
   * <code>string serviceInstanceUUID = 3;</code>
   */
  public java.lang.String getServiceInstanceUUID() {
    java.lang.Object ref = serviceInstanceUUID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceInstanceUUID_ = s;
      return s;
    }
  }
  /**
   * <code>string serviceInstanceUUID = 3;</code>
   */
  public com.google.protobuf.ByteString
      getServiceInstanceUUIDBytes() {
    java.lang.Object ref = serviceInstanceUUID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceInstanceUUID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (serviceInstanceId_ != 0) {
      output.writeInt32(1, serviceInstanceId_);
    }
    if (time_ != 0L) {
      output.writeInt64(2, time_);
    }
    if (!getServiceInstanceUUIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, serviceInstanceUUID_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (serviceInstanceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, serviceInstanceId_);
    }
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, time_);
    }
    if (!getServiceInstanceUUIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, serviceInstanceUUID_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg other = (org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg) obj;

    boolean result = true;
    result = result && (getServiceInstanceId()
        == other.getServiceInstanceId());
    result = result && (getTime()
        == other.getTime());
    result = result && getServiceInstanceUUID()
        .equals(other.getServiceInstanceUUID());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SERVICEINSTANCEID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceInstanceId();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (37 * hash) + SERVICEINSTANCEUUID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceInstanceUUID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ServiceInstancePingPkg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceInstancePingPkg)
      org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.register.v2.InstancePing.internal_static_ServiceInstancePingPkg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.register.v2.InstancePing.internal_static_ServiceInstancePingPkg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg.class, org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      serviceInstanceId_ = 0;

      time_ = 0L;

      serviceInstanceUUID_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.register.v2.InstancePing.internal_static_ServiceInstancePingPkg_descriptor;
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg build() {
      org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg buildPartial() {
      org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg result = new org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg(this);
      result.serviceInstanceId_ = serviceInstanceId_;
      result.time_ = time_;
      result.serviceInstanceUUID_ = serviceInstanceUUID_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg) {
        return mergeFrom((org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg other) {
      if (other == org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg.getDefaultInstance()) return this;
      if (other.getServiceInstanceId() != 0) {
        setServiceInstanceId(other.getServiceInstanceId());
      }
      if (other.getTime() != 0L) {
        setTime(other.getTime());
      }
      if (!other.getServiceInstanceUUID().isEmpty()) {
        serviceInstanceUUID_ = other.serviceInstanceUUID_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int serviceInstanceId_ ;
    /**
     * <code>int32 serviceInstanceId = 1;</code>
     */
    public int getServiceInstanceId() {
      return serviceInstanceId_;
    }
    /**
     * <code>int32 serviceInstanceId = 1;</code>
     */
    public Builder setServiceInstanceId(int value) {
      
      serviceInstanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 serviceInstanceId = 1;</code>
     */
    public Builder clearServiceInstanceId() {
      
      serviceInstanceId_ = 0;
      onChanged();
      return this;
    }

    private long time_ ;
    /**
     * <code>int64 time = 2;</code>
     */
    public long getTime() {
      return time_;
    }
    /**
     * <code>int64 time = 2;</code>
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 time = 2;</code>
     */
    public Builder clearTime() {
      
      time_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object serviceInstanceUUID_ = "";
    /**
     * <code>string serviceInstanceUUID = 3;</code>
     */
    public java.lang.String getServiceInstanceUUID() {
      java.lang.Object ref = serviceInstanceUUID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceInstanceUUID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string serviceInstanceUUID = 3;</code>
     */
    public com.google.protobuf.ByteString
        getServiceInstanceUUIDBytes() {
      java.lang.Object ref = serviceInstanceUUID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceInstanceUUID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string serviceInstanceUUID = 3;</code>
     */
    public Builder setServiceInstanceUUID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceInstanceUUID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string serviceInstanceUUID = 3;</code>
     */
    public Builder clearServiceInstanceUUID() {
      
      serviceInstanceUUID_ = getDefaultInstance().getServiceInstanceUUID();
      onChanged();
      return this;
    }
    /**
     * <code>string serviceInstanceUUID = 3;</code>
     */
    public Builder setServiceInstanceUUIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceInstanceUUID_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ServiceInstancePingPkg)
  }

  // @@protoc_insertion_point(class_scope:ServiceInstancePingPkg)
  private static final org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg();
  }

  public static org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceInstancePingPkg>
      PARSER = new com.google.protobuf.AbstractParser<ServiceInstancePingPkg>() {
    public ServiceInstancePingPkg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServiceInstancePingPkg(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServiceInstancePingPkg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceInstancePingPkg> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.register.v2.ServiceInstancePingPkg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

