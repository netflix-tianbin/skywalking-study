// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/JVM.proto

package org.apache.skywalking.apm.network.language.agent;

public final class JVM {
  private JVM() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JVMMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JVMMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Memory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Memory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemoryPool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemoryPool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GC_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020common/JVM.proto\032\023common/common.proto\"" +
      "w\n\tJVMMetric\022\014\n\004time\030\001 \001(\003\022\021\n\003cpu\030\002 \001(\0132" +
      "\004.CPU\022\027\n\006memory\030\003 \003(\0132\007.Memory\022\037\n\nmemory" +
      "Pool\030\004 \003(\0132\013.MemoryPool\022\017\n\002gc\030\005 \003(\0132\003.GC" +
      "\"T\n\006Memory\022\016\n\006isHeap\030\001 \001(\010\022\014\n\004init\030\002 \001(\003" +
      "\022\013\n\003max\030\003 \001(\003\022\014\n\004used\030\004 \001(\003\022\021\n\tcommitted" +
      "\030\005 \001(\003\"`\n\nMemoryPool\022\027\n\004type\030\001 \001(\0162\t.Poo" +
      "lType\022\014\n\004init\030\002 \001(\003\022\013\n\003max\030\003 \001(\003\022\014\n\004used" +
      "\030\004 \001(\003\022\020\n\010commited\030\005 \001(\003\"<\n\002GC\022\031\n\006phrase" +
      "\030\001 \001(\0162\t.GCPhrase\022\r\n\005count\030\002 \001(\003\022\014\n\004time",
      "\030\003 \001(\003*\200\001\n\010PoolType\022\024\n\020CODE_CACHE_USAGE\020" +
      "\000\022\020\n\014NEWGEN_USAGE\020\001\022\020\n\014OLDGEN_USAGE\020\002\022\022\n" +
      "\016SURVIVOR_USAGE\020\003\022\021\n\rPERMGEN_USAGE\020\004\022\023\n\017" +
      "METASPACE_USAGE\020\005*\034\n\010GCPhrase\022\007\n\003NEW\020\000\022\007" +
      "\n\003OLD\020\001BQ\n0org.apache.skywalking.apm.net" +
      "work.language.agentP\001\252\002\032SkyWalking.Netwo" +
      "rkProtocolb\006proto3"
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
          org.apache.skywalking.apm.network.common.Common.getDescriptor(),
        }, assigner);
    internal_static_JVMMetric_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JVMMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JVMMetric_descriptor,
        new java.lang.String[] { "Time", "Cpu", "Memory", "MemoryPool", "Gc", });
    internal_static_Memory_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Memory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Memory_descriptor,
        new java.lang.String[] { "IsHeap", "Init", "Max", "Used", "Committed", });
    internal_static_MemoryPool_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MemoryPool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemoryPool_descriptor,
        new java.lang.String[] { "Type", "Init", "Max", "Used", "Commited", });
    internal_static_GC_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GC_descriptor,
        new java.lang.String[] { "Phrase", "Count", "Time", });
    org.apache.skywalking.apm.network.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}