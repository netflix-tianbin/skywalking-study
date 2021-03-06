// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/DiscoveryService.proto

package org.apache.skywalking.apm.network.language.agent;

/**
 * Protobuf type {@code ServiceNameMappingElement}
 */
public  final class ServiceNameMappingElement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ServiceNameMappingElement)
    ServiceNameMappingElementOrBuilder {
  // Use ServiceNameMappingElement.newBuilder() to construct.
  private ServiceNameMappingElement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServiceNameMappingElement() {
    serviceId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ServiceNameMappingElement(
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

            serviceId_ = input.readInt32();
            break;
          }
          case 18: {
            org.apache.skywalking.apm.network.language.agent.ServiceNameElement.Builder subBuilder = null;
            if (element_ != null) {
              subBuilder = element_.toBuilder();
            }
            element_ = input.readMessage(org.apache.skywalking.apm.network.language.agent.ServiceNameElement.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(element_);
              element_ = subBuilder.buildPartial();
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
    return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ServiceNameMappingElement_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ServiceNameMappingElement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement.class, org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement.Builder.class);
  }

  public static final int SERVICEID_FIELD_NUMBER = 1;
  private int serviceId_;
  /**
   * <code>int32 serviceId = 1;</code>
   */
  public int getServiceId() {
    return serviceId_;
  }

  public static final int ELEMENT_FIELD_NUMBER = 2;
  private org.apache.skywalking.apm.network.language.agent.ServiceNameElement element_;
  /**
   * <code>.ServiceNameElement element = 2;</code>
   */
  public boolean hasElement() {
    return element_ != null;
  }
  /**
   * <code>.ServiceNameElement element = 2;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.ServiceNameElement getElement() {
    return element_ == null ? org.apache.skywalking.apm.network.language.agent.ServiceNameElement.getDefaultInstance() : element_;
  }
  /**
   * <code>.ServiceNameElement element = 2;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.ServiceNameElementOrBuilder getElementOrBuilder() {
    return getElement();
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
    if (serviceId_ != 0) {
      output.writeInt32(1, serviceId_);
    }
    if (element_ != null) {
      output.writeMessage(2, getElement());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (serviceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, serviceId_);
    }
    if (element_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getElement());
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement other = (org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement) obj;

    boolean result = true;
    result = result && (getServiceId()
        == other.getServiceId());
    result = result && (hasElement() == other.hasElement());
    if (hasElement()) {
      result = result && getElement()
          .equals(other.getElement());
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
    hash = (37 * hash) + SERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + getServiceId();
    if (hasElement()) {
      hash = (37 * hash) + ELEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getElement().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement prototype) {
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
   * Protobuf type {@code ServiceNameMappingElement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ServiceNameMappingElement)
      org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ServiceNameMappingElement_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ServiceNameMappingElement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement.class, org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement.newBuilder()
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
      serviceId_ = 0;

      if (elementBuilder_ == null) {
        element_ = null;
      } else {
        element_ = null;
        elementBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.DiscoveryService.internal_static_ServiceNameMappingElement_descriptor;
    }

    public org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement build() {
      org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement buildPartial() {
      org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement result = new org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement(this);
      result.serviceId_ = serviceId_;
      if (elementBuilder_ == null) {
        result.element_ = element_;
      } else {
        result.element_ = elementBuilder_.build();
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
      if (other instanceof org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement other) {
      if (other == org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement.getDefaultInstance()) return this;
      if (other.getServiceId() != 0) {
        setServiceId(other.getServiceId());
      }
      if (other.hasElement()) {
        mergeElement(other.getElement());
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
      org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int serviceId_ ;
    /**
     * <code>int32 serviceId = 1;</code>
     */
    public int getServiceId() {
      return serviceId_;
    }
    /**
     * <code>int32 serviceId = 1;</code>
     */
    public Builder setServiceId(int value) {
      
      serviceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 serviceId = 1;</code>
     */
    public Builder clearServiceId() {
      
      serviceId_ = 0;
      onChanged();
      return this;
    }

    private org.apache.skywalking.apm.network.language.agent.ServiceNameElement element_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.ServiceNameElement, org.apache.skywalking.apm.network.language.agent.ServiceNameElement.Builder, org.apache.skywalking.apm.network.language.agent.ServiceNameElementOrBuilder> elementBuilder_;
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    public boolean hasElement() {
      return elementBuilder_ != null || element_ != null;
    }
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.ServiceNameElement getElement() {
      if (elementBuilder_ == null) {
        return element_ == null ? org.apache.skywalking.apm.network.language.agent.ServiceNameElement.getDefaultInstance() : element_;
      } else {
        return elementBuilder_.getMessage();
      }
    }
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    public Builder setElement(org.apache.skywalking.apm.network.language.agent.ServiceNameElement value) {
      if (elementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        element_ = value;
        onChanged();
      } else {
        elementBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    public Builder setElement(
        org.apache.skywalking.apm.network.language.agent.ServiceNameElement.Builder builderForValue) {
      if (elementBuilder_ == null) {
        element_ = builderForValue.build();
        onChanged();
      } else {
        elementBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    public Builder mergeElement(org.apache.skywalking.apm.network.language.agent.ServiceNameElement value) {
      if (elementBuilder_ == null) {
        if (element_ != null) {
          element_ =
            org.apache.skywalking.apm.network.language.agent.ServiceNameElement.newBuilder(element_).mergeFrom(value).buildPartial();
        } else {
          element_ = value;
        }
        onChanged();
      } else {
        elementBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    public Builder clearElement() {
      if (elementBuilder_ == null) {
        element_ = null;
        onChanged();
      } else {
        element_ = null;
        elementBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.ServiceNameElement.Builder getElementBuilder() {
      
      onChanged();
      return getElementFieldBuilder().getBuilder();
    }
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.ServiceNameElementOrBuilder getElementOrBuilder() {
      if (elementBuilder_ != null) {
        return elementBuilder_.getMessageOrBuilder();
      } else {
        return element_ == null ?
            org.apache.skywalking.apm.network.language.agent.ServiceNameElement.getDefaultInstance() : element_;
      }
    }
    /**
     * <code>.ServiceNameElement element = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.skywalking.apm.network.language.agent.ServiceNameElement, org.apache.skywalking.apm.network.language.agent.ServiceNameElement.Builder, org.apache.skywalking.apm.network.language.agent.ServiceNameElementOrBuilder> 
        getElementFieldBuilder() {
      if (elementBuilder_ == null) {
        elementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.skywalking.apm.network.language.agent.ServiceNameElement, org.apache.skywalking.apm.network.language.agent.ServiceNameElement.Builder, org.apache.skywalking.apm.network.language.agent.ServiceNameElementOrBuilder>(
                getElement(),
                getParentForChildren(),
                isClean());
        element_ = null;
      }
      return elementBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:ServiceNameMappingElement)
  }

  // @@protoc_insertion_point(class_scope:ServiceNameMappingElement)
  private static final org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement();
  }

  public static org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServiceNameMappingElement>
      PARSER = new com.google.protobuf.AbstractParser<ServiceNameMappingElement>() {
    public ServiceNameMappingElement parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServiceNameMappingElement(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServiceNameMappingElement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServiceNameMappingElement> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.language.agent.ServiceNameMappingElement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

