// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/DiscoveryService.proto

package org.apache.skywalking.apm.network.language.agent;

public final class DiscoveryService {
  private DiscoveryService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApplicationInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApplicationInstance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApplicationInstanceMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApplicationInstanceMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApplicationInstanceRecover_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApplicationInstanceRecover_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApplicationInstanceHeartbeat_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApplicationInstanceHeartbeat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OSInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OSInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceNameCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceNameCollection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceNameMappingCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceNameMappingCollection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceNameMappingElement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceNameMappingElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceNameElement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceNameElement_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%language-agent/DiscoveryService.proto\032" +
      "\037language-agent/Downstream.proto\032\031common" +
      "/trace-common.proto\"n\n\023ApplicationInstan" +
      "ce\022\025\n\rapplicationId\030\001 \001(\005\022\021\n\tagentUUID\030\002" +
      " \001(\t\022\024\n\014registerTime\030\003 \001(\003\022\027\n\006osinfo\030\004 \001" +
      "(\0132\007.OSInfo\"R\n\032ApplicationInstanceMappin" +
      "g\022\025\n\rapplicationId\030\001 \001(\005\022\035\n\025applicationI" +
      "nstanceId\030\002 \001(\005\"\201\001\n\032ApplicationInstanceR" +
      "ecover\022\025\n\rapplicationId\030\001 \001(\005\022\035\n\025applica" +
      "tionInstanceId\030\002 \001(\005\022\024\n\014registerTime\030\003 \001",
      "(\003\022\027\n\006osinfo\030\004 \001(\0132\007.OSInfo\"T\n\034Applicati" +
      "onInstanceHeartbeat\022\035\n\025applicationInstan" +
      "ceId\030\001 \001(\005\022\025\n\rheartbeatTime\030\002 \001(\003\"L\n\006OSI" +
      "nfo\022\016\n\006osName\030\001 \001(\t\022\020\n\010hostname\030\002 \001(\t\022\021\n" +
      "\tprocessNo\030\003 \001(\005\022\r\n\005ipv4s\030\004 \003(\t\">\n\025Servi" +
      "ceNameCollection\022%\n\010elements\030\001 \003(\0132\023.Ser" +
      "viceNameElement\"L\n\034ServiceNameMappingCol" +
      "lection\022,\n\010elements\030\001 \003(\0132\032.ServiceNameM" +
      "appingElement\"T\n\031ServiceNameMappingEleme" +
      "nt\022\021\n\tserviceId\030\001 \001(\005\022$\n\007element\030\002 \001(\0132\023",
      ".ServiceNameElement\"`\n\022ServiceNameElemen" +
      "t\022\023\n\013serviceName\030\001 \001(\t\022\025\n\rapplicationId\030" +
      "\002 \001(\005\022\036\n\013srcSpanType\030\003 \001(\0162\t.SpanType2\236\001" +
      "\n\030InstanceDiscoveryService\022G\n\020registerIn" +
      "stance\022\024.ApplicationInstance\032\033.Applicati" +
      "onInstanceMapping\"\000\0229\n\theartbeat\022\035.Appli" +
      "cationInstanceHeartbeat\032\013.Downstream\"\0002c" +
      "\n\033ServiceNameDiscoveryService\022D\n\tdiscove" +
      "ry\022\026.ServiceNameCollection\032\035.ServiceName" +
      "MappingCollection\"\000BQ\n0org.apache.skywal",
      "king.apm.network.language.agentP\001\252\002\032SkyW" +
      "alking.NetworkProtocolb\006proto3"
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
          org.apache.skywalking.apm.network.language.agent.DownstreamOuterClass.getDescriptor(),
          org.apache.skywalking.apm.network.language.agent.TraceCommon.getDescriptor(),
        }, assigner);
    internal_static_ApplicationInstance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ApplicationInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApplicationInstance_descriptor,
        new java.lang.String[] { "ApplicationId", "AgentUUID", "RegisterTime", "Osinfo", });
    internal_static_ApplicationInstanceMapping_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ApplicationInstanceMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApplicationInstanceMapping_descriptor,
        new java.lang.String[] { "ApplicationId", "ApplicationInstanceId", });
    internal_static_ApplicationInstanceRecover_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ApplicationInstanceRecover_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApplicationInstanceRecover_descriptor,
        new java.lang.String[] { "ApplicationId", "ApplicationInstanceId", "RegisterTime", "Osinfo", });
    internal_static_ApplicationInstanceHeartbeat_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ApplicationInstanceHeartbeat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApplicationInstanceHeartbeat_descriptor,
        new java.lang.String[] { "ApplicationInstanceId", "HeartbeatTime", });
    internal_static_OSInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_OSInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OSInfo_descriptor,
        new java.lang.String[] { "OsName", "Hostname", "ProcessNo", "Ipv4S", });
    internal_static_ServiceNameCollection_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ServiceNameCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceNameCollection_descriptor,
        new java.lang.String[] { "Elements", });
    internal_static_ServiceNameMappingCollection_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ServiceNameMappingCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceNameMappingCollection_descriptor,
        new java.lang.String[] { "Elements", });
    internal_static_ServiceNameMappingElement_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ServiceNameMappingElement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceNameMappingElement_descriptor,
        new java.lang.String[] { "ServiceId", "Element", });
    internal_static_ServiceNameElement_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_ServiceNameElement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceNameElement_descriptor,
        new java.lang.String[] { "ServiceName", "ApplicationId", "SrcSpanType", });
    org.apache.skywalking.apm.network.language.agent.DownstreamOuterClass.getDescriptor();
    org.apache.skywalking.apm.network.language.agent.TraceCommon.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
