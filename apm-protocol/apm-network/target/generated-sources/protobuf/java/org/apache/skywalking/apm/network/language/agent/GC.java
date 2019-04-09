// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/JVM.proto

package org.apache.skywalking.apm.network.language.agent;

/**
 * Protobuf type {@code GC}
 */
public  final class GC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GC)
    GCOrBuilder {
  // Use GC.newBuilder() to construct.
  private GC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GC() {
    phrase_ = 0;
    count_ = 0L;
    time_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GC(
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
            int rawValue = input.readEnum();

            phrase_ = rawValue;
            break;
          }
          case 16: {

            count_ = input.readInt64();
            break;
          }
          case 24: {

            time_ = input.readInt64();
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
    return org.apache.skywalking.apm.network.language.agent.JVM.internal_static_GC_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.skywalking.apm.network.language.agent.JVM.internal_static_GC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.skywalking.apm.network.language.agent.GC.class, org.apache.skywalking.apm.network.language.agent.GC.Builder.class);
  }

  public static final int PHRASE_FIELD_NUMBER = 1;
  private int phrase_;
  /**
   * <code>.GCPhrase phrase = 1;</code>
   */
  public int getPhraseValue() {
    return phrase_;
  }
  /**
   * <code>.GCPhrase phrase = 1;</code>
   */
  public org.apache.skywalking.apm.network.language.agent.GCPhrase getPhrase() {
    org.apache.skywalking.apm.network.language.agent.GCPhrase result = org.apache.skywalking.apm.network.language.agent.GCPhrase.valueOf(phrase_);
    return result == null ? org.apache.skywalking.apm.network.language.agent.GCPhrase.UNRECOGNIZED : result;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private long count_;
  /**
   * <code>int64 count = 2;</code>
   */
  public long getCount() {
    return count_;
  }

  public static final int TIME_FIELD_NUMBER = 3;
  private long time_;
  /**
   * <code>int64 time = 3;</code>
   */
  public long getTime() {
    return time_;
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
    if (phrase_ != org.apache.skywalking.apm.network.language.agent.GCPhrase.NEW.getNumber()) {
      output.writeEnum(1, phrase_);
    }
    if (count_ != 0L) {
      output.writeInt64(2, count_);
    }
    if (time_ != 0L) {
      output.writeInt64(3, time_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (phrase_ != org.apache.skywalking.apm.network.language.agent.GCPhrase.NEW.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, phrase_);
    }
    if (count_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, count_);
    }
    if (time_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, time_);
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
    if (!(obj instanceof org.apache.skywalking.apm.network.language.agent.GC)) {
      return super.equals(obj);
    }
    org.apache.skywalking.apm.network.language.agent.GC other = (org.apache.skywalking.apm.network.language.agent.GC) obj;

    boolean result = true;
    result = result && phrase_ == other.phrase_;
    result = result && (getCount()
        == other.getCount());
    result = result && (getTime()
        == other.getTime());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PHRASE_FIELD_NUMBER;
    hash = (53 * hash) + phrase_;
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCount());
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.skywalking.apm.network.language.agent.GC parseFrom(
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
  public static Builder newBuilder(org.apache.skywalking.apm.network.language.agent.GC prototype) {
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
   * Protobuf type {@code GC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GC)
      org.apache.skywalking.apm.network.language.agent.GCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.skywalking.apm.network.language.agent.JVM.internal_static_GC_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.skywalking.apm.network.language.agent.JVM.internal_static_GC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.skywalking.apm.network.language.agent.GC.class, org.apache.skywalking.apm.network.language.agent.GC.Builder.class);
    }

    // Construct using org.apache.skywalking.apm.network.language.agent.GC.newBuilder()
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
      phrase_ = 0;

      count_ = 0L;

      time_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.skywalking.apm.network.language.agent.JVM.internal_static_GC_descriptor;
    }

    public org.apache.skywalking.apm.network.language.agent.GC getDefaultInstanceForType() {
      return org.apache.skywalking.apm.network.language.agent.GC.getDefaultInstance();
    }

    public org.apache.skywalking.apm.network.language.agent.GC build() {
      org.apache.skywalking.apm.network.language.agent.GC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.apache.skywalking.apm.network.language.agent.GC buildPartial() {
      org.apache.skywalking.apm.network.language.agent.GC result = new org.apache.skywalking.apm.network.language.agent.GC(this);
      result.phrase_ = phrase_;
      result.count_ = count_;
      result.time_ = time_;
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
      if (other instanceof org.apache.skywalking.apm.network.language.agent.GC) {
        return mergeFrom((org.apache.skywalking.apm.network.language.agent.GC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.skywalking.apm.network.language.agent.GC other) {
      if (other == org.apache.skywalking.apm.network.language.agent.GC.getDefaultInstance()) return this;
      if (other.phrase_ != 0) {
        setPhraseValue(other.getPhraseValue());
      }
      if (other.getCount() != 0L) {
        setCount(other.getCount());
      }
      if (other.getTime() != 0L) {
        setTime(other.getTime());
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
      org.apache.skywalking.apm.network.language.agent.GC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.skywalking.apm.network.language.agent.GC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int phrase_ = 0;
    /**
     * <code>.GCPhrase phrase = 1;</code>
     */
    public int getPhraseValue() {
      return phrase_;
    }
    /**
     * <code>.GCPhrase phrase = 1;</code>
     */
    public Builder setPhraseValue(int value) {
      phrase_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.GCPhrase phrase = 1;</code>
     */
    public org.apache.skywalking.apm.network.language.agent.GCPhrase getPhrase() {
      org.apache.skywalking.apm.network.language.agent.GCPhrase result = org.apache.skywalking.apm.network.language.agent.GCPhrase.valueOf(phrase_);
      return result == null ? org.apache.skywalking.apm.network.language.agent.GCPhrase.UNRECOGNIZED : result;
    }
    /**
     * <code>.GCPhrase phrase = 1;</code>
     */
    public Builder setPhrase(org.apache.skywalking.apm.network.language.agent.GCPhrase value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      phrase_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.GCPhrase phrase = 1;</code>
     */
    public Builder clearPhrase() {
      
      phrase_ = 0;
      onChanged();
      return this;
    }

    private long count_ ;
    /**
     * <code>int64 count = 2;</code>
     */
    public long getCount() {
      return count_;
    }
    /**
     * <code>int64 count = 2;</code>
     */
    public Builder setCount(long value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0L;
      onChanged();
      return this;
    }

    private long time_ ;
    /**
     * <code>int64 time = 3;</code>
     */
    public long getTime() {
      return time_;
    }
    /**
     * <code>int64 time = 3;</code>
     */
    public Builder setTime(long value) {
      
      time_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 time = 3;</code>
     */
    public Builder clearTime() {
      
      time_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:GC)
  }

  // @@protoc_insertion_point(class_scope:GC)
  private static final org.apache.skywalking.apm.network.language.agent.GC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.skywalking.apm.network.language.agent.GC();
  }

  public static org.apache.skywalking.apm.network.language.agent.GC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GC>
      PARSER = new com.google.protobuf.AbstractParser<GC>() {
    public GC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GC> getParserForType() {
    return PARSER;
  }

  public org.apache.skywalking.apm.network.language.agent.GC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

