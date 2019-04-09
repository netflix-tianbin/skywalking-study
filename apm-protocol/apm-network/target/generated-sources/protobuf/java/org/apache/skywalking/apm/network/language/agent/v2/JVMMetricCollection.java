// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent-v2/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v2;

/**
 * Protobuf type {@code JVMMetricCollection}
 */
public  final class JVMMetricCollection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:JVMMetricCollection)
    JVMMetricCollectionOrBuilder {
  // Use JVMMetricCollection.newBuilder() to construct.
  private JVMMetricCollection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JVMMetricCollection() {
    metrics_ = java.util.Collections.emptyList();
    serviceInstanceId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private JVMMetricCollection(
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
              metrics_ = new java.util.ArrayList<org.apache.skywalking.apm.network.language.agent.JVMMetric>();
              mutable_bitField0_ |= 0x00000001;
            }
            metrics_.add(
                input.readMessage(org.apache.skywalking.apm.network.language.agent.JVMMetric.parser(), extensionRegistry));
            break;
          }
          case 16: {

            serviceInstanceId_ = input.readInt32();
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
        metrics_ = java.util.Collections.unmodifiableList(metrics_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.agent.v2.JVMMetric.internal_static_JVMMetricCollection_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.v2.JVMMetric.internal_static_JVMMetricCollection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection.class, org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection.Builder.class);
  }

  private int bitField0_;
  public static final int METRICS_FIELD_NUMBER = 1;
  private java.util.List<org.apache.skywalking.apm.network.language.agent.JVMMetric> metrics_;
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  public java.util.List<org.apache.skywalking.apm.network.language.agent.JVMMetric> getMetricsList() {
    return metrics_;
  }
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  public java.util.List<? extends org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder> 
      getMetricsOrBuilderList() {
    return metrics_;
  }
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  public int getMetricsCount() {
    return metrics_.size();
  }
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.JVMMetric getMetrics(int index) {
    return metrics_.get(index);
  }
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder getMetricsOrBuilder(
      int index) {
    return metrics_.get(index);
  }

  public static final int SERVICEINSTANCEID_FIELD_NUMBER = 2;
  private int serviceInstanceId_;
  /**
   * <code>int32 serviceInstanceId = 2;</code>
   */
  public int getServiceInstanceId() {
    return serviceInstanceId_;
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
    for (int i = 0; i < metrics_.size(); i++) {
      output.writeMessage(1, metrics_.get(i));
    }
    if (serviceInstanceId_ != 0) {
      output.writeInt32(2, serviceInstanceId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < metrics_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, metrics_.get(i));
    }
    if (serviceInstanceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, serviceInstanceId_);
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection other = (org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection) obj;

    boolean result = true;
    result = result && getMetricsList()
        .equals(other.getMetricsList());
    result = result && (getServiceInstanceId()
        == other.getServiceInstanceId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMetricsCount() > 0) {
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetricsList().hashCode();
    }
    hash = (37 * hash) + SERVICEINSTANCEID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceInstanceId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection prototype) {
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
   * Protobuf type {@code JVMMetricCollection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:JVMMetricCollection)
      org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.v2.JVMMetric.internal_static_JVMMetricCollection_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.v2.JVMMetric.internal_static_JVMMetricCollection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection.class, org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection.newBuilder()
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
        getMetricsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        metricsBuilder_.clear();
      }
      serviceInstanceId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.v2.JVMMetric.internal_static_JVMMetricCollection_descriptor;
    }

    public org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection build() {
      org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection buildPartial() {
      org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection result = new org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (metricsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          metrics_ = java.util.Collections.unmodifiableList(metrics_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.metrics_ = metrics_;
      } else {
        result.metrics_ = metricsBuilder_.build();
      }
      result.serviceInstanceId_ = serviceInstanceId_;
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
      if (other instanceof org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection other) {
      if (other == org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection.getDefaultInstance()) return this;
      if (metricsBuilder_ == null) {
        if (!other.metrics_.isEmpty()) {
          if (metrics_.isEmpty()) {
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMetricsIsMutable();
            metrics_.addAll(other.metrics_);
          }
          onChanged();
        }
      } else {
        if (!other.metrics_.isEmpty()) {
          if (metricsBuilder_.isEmpty()) {
            metricsBuilder_.dispose();
            metricsBuilder_ = null;
            metrics_ = other.metrics_;
            bitField0_ = (bitField0_ & ~0x00000001);
            metricsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMetricsFieldBuilder() : null;
          } else {
            metricsBuilder_.addAllMessages(other.metrics_);
          }
        }
      }
      if (other.getServiceInstanceId() != 0) {
        setServiceInstanceId(other.getServiceInstanceId());
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
      org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.apache.skywalking.apm.network.language.agent.JVMMetric> metrics_ =
      java.util.Collections.emptyList();
    private void ensureMetricsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        metrics_ = new java.util.ArrayList<org.apache.skywalking.apm.network.language.agent.JVMMetric>(metrics_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.JVMMetric, org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder, org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder> metricsBuilder_;

    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.language.agent.JVMMetric> getMetricsList() {
      if (metricsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(metrics_);
      } else {
        return metricsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public int getMetricsCount() {
      if (metricsBuilder_ == null) {
        return metrics_.size();
      } else {
        return metricsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.JVMMetric getMetrics(int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);
      } else {
        return metricsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, org.apache.skywalking.apm.network.language.agent.JVMMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.set(index, value);
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder setMetrics(
        int index, org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.set(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder addMetrics(org.apache.skywalking.apm.network.language.agent.JVMMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, org.apache.skywalking.apm.network.language.agent.JVMMetric value) {
      if (metricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMetricsIsMutable();
        metrics_.add(index, value);
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder addMetrics(
        int index, org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder builderForValue) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.add(index, builderForValue.build());
        onChanged();
      } else {
        metricsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder addAllMetrics(
        java.lang.Iterable<? extends org.apache.skywalking.apm.network.language.agent.JVMMetric> values) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, metrics_);
        onChanged();
      } else {
        metricsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder clearMetrics() {
      if (metricsBuilder_ == null) {
        metrics_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        metricsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public Builder removeMetrics(int index) {
      if (metricsBuilder_ == null) {
        ensureMetricsIsMutable();
        metrics_.remove(index);
        onChanged();
      } else {
        metricsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder getMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder getMetricsOrBuilder(
        int index) {
      if (metricsBuilder_ == null) {
        return metrics_.get(index);  } else {
        return metricsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public java.util.List<? extends org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder> 
         getMetricsOrBuilderList() {
      if (metricsBuilder_ != null) {
        return metricsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(metrics_);
      }
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder addMetricsBuilder() {
      return getMetricsFieldBuilder().addBuilder(
          org.apache.skywalking.apm.network.language.agent.JVMMetric.getDefaultInstance());
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder addMetricsBuilder(
        int index) {
      return getMetricsFieldBuilder().addBuilder(
          index, org.apache.skywalking.apm.network.language.agent.JVMMetric.getDefaultInstance());
    }
    /**
     * <code>repeated .JVMMetric metrics = 1;</code>
     */
    public java.util.List<org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder> 
         getMetricsBuilderList() {
      return getMetricsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.JVMMetric, org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder, org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder> 
        getMetricsFieldBuilder() {
      if (metricsBuilder_ == null) {
        metricsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.apache.skywalking.apm.network.language.agent.JVMMetric, org.apache.skywalking.apm.network.language.agent.JVMMetric.Builder, org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder>(
                metrics_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        metrics_ = null;
      }
      return metricsBuilder_;
    }

    private int serviceInstanceId_ ;
    /**
     * <code>int32 serviceInstanceId = 2;</code>
     */
    public int getServiceInstanceId() {
      return serviceInstanceId_;
    }
    /**
     * <code>int32 serviceInstanceId = 2;</code>
     */
    public Builder setServiceInstanceId(int value) {
      
      serviceInstanceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 serviceInstanceId = 2;</code>
     */
    public Builder clearServiceInstanceId() {
      
      serviceInstanceId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:JVMMetricCollection)
  }

  // @@protoc_insertion_point(class_scope:JVMMetricCollection)
  private static final org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection();
  }

  public static org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JVMMetricCollection>
      PARSER = new com.google.protobuf.AbstractParser<JVMMetricCollection>() {
    public JVMMetricCollection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new JVMMetricCollection(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JVMMetricCollection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JVMMetricCollection> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.language.agent.v2.JVMMetricCollection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
