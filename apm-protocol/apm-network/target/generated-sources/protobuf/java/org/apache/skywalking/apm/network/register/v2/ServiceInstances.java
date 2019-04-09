// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

/**
 * <pre>
 * Service Instance register
 * </pre>
 *
 * Protobuf type {@code ServiceInstances}
 */
public  final class ServiceInstances extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceInstances)
    ServiceInstancesOrBuilder {
  // Use ServiceInstances.newBuilder() to construct.
  private ServiceInstances(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceInstances() {
    instances_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ServiceInstances(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              instances_ = new java.util.ArrayList<org.apache.skywalking.apm.network.register.v2.ServiceInstance>();
              mutable_bitField0_ |= 0x00000001;
            }
            instances_.add(
                input.readMessage(org.apache.skywalking.apm.network.register.v2.ServiceInstance.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        instances_ = java.util.Collections.unmodifiableList(instances_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceInstances_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceInstances_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.register.v2.ServiceInstances.class, org.apache.skywalking.apm.network.register.v2.ServiceInstances.Builder.class);
  }

  public static final int INSTANCES_FIELD_NUMBER = 1;
  private java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceInstance> instances_;
  /**
   * <code>repeated .ServiceInstance instances = 1;</code>
   */
  public java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceInstance> getInstancesList() {
    return instances_;
  }
  /**
   * <code>repeated .ServiceInstance instances = 1;</code>
   */
  public java.util.List<? extends org.apache.skywalking.apm.network.register.v2.ServiceInstanceOrBuilder> 
      getInstancesOrBuilderList() {
    return instances_;
  }
  /**
   * <code>repeated .ServiceInstance instances = 1;</code>
   */
  public int getInstancesCount() {
    return instances_.size();
  }
  /**
   * <code>repeated .ServiceInstance instances = 1;</code>
   */
  public org.apache.skywalking.apm.network.register.v2.ServiceInstance getInstances(int index) {
    return instances_.get(index);
  }
  /**
   * <code>repeated .ServiceInstance instances = 1;</code>
   */
  public org.apache.skywalking.apm.network.register.v2.ServiceInstanceOrBuilder getInstancesOrBuilder(
      int index) {
    return instances_.get(index);
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
    for (int i = 0; i < instances_.size(); i++) {
      output.writeMessage(1, instances_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < instances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, instances_.get(i));
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
    if (!(obj instanceof org.apache.skywalking.apm.network.register.v2.ServiceInstances)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.register.v2.ServiceInstances other = (org.apache.skywalking.apm.network.register.v2.ServiceInstances) obj;

    boolean result = true;
    result = result && getInstancesList()
        .equals(other.getInstancesList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getInstancesCount() > 0) {
      hash = (37 * hash) + INSTANCES_FIELD_NUMBER;
      hash = (53 * hash) + getInstancesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.register.v2.ServiceInstances prototype) {
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
   * <pre>
   * Service Instance register
   * </pre>
   *
   * Protobuf type {@code ServiceInstances}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceInstances)
      org.apache.skywalking.apm.network.register.v2.ServiceInstancesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceInstances_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceInstances_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.register.v2.ServiceInstances.class, org.apache.skywalking.apm.network.register.v2.ServiceInstances.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.register.v2.ServiceInstances.newBuilder()
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
        getInstancesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        instancesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceInstances_descriptor;
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceInstances getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.register.v2.ServiceInstances.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceInstances build() {
      org.apache.skywalking.apm.network.register.v2.ServiceInstances result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceInstances buildPartial() {
      org.apache.skywalking.apm.network.register.v2.ServiceInstances result = new org.apache.skywalking.apm.network.register.v2.ServiceInstances(this);
      int from_bitField0_ = bitField0_;
      if (instancesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          instances_ = java.util.Collections.unmodifiableList(instances_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instances_ = instances_;
      } else {
        result.instances_ = instancesBuilder_.build();
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
      if (other instanceof org.apache.skywalking.apm.network.register.v2.ServiceInstances) {
        return mergeFrom((org.apache.skywalking.apm.network.register.v2.ServiceInstances)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.register.v2.ServiceInstances other) {
      if (other == org.apache.skywalking.apm.network.register.v2.ServiceInstances.getDefaultInstance()) return this;
      if (instancesBuilder_ == null) {
        if (!other.instances_.isEmpty()) {
          if (instances_.isEmpty()) {
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstancesIsMutable();
            instances_.addAll(other.instances_);
          }
          onChanged();
        }
      } else {
        if (!other.instances_.isEmpty()) {
          if (instancesBuilder_.isEmpty()) {
            instancesBuilder_.dispose();
            instancesBuilder_ = null;
            instances_ = other.instances_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instancesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInstancesFieldBuilder() : null;
          } else {
            instancesBuilder_.addAllMessages(other.instances_);
          }
        }
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
      org.apache.skywalking.apm.network.register.v2.ServiceInstances parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.register.v2.ServiceInstances) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceInstance> instances_ =
      java.util.Collections.emptyList();
    private void ensureInstancesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        instances_ = new java.util.ArrayList<org.apache.skywalking.apm.network.register.v2.ServiceInstance>(instances_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.register.v2.ServiceInstance, org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder, org.apache.skywalking.apm.network.register.v2.ServiceInstanceOrBuilder> instancesBuilder_;

    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceInstance> getInstancesList() {
      if (instancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instances_);
      } else {
        return instancesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public int getInstancesCount() {
      if (instancesBuilder_ == null) {
        return instances_.size();
      } else {
        return instancesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceInstance getInstances(int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);
      } else {
        return instancesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder setInstances(
        int index, org.apache.skywalking.apm.network.register.v2.ServiceInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.set(index, value);
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder setInstances(
        int index, org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.set(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder addInstances(org.apache.skywalking.apm.network.register.v2.ServiceInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder addInstances(
        int index, org.apache.skywalking.apm.network.register.v2.ServiceInstance value) {
      if (instancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstancesIsMutable();
        instances_.add(index, value);
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder addInstances(
        org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder addInstances(
        int index, org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder builderForValue) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.add(index, builderForValue.build());
        onChanged();
      } else {
        instancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder addAllInstances(
        java.lang.Iterable<? extends org.apache.skywalking.apm.network.register.v2.ServiceInstance> values) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, instances_);
        onChanged();
      } else {
        instancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder clearInstances() {
      if (instancesBuilder_ == null) {
        instances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instancesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public Builder removeInstances(int index) {
      if (instancesBuilder_ == null) {
        ensureInstancesIsMutable();
        instances_.remove(index);
        onChanged();
      } else {
        instancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder getInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceInstanceOrBuilder getInstancesOrBuilder(
        int index) {
      if (instancesBuilder_ == null) {
        return instances_.get(index);  } else {
        return instancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public java.util.List<? extends org.apache.skywalking.apm.network.register.v2.ServiceInstanceOrBuilder> 
         getInstancesOrBuilderList() {
      if (instancesBuilder_ != null) {
        return instancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instances_);
      }
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder addInstancesBuilder() {
      return getInstancesFieldBuilder().addBuilder(
          org.apache.skywalking.apm.network.register.v2.ServiceInstance.getDefaultInstance());
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder addInstancesBuilder(
        int index) {
      return getInstancesFieldBuilder().addBuilder(
          index, org.apache.skywalking.apm.network.register.v2.ServiceInstance.getDefaultInstance());
    }
    /**
     * <code>repeated .ServiceInstance instances = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder> 
         getInstancesBuilderList() {
      return getInstancesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.register.v2.ServiceInstance, org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder, org.apache.skywalking.apm.network.register.v2.ServiceInstanceOrBuilder> 
        getInstancesFieldBuilder() {
      if (instancesBuilder_ == null) {
        instancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.apm.network.register.v2.ServiceInstance, org.apache.skywalking.apm.network.register.v2.ServiceInstance.Builder, org.apache.skywalking.apm.network.register.v2.ServiceInstanceOrBuilder>(
                instances_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        instances_ = null;
      }
      return instancesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ServiceInstances)
  }

  // @@protoc_insertion_point(class_scope:ServiceInstances)
  private static final org.apache.skywalking.apm.network.register.v2.ServiceInstances DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.register.v2.ServiceInstances();
  }

  public static org.apache.skywalking.apm.network.register.v2.ServiceInstances getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceInstances>
      PARSER = new com.google.protobuf.AbstractParser<ServiceInstances>() {
    public ServiceInstances parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServiceInstances(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServiceInstances> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceInstances> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.register.v2.ServiceInstances getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

