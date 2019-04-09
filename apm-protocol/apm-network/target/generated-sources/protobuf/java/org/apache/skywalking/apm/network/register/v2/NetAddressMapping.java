// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

/**
 * Protobuf type {@code NetAddressMapping}
 */
public  final class NetAddressMapping extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NetAddressMapping)
    NetAddressMappingOrBuilder {
  // Use NetAddressMapping.newBuilder() to construct.
  private NetAddressMapping(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NetAddressMapping() {
    addressIds_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private NetAddressMapping(
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
              addressIds_ = new java.util.ArrayList<org.apache.skywalking.apm.network.common.KeyIntValuePair>();
              mutable_bitField0_ |= 0x00000001;
            }
            addressIds_.add(
                input.readMessage(org.apache.skywalking.apm.network.common.KeyIntValuePair.parser(), extensionRegistry));
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
        addressIds_ = java.util.Collections.unmodifiableList(addressIds_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_NetAddressMapping_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_NetAddressMapping_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.register.v2.NetAddressMapping.class, org.apache.skywalking.apm.network.register.v2.NetAddressMapping.Builder.class);
  }

  public static final int ADDRESSIDS_FIELD_NUMBER = 1;
  private java.util.List<org.apache.skywalking.apm.network.common.KeyIntValuePair> addressIds_;
  /**
   * <code>repeated .KeyIntValuePair addressIds = 1;</code>
   */
  public java.util.List<org.apache.skywalking.apm.network.common.KeyIntValuePair> getAddressIdsList() {
    return addressIds_;
  }
  /**
   * <code>repeated .KeyIntValuePair addressIds = 1;</code>
   */
  public java.util.List<? extends org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder> 
      getAddressIdsOrBuilderList() {
    return addressIds_;
  }
  /**
   * <code>repeated .KeyIntValuePair addressIds = 1;</code>
   */
  public int getAddressIdsCount() {
    return addressIds_.size();
  }
  /**
   * <code>repeated .KeyIntValuePair addressIds = 1;</code>
   */
  public org.apache.skywalking.apm.network.common.KeyIntValuePair getAddressIds(int index) {
    return addressIds_.get(index);
  }
  /**
   * <code>repeated .KeyIntValuePair addressIds = 1;</code>
   */
  public org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder getAddressIdsOrBuilder(
      int index) {
    return addressIds_.get(index);
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
    for (int i = 0; i < addressIds_.size(); i++) {
      output.writeMessage(1, addressIds_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < addressIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, addressIds_.get(i));
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
    if (!(obj instanceof org.apache.skywalking.apm.network.register.v2.NetAddressMapping)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.register.v2.NetAddressMapping other = (org.apache.skywalking.apm.network.register.v2.NetAddressMapping) obj;

    boolean result = true;
    result = result && getAddressIdsList()
        .equals(other.getAddressIdsList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAddressIdsCount() > 0) {
      hash = (37 * hash) + ADDRESSIDS_FIELD_NUMBER;
      hash = (53 * hash) + getAddressIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.register.v2.NetAddressMapping prototype) {
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
   * Protobuf type {@code NetAddressMapping}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NetAddressMapping)
      org.apache.skywalking.apm.network.register.v2.NetAddressMappingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_NetAddressMapping_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_NetAddressMapping_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.register.v2.NetAddressMapping.class, org.apache.skywalking.apm.network.register.v2.NetAddressMapping.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.register.v2.NetAddressMapping.newBuilder()
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
        getAddressIdsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (addressIdsBuilder_ == null) {
        addressIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        addressIdsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.register.v2.RegisterOuterClass.internal_static_NetAddressMapping_descriptor;
    }

    public org.apache.skywalking.apm.network.register.v2.NetAddressMapping getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.register.v2.NetAddressMapping.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.register.v2.NetAddressMapping build() {
      org.apache.skywalking.apm.network.register.v2.NetAddressMapping result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.register.v2.NetAddressMapping buildPartial() {
      org.apache.skywalking.apm.network.register.v2.NetAddressMapping result = new org.apache.skywalking.apm.network.register.v2.NetAddressMapping(this);
      int from_bitField0_ = bitField0_;
      if (addressIdsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          addressIds_ = java.util.Collections.unmodifiableList(addressIds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.addressIds_ = addressIds_;
      } else {
        result.addressIds_ = addressIdsBuilder_.build();
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
      if (other instanceof org.apache.skywalking.apm.network.register.v2.NetAddressMapping) {
        return mergeFrom((org.apache.skywalking.apm.network.register.v2.NetAddressMapping)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.register.v2.NetAddressMapping other) {
      if (other == org.apache.skywalking.apm.network.register.v2.NetAddressMapping.getDefaultInstance()) return this;
      if (addressIdsBuilder_ == null) {
        if (!other.addressIds_.isEmpty()) {
          if (addressIds_.isEmpty()) {
            addressIds_ = other.addressIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAddressIdsIsMutable();
            addressIds_.addAll(other.addressIds_);
          }
          onChanged();
        }
      } else {
        if (!other.addressIds_.isEmpty()) {
          if (addressIdsBuilder_.isEmpty()) {
            addressIdsBuilder_.dispose();
            addressIdsBuilder_ = null;
            addressIds_ = other.addressIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            addressIdsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAddressIdsFieldBuilder() : null;
          } else {
            addressIdsBuilder_.addAllMessages(other.addressIds_);
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
      org.apache.skywalking.apm.network.register.v2.NetAddressMapping parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.register.v2.NetAddressMapping) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.skywalking.apm.network.common.KeyIntValuePair> addressIds_ =
      java.util.Collections.emptyList();
    private void ensureAddressIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        addressIds_ = new java.util.ArrayList<org.apache.skywalking.apm.network.common.KeyIntValuePair>(addressIds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.common.KeyIntValuePair, org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder, org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder> addressIdsBuilder_;

    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.common.KeyIntValuePair> getAddressIdsList() {
      if (addressIdsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(addressIds_);
      } else {
        return addressIdsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public int getAddressIdsCount() {
      if (addressIdsBuilder_ == null) {
        return addressIds_.size();
      } else {
        return addressIdsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.common.KeyIntValuePair getAddressIds(int index) {
      if (addressIdsBuilder_ == null) {
        return addressIds_.get(index);
      } else {
        return addressIdsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder setAddressIds(
        int index, org.apache.skywalking.apm.network.common.KeyIntValuePair value) {
      if (addressIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIdsIsMutable();
        addressIds_.set(index, value);
        onChanged();
      } else {
        addressIdsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder setAddressIds(
        int index, org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder builderForValue) {
      if (addressIdsBuilder_ == null) {
        ensureAddressIdsIsMutable();
        addressIds_.set(index, builderForValue.build());
        onChanged();
      } else {
        addressIdsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder addAddressIds(org.apache.skywalking.apm.network.common.KeyIntValuePair value) {
      if (addressIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIdsIsMutable();
        addressIds_.add(value);
        onChanged();
      } else {
        addressIdsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder addAddressIds(
        int index, org.apache.skywalking.apm.network.common.KeyIntValuePair value) {
      if (addressIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAddressIdsIsMutable();
        addressIds_.add(index, value);
        onChanged();
      } else {
        addressIdsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder addAddressIds(
        org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder builderForValue) {
      if (addressIdsBuilder_ == null) {
        ensureAddressIdsIsMutable();
        addressIds_.add(builderForValue.build());
        onChanged();
      } else {
        addressIdsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder addAddressIds(
        int index, org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder builderForValue) {
      if (addressIdsBuilder_ == null) {
        ensureAddressIdsIsMutable();
        addressIds_.add(index, builderForValue.build());
        onChanged();
      } else {
        addressIdsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder addAllAddressIds(
        java.lang.Iterable<? extends org.apache.skywalking.apm.network.common.KeyIntValuePair> values) {
      if (addressIdsBuilder_ == null) {
        ensureAddressIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, addressIds_);
        onChanged();
      } else {
        addressIdsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder clearAddressIds() {
      if (addressIdsBuilder_ == null) {
        addressIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        addressIdsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public Builder removeAddressIds(int index) {
      if (addressIdsBuilder_ == null) {
        ensureAddressIdsIsMutable();
        addressIds_.remove(index);
        onChanged();
      } else {
        addressIdsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder getAddressIdsBuilder(
        int index) {
      return getAddressIdsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder getAddressIdsOrBuilder(
        int index) {
      if (addressIdsBuilder_ == null) {
        return addressIds_.get(index);  } else {
        return addressIdsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public java.util.List<? extends org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder> 
         getAddressIdsOrBuilderList() {
      if (addressIdsBuilder_ != null) {
        return addressIdsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(addressIds_);
      }
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder addAddressIdsBuilder() {
      return getAddressIdsFieldBuilder().addBuilder(
          org.apache.skywalking.apm.network.common.KeyIntValuePair.getDefaultInstance());
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder addAddressIdsBuilder(
        int index) {
      return getAddressIdsFieldBuilder().addBuilder(
          index, org.apache.skywalking.apm.network.common.KeyIntValuePair.getDefaultInstance());
    }
    /**
     * <code>repeated .KeyIntValuePair addressIds = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder> 
         getAddressIdsBuilderList() {
      return getAddressIdsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.common.KeyIntValuePair, org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder, org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder> 
        getAddressIdsFieldBuilder() {
      if (addressIdsBuilder_ == null) {
        addressIdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.apm.network.common.KeyIntValuePair, org.apache.skywalking.apm.network.common.KeyIntValuePair.Builder, org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder>(
                addressIds_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        addressIds_ = null;
      }
      return addressIdsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:NetAddressMapping)
  }

  // @@protoc_insertion_point(class_scope:NetAddressMapping)
  private static final org.apache.skywalking.apm.network.register.v2.NetAddressMapping DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.register.v2.NetAddressMapping();
  }

  public static org.apache.skywalking.apm.network.register.v2.NetAddressMapping getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetAddressMapping>
      PARSER = new com.google.protobuf.AbstractParser<NetAddressMapping>() {
    public NetAddressMapping parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NetAddressMapping(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NetAddressMapping> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetAddressMapping> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.register.v2.NetAddressMapping getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

