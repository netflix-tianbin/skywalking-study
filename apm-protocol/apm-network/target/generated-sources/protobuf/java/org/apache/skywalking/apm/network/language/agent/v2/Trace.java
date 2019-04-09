// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent-v2/trace.proto

package org.apache.skywalking.apm.network.language.agent.v2;

public final class Trace {
  private Trace() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SegmentObject_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SegmentObject_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SegmentReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SegmentReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SpanObjectV2_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SpanObjectV2_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Log_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Log_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035language-agent-v2/trace.proto\032\023common/" +
      "common.proto\032\031common/trace-common.proto\"" +
      "\225\001\n\rSegmentObject\022!\n\016traceSegmentId\030\001 \001(" +
      "\0132\t.UniqueId\022\034\n\005spans\030\002 \003(\0132\r.SpanObject" +
      "V2\022\021\n\tserviceId\030\003 \001(\005\022\031\n\021serviceInstance" +
      "Id\030\004 \001(\005\022\025\n\risSizeLimited\030\005 \001(\010\"\301\002\n\020Segm" +
      "entReference\022\031\n\007refType\030\001 \001(\0162\010.RefType\022" +
      "\'\n\024parentTraceSegmentId\030\002 \001(\0132\t.UniqueId" +
      "\022\024\n\014parentSpanId\030\003 \001(\005\022\037\n\027parentServiceI" +
      "nstanceId\030\004 \001(\005\022\026\n\016networkAddress\030\005 \001(\t\022",
      "\030\n\020networkAddressId\030\006 \001(\005\022\036\n\026entryServic" +
      "eInstanceId\030\007 \001(\005\022\025\n\rentryEndpoint\030\010 \001(\t" +
      "\022\027\n\017entryEndpointId\030\t \001(\005\022\026\n\016parentEndpo" +
      "int\030\n \001(\t\022\030\n\020parentEndpointId\030\013 \001(\005\"\363\002\n\014" +
      "SpanObjectV2\022\016\n\006spanId\030\001 \001(\005\022\024\n\014parentSp" +
      "anId\030\002 \001(\005\022\021\n\tstartTime\030\003 \001(\003\022\017\n\007endTime" +
      "\030\004 \001(\003\022\037\n\004refs\030\005 \003(\0132\021.SegmentReference\022" +
      "\027\n\017operationNameId\030\006 \001(\005\022\025\n\roperationNam" +
      "e\030\007 \001(\t\022\016\n\006peerId\030\010 \001(\005\022\014\n\004peer\030\t \001(\t\022\033\n" +
      "\010spanType\030\n \001(\0162\t.SpanType\022\035\n\tspanLayer\030",
      "\013 \001(\0162\n.SpanLayer\022\023\n\013componentId\030\014 \001(\005\022\021" +
      "\n\tcomponent\030\r \001(\t\022\017\n\007isError\030\016 \001(\010\022!\n\004ta" +
      "gs\030\017 \003(\0132\023.KeyStringValuePair\022\022\n\004logs\030\020 " +
      "\003(\0132\004.Log\"6\n\003Log\022\014\n\004time\030\001 \001(\003\022!\n\004data\030\002" +
      " \003(\0132\023.KeyStringValuePair2G\n\031TraceSegmen" +
      "tReportService\022*\n\007collect\022\020.UpstreamSegm" +
      "ent\032\t.Commands\"\000(\001BT\n3org.apache.skywalk" +
      "ing.apm.network.language.agent.v2P\001\252\002\032Sk" +
      "yWalking.NetworkProtocolb\006proto3"
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
          org.apache.skywalking.apm.network.language.agent.TraceCommon.getDescriptor(),
        }, assigner);
    internal_static_SegmentObject_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SegmentObject_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SegmentObject_descriptor,
        new java.lang.String[] { "TraceSegmentId", "Spans", "ServiceId", "ServiceInstanceId", "IsSizeLimited", });
    internal_static_SegmentReference_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SegmentReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SegmentReference_descriptor,
        new java.lang.String[] { "RefType", "ParentTraceSegmentId", "ParentSpanId", "ParentServiceInstanceId", "NetworkAddress", "NetworkAddressId", "EntryServiceInstanceId", "EntryEndpoint", "EntryEndpointId", "ParentEndpoint", "ParentEndpointId", });
    internal_static_SpanObjectV2_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SpanObjectV2_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SpanObjectV2_descriptor,
        new java.lang.String[] { "SpanId", "ParentSpanId", "StartTime", "EndTime", "Refs", "OperationNameId", "OperationName", "PeerId", "Peer", "SpanType", "SpanLayer", "ComponentId", "Component", "IsError", "Tags", "Logs", });
    internal_static_Log_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Log_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Log_descriptor,
        new java.lang.String[] { "Time", "Data", });
    org.apache.skywalking.apm.network.common.Common.getDescriptor();
    org.apache.skywalking.apm.network.language.agent.TraceCommon.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}