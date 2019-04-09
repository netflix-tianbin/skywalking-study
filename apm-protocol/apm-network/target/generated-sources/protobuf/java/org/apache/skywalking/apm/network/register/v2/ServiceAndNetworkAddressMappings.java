// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

/**
 * Protobuf type {@code ServiceAndNetworkAddressMappings}
 */
public  final class ServiceAndNetworkAddressMappings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceAndNetworkAddressMappings)
    ServiceAndNetworkAddressMappingsOrBuilder {
  // Use ServiceAndNetworkAddressMappings.newBuilder() to construct.
  private ServiceAndNetworkAddressMappings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceAndNetworkAddressMappings() {
    mappings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ServiceAndNetworkAddressMappings(
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
              mappings_ = new java.util.ArrayList<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping>();
              mutable_bitField0_ |= 0x00000001;
            }
            mappings_.add(
                input.readMessage(org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.parser(), extensionRegistry));
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
        mappings_ = java.util.Collections.unmodifiableList(mappings_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceAndNetworkAddressMappings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceAndNetworkAddressMappings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings.class, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings.Builder.class);
  }

  public static final int MAPPINGS_FIELD_NUMBER = 1;
  private java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping> mappings_;
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  public java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping> getMappingsList() {
    return mappings_;
  }
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  public java.util.List<? extends org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder> 
      getMappingsOrBuilderList() {
    return mappings_;
  }
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  public int getMappingsCount() {
    return mappings_.size();
  }
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping getMappings(int index) {
    return mappings_.get(index);
  }
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder getMappingsOrBuilder(
      int index) {
    return mappings_.get(index);
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
    for (int i = 0; i < mappings_.size(); i++) {
      output.writeMessage(1, mappings_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mappings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mappings_.get(i));
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
    if (!(obj instanceof org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings other = (org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings) obj;

    boolean result = true;
    result = result && getMappingsList()
        .equals(other.getMappingsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMappingsCount() > 0) {
      hash = (37 * hash) + MAPPINGS_FIELD_NUMBER;
      hash = (53 * hash) + getMappingsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings prototype) {
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
   * Protobuf type {@code ServiceAndNetworkAddressMappings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceAndNetworkAddressMappings)
      org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceAndNetworkAddressMappings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceAndNetworkAddressMappings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings.class, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings.newBuilder()
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
        getMappingsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (mappingsBuilder_ == null) {
        mappings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mappingsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_ServiceAndNetworkAddressMappings_descriptor;
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings build() {
      org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings buildPartial() {
      org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings result = new org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings(this);
      int from_bitField0_ = bitField0_;
      if (mappingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          mappings_ = java.util.Collections.unmodifiableList(mappings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mappings_ = mappings_;
      } else {
        result.mappings_ = mappingsBuilder_.build();
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
      if (other instanceof org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings) {
        return mergeFrom((org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings other) {
      if (other == org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings.getDefaultInstance()) return this;
      if (mappingsBuilder_ == null) {
        if (!other.mappings_.isEmpty()) {
          if (mappings_.isEmpty()) {
            mappings_ = other.mappings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMappingsIsMutable();
            mappings_.addAll(other.mappings_);
          }
          onChanged();
        }
      } else {
        if (!other.mappings_.isEmpty()) {
          if (mappingsBuilder_.isEmpty()) {
            mappingsBuilder_.dispose();
            mappingsBuilder_ = null;
            mappings_ = other.mappings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mappingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMappingsFieldBuilder() : null;
          } else {
            mappingsBuilder_.addAllMessages(other.mappings_);
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
      org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping> mappings_ =
      java.util.Collections.emptyList();
    private void ensureMappingsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        mappings_ = new java.util.ArrayList<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping>(mappings_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder> mappingsBuilder_;

    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping> getMappingsList() {
      if (mappingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mappings_);
      } else {
        return mappingsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public int getMappingsCount() {
      if (mappingsBuilder_ == null) {
        return mappings_.size();
      } else {
        return mappingsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping getMappings(int index) {
      if (mappingsBuilder_ == null) {
        return mappings_.get(index);
      } else {
        return mappingsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder setMappings(
        int index, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping value) {
      if (mappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappingsIsMutable();
        mappings_.set(index, value);
        onChanged();
      } else {
        mappingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder setMappings(
        int index, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder builderForValue) {
      if (mappingsBuilder_ == null) {
        ensureMappingsIsMutable();
        mappings_.set(index, builderForValue.build());
        onChanged();
      } else {
        mappingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder addMappings(org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping value) {
      if (mappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappingsIsMutable();
        mappings_.add(value);
        onChanged();
      } else {
        mappingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder addMappings(
        int index, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping value) {
      if (mappingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappingsIsMutable();
        mappings_.add(index, value);
        onChanged();
      } else {
        mappingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder addMappings(
        org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder builderForValue) {
      if (mappingsBuilder_ == null) {
        ensureMappingsIsMutable();
        mappings_.add(builderForValue.build());
        onChanged();
      } else {
        mappingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder addMappings(
        int index, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder builderForValue) {
      if (mappingsBuilder_ == null) {
        ensureMappingsIsMutable();
        mappings_.add(index, builderForValue.build());
        onChanged();
      } else {
        mappingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder addAllMappings(
        java.lang.Iterable<? extends org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping> values) {
      if (mappingsBuilder_ == null) {
        ensureMappingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mappings_);
        onChanged();
      } else {
        mappingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder clearMappings() {
      if (mappingsBuilder_ == null) {
        mappings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mappingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public Builder removeMappings(int index) {
      if (mappingsBuilder_ == null) {
        ensureMappingsIsMutable();
        mappings_.remove(index);
        onChanged();
      } else {
        mappingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder getMappingsBuilder(
        int index) {
      return getMappingsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder getMappingsOrBuilder(
        int index) {
      if (mappingsBuilder_ == null) {
        return mappings_.get(index);  } else {
        return mappingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public java.util.List<? extends org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder> 
         getMappingsOrBuilderList() {
      if (mappingsBuilder_ != null) {
        return mappingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mappings_);
      }
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder addMappingsBuilder() {
      return getMappingsFieldBuilder().addBuilder(
          org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.getDefaultInstance());
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder addMappingsBuilder(
        int index) {
      return getMappingsFieldBuilder().addBuilder(
          index, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.getDefaultInstance());
    }
    /**
     * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder> 
         getMappingsBuilderList() {
      return getMappingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder> 
        getMappingsFieldBuilder() {
      if (mappingsBuilder_ == null) {
        mappingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping.Builder, org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder>(
                mappings_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        mappings_ = null;
      }
      return mappingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ServiceAndNetworkAddressMappings)
  }

  // @@protoc_insertion_point(class_scope:ServiceAndNetworkAddressMappings)
  private static final org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings();
  }

  public static org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceAndNetworkAddressMappings>
      PARSER = new com.google.protobuf.AbstractParser<ServiceAndNetworkAddressMappings>() {
    public ServiceAndNetworkAddressMappings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServiceAndNetworkAddressMappings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServiceAndNetworkAddressMappings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceAndNetworkAddressMappings> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

