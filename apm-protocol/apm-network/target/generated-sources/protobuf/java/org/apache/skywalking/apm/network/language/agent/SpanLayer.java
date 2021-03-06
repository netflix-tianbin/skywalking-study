// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/trace-common.proto

package org.apache.skywalking.apm.network.language.agent;

/**
 * Protobuf enum {@code SpanLayer}
 */
public enum SpanLayer
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>Unknown = 0;</code>
   */
  Unknown(0),
  /**
   * <code>Database = 1;</code>
   */
  Database(1),
  /**
   * <code>RPCFramework = 2;</code>
   */
  RPCFramework(2),
  /**
   * <code>Http = 3;</code>
   */
  Http(3),
  /**
   * <code>MQ = 4;</code>
   */
  MQ(4),
  /**
   * <code>Cache = 5;</code>
   */
  Cache(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>Unknown = 0;</code>
   */
  public static final int Unknown_VALUE = 0;
  /**
   * <code>Database = 1;</code>
   */
  public static final int Database_VALUE = 1;
  /**
   * <code>RPCFramework = 2;</code>
   */
  public static final int RPCFramework_VALUE = 2;
  /**
   * <code>Http = 3;</code>
   */
  public static final int Http_VALUE = 3;
  /**
   * <code>MQ = 4;</code>
   */
  public static final int MQ_VALUE = 4;
  /**
   * <code>Cache = 5;</code>
   */
  public static final int Cache_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SpanLayer valueOf(int value) {
    return forNumber(value);
  }

  public static SpanLayer forNumber(int value) {
    switch (value) {
      case 0: return Unknown;
      case 1: return Database;
      case 2: return RPCFramework;
      case 3: return Http;
      case 4: return MQ;
      case 5: return Cache;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SpanLayer>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SpanLayer> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SpanLayer>() {
          public SpanLayer findValueByNumber(int number) {
            return SpanLayer.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.apache.skywalking.apm.network.language.agent.TraceCommon.getDescriptor().getEnumTypes().get(2);
  }

  private static final SpanLayer[] VALUES = values();

  public static SpanLayer valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SpanLayer(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:SpanLayer)
}

