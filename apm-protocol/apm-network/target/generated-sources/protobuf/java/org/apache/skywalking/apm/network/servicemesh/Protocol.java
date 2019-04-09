// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service-mesh-probe/service-mesh.proto

package org.apache.skywalking.apm.network.servicemesh;

/**
 * Protobuf enum {@code Protocol}
 */
public enum Protocol
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HTTP = 0;</code>
   */
  HTTP(0),
  /**
   * <code>gRPC = 1;</code>
   */
  gRPC(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HTTP = 0;</code>
   */
  public static final int HTTP_VALUE = 0;
  /**
   * <code>gRPC = 1;</code>
   */
  public static final int gRPC_VALUE = 1;


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
  public static Protocol valueOf(int value) {
    return forNumber(value);
  }

  public static Protocol forNumber(int value) {
    switch (value) {
      case 0: return HTTP;
      case 1: return gRPC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Protocol>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Protocol> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Protocol>() {
          public Protocol findValueByNumber(int number) {
            return Protocol.forNumber(number);
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
    return org.apache.skywalking.apm.network.servicemesh.ServiceMesh.getDescriptor().getEnumTypes().get(0);
  }

  private static final Protocol[] VALUES = values();

  public static Protocol valueOf(
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

  private Protocol(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Protocol)
}
