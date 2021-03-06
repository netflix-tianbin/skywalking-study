// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/trace-common.proto

package org.apache.skywalking.apm.network.language.agent;

/**
 * Protobuf type {@code UpstreamSegment}
 */
public  final class UpstreamSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpstreamSegment)
    UpstreamSegmentOrBuilder {
  // Use UpstreamSegment.newBuilder() to construct.
  private UpstreamSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpstreamSegment() {
    globalTraceIds_ = java.util.Collections.emptyList();
    segment_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UpstreamSegment(
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
              globalTraceIds_ = new java.util.ArrayList<org.apache.skywalking.apm.network.language.agent.UniqueId>();
              mutable_bitField0_ |= 0x00000001;
            }
            globalTraceIds_.add(
                input.readMessage(org.apache.skywalking.apm.network.language.agent.UniqueId.parser(), extensionRegistry));
            break;
          }
          case 18: {

            segment_ = input.readBytes();
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
        globalTraceIds_ = java.util.Collections.unmodifiableList(globalTraceIds_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.agent.TraceCommon.internal_static_UpstreamSegment_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.TraceCommon.internal_static_UpstreamSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.UpstreamSegment.class, org.apache.skywalking.apm.network.language.agent.UpstreamSegment.Builder.class);
  }

  private int bitField0_;
  public static final int GLOBALTRACEIDS_FIELD_NUMBER = 1;
  private java.util.List<org.apache.skywalking.apm.network.language.agent.UniqueId> globalTraceIds_;
  /**
   * <code>repeated .UniqueId globalTraceIds = 1;</code>
   */
  public java.util.List<org.apache.skywalking.apm.network.language.agent.UniqueId> getGlobalTraceIdsList() {
    return globalTraceIds_;
  }
  /**
   * <code>repeated .UniqueId globalTraceIds = 1;</code>
   */
  public java.util.List<? extends org.apache.skywalking.apm.network.language.agent.UniqueIdOrBuilder> 
      getGlobalTraceIdsOrBuilderList() {
    return globalTraceIds_;
  }
  /**
   * <code>repeated .UniqueId globalTraceIds = 1;</code>
   */
  public int getGlobalTraceIdsCount() {
    return globalTraceIds_.size();
  }
  /**
   * <code>repeated .UniqueId globalTraceIds = 1;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.UniqueId getGlobalTraceIds(int index) {
    return globalTraceIds_.get(index);
  }
  /**
   * <code>repeated .UniqueId globalTraceIds = 1;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.UniqueIdOrBuilder getGlobalTraceIdsOrBuilder(
      int index) {
    return globalTraceIds_.get(index);
  }

  public static final int SEGMENT_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString segment_;
  /**
   * <pre>
   * the byte array of TraceSegmentObject
   * </pre>
   *
   * <code>bytes segment = 2;</code>
   */
  public com.google.protobuf.ByteString getSegment() {
    return segment_;
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
    for (int i = 0; i < globalTraceIds_.size(); i++) {
      output.writeMessage(1, globalTraceIds_.get(i));
    }
    if (!segment_.isEmpty()) {
      output.writeBytes(2, segment_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < globalTraceIds_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, globalTraceIds_.get(i));
    }
    if (!segment_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, segment_);
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.UpstreamSegment)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.UpstreamSegment other = (org.apache.skywalking.apm.network.language.agent.UpstreamSegment) obj;

    boolean result = true;
    result = result && getGlobalTraceIdsList()
        .equals(other.getGlobalTraceIdsList());
    result = result && getSegment()
        .equals(other.getSegment());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getGlobalTraceIdsCount() > 0) {
      hash = (37 * hash) + GLOBALTRACEIDS_FIELD_NUMBER;
      hash = (53 * hash) + getGlobalTraceIdsList().hashCode();
    }
    hash = (37 * hash) + SEGMENT_FIELD_NUMBER;
    hash = (53 * hash) + getSegment().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.UpstreamSegment prototype) {
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
   * Protobuf type {@code UpstreamSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpstreamSegment)
      org.apache.skywalking.apm.network.language.agent.UpstreamSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.TraceCommon.internal_static_UpstreamSegment_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.TraceCommon.internal_static_UpstreamSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.UpstreamSegment.class, org.apache.skywalking.apm.network.language.agent.UpstreamSegment.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.UpstreamSegment.newBuilder()
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
        getGlobalTraceIdsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (globalTraceIdsBuilder_ == null) {
        globalTraceIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        globalTraceIdsBuilder_.clear();
      }
      segment_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.TraceCommon.internal_static_UpstreamSegment_descriptor;
    }

    public org.apache.skywalking.apm.network.language.agent.UpstreamSegment getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.UpstreamSegment.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.language.agent.UpstreamSegment build() {
      org.apache.skywalking.apm.network.language.agent.UpstreamSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.language.agent.UpstreamSegment buildPartial() {
      org.apache.skywalking.apm.network.language.agent.UpstreamSegment result = new org.apache.skywalking.apm.network.language.agent.UpstreamSegment(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (globalTraceIdsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          globalTraceIds_ = java.util.Collections.unmodifiableList(globalTraceIds_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.globalTraceIds_ = globalTraceIds_;
      } else {
        result.globalTraceIds_ = globalTraceIdsBuilder_.build();
      }
      result.segment_ = segment_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.apache.skywalking.apm.network.language.agent.UpstreamSegment) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.UpstreamSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.UpstreamSegment other) {
      if (other == org.apache.skywalking.apm.network.language.agent.UpstreamSegment.getDefaultInstance()) return this;
      if (globalTraceIdsBuilder_ == null) {
        if (!other.globalTraceIds_.isEmpty()) {
          if (globalTraceIds_.isEmpty()) {
            globalTraceIds_ = other.globalTraceIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGlobalTraceIdsIsMutable();
            globalTraceIds_.addAll(other.globalTraceIds_);
          }
          onChanged();
        }
      } else {
        if (!other.globalTraceIds_.isEmpty()) {
          if (globalTraceIdsBuilder_.isEmpty()) {
            globalTraceIdsBuilder_.dispose();
            globalTraceIdsBuilder_ = null;
            globalTraceIds_ = other.globalTraceIds_;
            bitField0_ = (bitField0_ & ~0x00000001);
            globalTraceIdsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getGlobalTraceIdsFieldBuilder() : null;
          } else {
            globalTraceIdsBuilder_.addAllMessages(other.globalTraceIds_);
          }
        }
      }
      if (other.getSegment() != com.google.protobuf.ByteString.EMPTY) {
        setSegment(other.getSegment());
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
      org.apache.skywalking.apm.network.language.agent.UpstreamSegment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.language.agent.UpstreamSegment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.skywalking.apm.network.language.agent.UniqueId> globalTraceIds_ =
      java.util.Collections.emptyList();
    private void ensureGlobalTraceIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        globalTraceIds_ = new java.util.ArrayList<org.apache.skywalking.apm.network.language.agent.UniqueId>(globalTraceIds_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.UniqueId, org.apache.skywalking.apm.network.language.agent.UniqueId.Builder, org.apache.skywalking.apm.network.language.agent.UniqueIdOrBuilder> globalTraceIdsBuilder_;

    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.language.agent.UniqueId> getGlobalTraceIdsList() {
      if (globalTraceIdsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(globalTraceIds_);
      } else {
        return globalTraceIdsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public int getGlobalTraceIdsCount() {
      if (globalTraceIdsBuilder_ == null) {
        return globalTraceIds_.size();
      } else {
        return globalTraceIdsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.UniqueId getGlobalTraceIds(int index) {
      if (globalTraceIdsBuilder_ == null) {
        return globalTraceIds_.get(index);
      } else {
        return globalTraceIdsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder setGlobalTraceIds(
        int index, org.apache.skywalking.apm.network.language.agent.UniqueId value) {
      if (globalTraceIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGlobalTraceIdsIsMutable();
        globalTraceIds_.set(index, value);
        onChanged();
      } else {
        globalTraceIdsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder setGlobalTraceIds(
        int index, org.apache.skywalking.apm.network.language.agent.UniqueId.Builder builderForValue) {
      if (globalTraceIdsBuilder_ == null) {
        ensureGlobalTraceIdsIsMutable();
        globalTraceIds_.set(index, builderForValue.build());
        onChanged();
      } else {
        globalTraceIdsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder addGlobalTraceIds(org.apache.skywalking.apm.network.language.agent.UniqueId value) {
      if (globalTraceIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGlobalTraceIdsIsMutable();
        globalTraceIds_.add(value);
        onChanged();
      } else {
        globalTraceIdsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder addGlobalTraceIds(
        int index, org.apache.skywalking.apm.network.language.agent.UniqueId value) {
      if (globalTraceIdsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGlobalTraceIdsIsMutable();
        globalTraceIds_.add(index, value);
        onChanged();
      } else {
        globalTraceIdsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder addGlobalTraceIds(
        org.apache.skywalking.apm.network.language.agent.UniqueId.Builder builderForValue) {
      if (globalTraceIdsBuilder_ == null) {
        ensureGlobalTraceIdsIsMutable();
        globalTraceIds_.add(builderForValue.build());
        onChanged();
      } else {
        globalTraceIdsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder addGlobalTraceIds(
        int index, org.apache.skywalking.apm.network.language.agent.UniqueId.Builder builderForValue) {
      if (globalTraceIdsBuilder_ == null) {
        ensureGlobalTraceIdsIsMutable();
        globalTraceIds_.add(index, builderForValue.build());
        onChanged();
      } else {
        globalTraceIdsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder addAllGlobalTraceIds(
        java.lang.Iterable<? extends org.apache.skywalking.apm.network.language.agent.UniqueId> values) {
      if (globalTraceIdsBuilder_ == null) {
        ensureGlobalTraceIdsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, globalTraceIds_);
        onChanged();
      } else {
        globalTraceIdsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder clearGlobalTraceIds() {
      if (globalTraceIdsBuilder_ == null) {
        globalTraceIds_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        globalTraceIdsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public Builder removeGlobalTraceIds(int index) {
      if (globalTraceIdsBuilder_ == null) {
        ensureGlobalTraceIdsIsMutable();
        globalTraceIds_.remove(index);
        onChanged();
      } else {
        globalTraceIdsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.UniqueId.Builder getGlobalTraceIdsBuilder(
        int index) {
      return getGlobalTraceIdsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.UniqueIdOrBuilder getGlobalTraceIdsOrBuilder(
        int index) {
      if (globalTraceIdsBuilder_ == null) {
        return globalTraceIds_.get(index);  } else {
        return globalTraceIdsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public java.util.List<? extends org.apache.skywalking.apm.network.language.agent.UniqueIdOrBuilder> 
         getGlobalTraceIdsOrBuilderList() {
      if (globalTraceIdsBuilder_ != null) {
        return globalTraceIdsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(globalTraceIds_);
      }
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.UniqueId.Builder addGlobalTraceIdsBuilder() {
      return getGlobalTraceIdsFieldBuilder().addBuilder(
          org.apache.skywalking.apm.network.language.agent.UniqueId.getDefaultInstance());
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.UniqueId.Builder addGlobalTraceIdsBuilder(
        int index) {
      return getGlobalTraceIdsFieldBuilder().addBuilder(
          index, org.apache.skywalking.apm.network.language.agent.UniqueId.getDefaultInstance());
    }
    /**
     * <code>repeated .UniqueId globalTraceIds = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.language.agent.UniqueId.Builder> 
         getGlobalTraceIdsBuilderList() {
      return getGlobalTraceIdsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.UniqueId, org.apache.skywalking.apm.network.language.agent.UniqueId.Builder, org.apache.skywalking.apm.network.language.agent.UniqueIdOrBuilder> 
        getGlobalTraceIdsFieldBuilder() {
      if (globalTraceIdsBuilder_ == null) {
        globalTraceIdsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.apm.network.language.agent.UniqueId, org.apache.skywalking.apm.network.language.agent.UniqueId.Builder, org.apache.skywalking.apm.network.language.agent.UniqueIdOrBuilder>(
                globalTraceIds_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        globalTraceIds_ = null;
      }
      return globalTraceIdsBuilder_;
    }

    private com.google.protobuf.ByteString segment_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * the byte array of TraceSegmentObject
     * </pre>
     *
     * <code>bytes segment = 2;</code>
     */
    public com.google.protobuf.ByteString getSegment() {
      return segment_;
    }
    /**
     * <pre>
     * the byte array of TraceSegmentObject
     * </pre>
     *
     * <code>bytes segment = 2;</code>
     */
    public Builder setSegment(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      segment_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * the byte array of TraceSegmentObject
     * </pre>
     *
     * <code>bytes segment = 2;</code>
     */
    public Builder clearSegment() {
      
      segment_ = getDefaultInstance().getSegment();
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


    // @@protoc_insertion_point(builder_scope:UpstreamSegment)
  }

  // @@protoc_insertion_point(class_scope:UpstreamSegment)
  private static final org.apache.skywalking.apm.network.language.agent.UpstreamSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.UpstreamSegment();
  }

  public static org.apache.skywalking.apm.network.language.agent.UpstreamSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpstreamSegment>
      PARSER = new com.google.protobuf.AbstractParser<UpstreamSegment>() {
    public UpstreamSegment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpstreamSegment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpstreamSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpstreamSegment> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.language.agent.UpstreamSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

