// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/DiscoveryService.proto

package org.apache.skywalking.apm.network.language.agent;

/**
 * Protobuf type {@code ApplicationInstance}
 */
public  final class ApplicationInstance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ApplicationInstance)
    ApplicationInstanceOrBuilder {
  // Use ApplicationInstance.newBuilder() to construct.
  private ApplicationInstance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApplicationInstance() {
    applicationId_ = 0;
    agentUUID_ = "";
    registerTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ApplicationInstance(
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

            applicationId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            agentUUID_ = s;
            break;
          }
          case 24: {

            registerTime_ = input.readInt64();
            break;
          }
          case 34: {
            org.apache.skywalking.apm.network.language.agent.OSInfo.Builder subBuilder = null;
            if (osinfo_ != null) {
              subBuilder = osinfo_.toBuilder();
            }
            osinfo_ = input.readMessage(org.apache.skywalking.apm.network.language.agent.OSInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(osinfo_);
              osinfo_ = subBuilder.buildPartial();
            }

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
    return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ApplicationInstance_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ApplicationInstance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.ApplicationInstance.class, org.apache.skywalking.apm.network.language.agent.ApplicationInstance.Builder.class);
  }

  public static final int APPLICATIONID_FIELD_NUMBER = 1;
  private int applicationId_;
  /**
   * <code>int32 applicationId = 1;</code>
   */
  public int getApplicationId() {
    return applicationId_;
  }

  public static final int AGENTUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object agentUUID_;
  /**
   * <code>string agentUUID = 2;</code>
   */
  public java.lang.String getAgentUUID() {
    java.lang.Object ref = agentUUID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      agentUUID_ = s;
      return s;
    }
  }
  /**
   * <code>string agentUUID = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAgentUUIDBytes() {
    java.lang.Object ref = agentUUID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      agentUUID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGISTERTIME_FIELD_NUMBER = 3;
  private long registerTime_;
  /**
   * <code>int64 registerTime = 3;</code>
   */
  public long getRegisterTime() {
    return registerTime_;
  }

  public static final int OSINFO_FIELD_NUMBER = 4;
  private org.apache.skywalking.apm.network.language.agent.OSInfo osinfo_;
  /**
   * <code>.OSInfo osinfo = 4;</code>
   */
  public boolean hasOsinfo() {
    return osinfo_ != null;
  }
  /**
   * <code>.OSInfo osinfo = 4;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.OSInfo getOsinfo() {
    return osinfo_ == null ? org.apache.skywalking.apm.network.language.agent.OSInfo.getDefaultInstance() : osinfo_;
  }
  /**
   * <code>.OSInfo osinfo = 4;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.OSInfoOrBuilder getOsinfoOrBuilder() {
    return getOsinfo();
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
    if (applicationId_ != 0) {
      output.writeInt32(1, applicationId_);
    }
    if (!getAgentUUIDBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, agentUUID_);
    }
    if (registerTime_ != 0L) {
      output.writeInt64(3, registerTime_);
    }
    if (osinfo_ != null) {
      output.writeMessage(4, getOsinfo());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (applicationId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, applicationId_);
    }
    if (!getAgentUUIDBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, agentUUID_);
    }
    if (registerTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, registerTime_);
    }
    if (osinfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getOsinfo());
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.ApplicationInstance)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.ApplicationInstance other = (org.apache.skywalking.apm.network.language.agent.ApplicationInstance) obj;

    boolean result = true;
    result = result && (getApplicationId()
        == other.getApplicationId());
    result = result && getAgentUUID()
        .equals(other.getAgentUUID());
    result = result && (getRegisterTime()
        == other.getRegisterTime());
    result = result && (hasOsinfo() == other.hasOsinfo());
    if (hasOsinfo()) {
      result = result && getOsinfo()
          .equals(other.getOsinfo());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + APPLICATIONID_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationId();
    hash = (37 * hash) + AGENTUUID_FIELD_NUMBER;
    hash = (53 * hash) + getAgentUUID().hashCode();
    hash = (37 * hash) + REGISTERTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRegisterTime());
    if (hasOsinfo()) {
      hash = (37 * hash) + OSINFO_FIELD_NUMBER;
      hash = (53 * hash) + getOsinfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.ApplicationInstance prototype) {
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
   * Protobuf type {@code ApplicationInstance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ApplicationInstance)
      org.apache.skywalking.apm.network.language.agent.ApplicationInstanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ApplicationInstance_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ApplicationInstance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.ApplicationInstance.class, org.apache.skywalking.apm.network.language.agent.ApplicationInstance.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.ApplicationInstance.newBuilder()
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
      applicationId_ = 0;

      agentUUID_ = "";

      registerTime_ = 0L;

      if (osinfoBuilder_ == null) {
        osinfo_ = null;
      } else {
        osinfo_ = null;
        osinfoBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ApplicationInstance_descriptor;
    }

    public org.apache.skywalking.apm.network.language.agent.ApplicationInstance getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.ApplicationInstance.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.language.agent.ApplicationInstance build() {
      org.apache.skywalking.apm.network.language.agent.ApplicationInstance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.language.agent.ApplicationInstance buildPartial() {
      org.apache.skywalking.apm.network.language.agent.ApplicationInstance result = new org.apache.skywalking.apm.network.language.agent.ApplicationInstance(this);
      result.applicationId_ = applicationId_;
      result.agentUUID_ = agentUUID_;
      result.registerTime_ = registerTime_;
      if (osinfoBuilder_ == null) {
        result.osinfo_ = osinfo_;
      } else {
        result.osinfo_ = osinfoBuilder_.build();
      }
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
      if (other instanceof org.apache.skywalking.apm.network.language.agent.ApplicationInstance) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.ApplicationInstance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.ApplicationInstance other) {
      if (other == org.apache.skywalking.apm.network.language.agent.ApplicationInstance.getDefaultInstance()) return this;
      if (other.getApplicationId() != 0) {
        setApplicationId(other.getApplicationId());
      }
      if (!other.getAgentUUID().isEmpty()) {
        agentUUID_ = other.agentUUID_;
        onChanged();
      }
      if (other.getRegisterTime() != 0L) {
        setRegisterTime(other.getRegisterTime());
      }
      if (other.hasOsinfo()) {
        mergeOsinfo(other.getOsinfo());
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
      org.apache.skywalking.apm.network.language.agent.ApplicationInstance parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.language.agent.ApplicationInstance) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int applicationId_ ;
    /**
     * <code>int32 applicationId = 1;</code>
     */
    public int getApplicationId() {
      return applicationId_;
    }
    /**
     * <code>int32 applicationId = 1;</code>
     */
    public Builder setApplicationId(int value) {
      
      applicationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 applicationId = 1;</code>
     */
    public Builder clearApplicationId() {
      
      applicationId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object agentUUID_ = "";
    /**
     * <code>string agentUUID = 2;</code>
     */
    public java.lang.String getAgentUUID() {
      java.lang.Object ref = agentUUID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        agentUUID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string agentUUID = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAgentUUIDBytes() {
      java.lang.Object ref = agentUUID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        agentUUID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string agentUUID = 2;</code>
     */
    public Builder setAgentUUID(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      agentUUID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string agentUUID = 2;</code>
     */
    public Builder clearAgentUUID() {
      
      agentUUID_ = getDefaultInstance().getAgentUUID();
      onChanged();
      return this;
    }
    /**
     * <code>string agentUUID = 2;</code>
     */
    public Builder setAgentUUIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      agentUUID_ = value;
      onChanged();
      return this;
    }

    private long registerTime_ ;
    /**
     * <code>int64 registerTime = 3;</code>
     */
    public long getRegisterTime() {
      return registerTime_;
    }
    /**
     * <code>int64 registerTime = 3;</code>
     */
    public Builder setRegisterTime(long value) {
      
      registerTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 registerTime = 3;</code>
     */
    public Builder clearRegisterTime() {
      
      registerTime_ = 0L;
      onChanged();
      return this;
    }

    private org.apache.skywalking.apm.network.language.agent.OSInfo osinfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.OSInfo, org.apache.skywalking.apm.network.language.agent.OSInfo.Builder, org.apache.skywalking.apm.network.language.agent.OSInfoOrBuilder> osinfoBuilder_;
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    public boolean hasOsinfo() {
      return osinfoBuilder_ != null || osinfo_ != null;
    }
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.OSInfo getOsinfo() {
      if (osinfoBuilder_ == null) {
        return osinfo_ == null ? org.apache.skywalking.apm.network.language.agent.OSInfo.getDefaultInstance() : osinfo_;
      } else {
        return osinfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    public Builder setOsinfo(org.apache.skywalking.apm.network.language.agent.OSInfo value) {
      if (osinfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        osinfo_ = value;
        onChanged();
      } else {
        osinfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    public Builder setOsinfo(
        org.apache.skywalking.apm.network.language.agent.OSInfo.Builder builderForValue) {
      if (osinfoBuilder_ == null) {
        osinfo_ = builderForValue.build();
        onChanged();
      } else {
        osinfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    public Builder mergeOsinfo(org.apache.skywalking.apm.network.language.agent.OSInfo value) {
      if (osinfoBuilder_ == null) {
        if (osinfo_ != null) {
          osinfo_ =
            org.apache.skywalking.apm.network.language.agent.OSInfo.newBuilder(osinfo_).mergeFrom(value).buildPartial();
        } else {
          osinfo_ = value;
        }
        onChanged();
      } else {
        osinfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    public Builder clearOsinfo() {
      if (osinfoBuilder_ == null) {
        osinfo_ = null;
        onChanged();
      } else {
        osinfo_ = null;
        osinfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.OSInfo.Builder getOsinfoBuilder() {
      
      onChanged();
      return getOsinfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.OSInfoOrBuilder getOsinfoOrBuilder() {
      if (osinfoBuilder_ != null) {
        return osinfoBuilder_.getMessageOrBuilder();
      } else {
        return osinfo_ == null ?
            org.apache.skywalking.apm.network.language.agent.OSInfo.getDefaultInstance() : osinfo_;
      }
    }
    /**
     * <code>.OSInfo osinfo = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.OSInfo, org.apache.skywalking.apm.network.language.agent.OSInfo.Builder, org.apache.skywalking.apm.network.language.agent.OSInfoOrBuilder> 
        getOsinfoFieldBuilder() {
      if (osinfoBuilder_ == null) {
        osinfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.skywalking.apm.network.language.agent.OSInfo, org.apache.skywalking.apm.network.language.agent.OSInfo.Builder, org.apache.skywalking.apm.network.language.agent.OSInfoOrBuilder>(
                getOsinfo(),
                getParentForChildren(),
                isClean());
        osinfo_ = null;
      }
      return osinfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ApplicationInstance)
  }

  // @@protoc_insertion_point(class_scope:ApplicationInstance)
  private static final org.apache.skywalking.apm.network.language.agent.ApplicationInstance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.ApplicationInstance();
  }

  public static org.apache.skywalking.apm.network.language.agent.ApplicationInstance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplicationInstance>
      PARSER = new com.google.protobuf.AbstractParser<ApplicationInstance>() {
    public ApplicationInstance parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ApplicationInstance(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApplicationInstance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplicationInstance> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.language.agent.ApplicationInstance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

