// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/KeyWithStringValue.proto

package org.apache.skywalking.apm.network.language.agent;

public final class KeyWithStringValueOuterClass {
  private KeyWithStringValueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KeyWithStringValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KeyWithStringValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'language-agent/KeyWithStringValue.prot" +
      "o\"0\n\022KeyWithStringValue\022\013\n\003key\030\001 \001(\t\022\r\n\005" +
      "value\030\002 \001(\tBQ\n0org.apache.skywalking.apm" +
      ".network.language.agentP\001\252\002\032SkyWalking.N" +
      "etworkProtocolb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_KeyWithStringValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KeyWithStringValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KeyWithStringValue_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
