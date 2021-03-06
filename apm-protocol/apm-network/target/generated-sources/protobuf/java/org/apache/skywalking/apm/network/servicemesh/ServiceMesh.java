// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service-mesh-probe/service-mesh.proto

package org.apache.skywalking.apm.network.servicemesh;

public final class ServiceMesh {
  private ServiceMesh() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceMeshMetric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceMeshMetric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MeshProbeDownstream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MeshProbeDownstream_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%service-mesh-probe/service-mesh.proto\032" +
      "\023common/common.proto\"\240\003\n\021ServiceMeshMetr" +
      "ic\022\021\n\tstartTime\030\001 \001(\003\022\017\n\007endTime\030\002 \001(\003\022\031" +
      "\n\021sourceServiceName\030\003 \001(\t\022\027\n\017sourceServi" +
      "ceId\030\004 \001(\005\022\035\n\025sourceServiceInstance\030\005 \001(" +
      "\t\022\037\n\027sourceServiceInstanceId\030\006 \001(\005\022\027\n\017de" +
      "stServiceName\030\007 \001(\t\022\025\n\rdestServiceId\030\010 \001" +
      "(\005\022\033\n\023destServiceInstance\030\t \001(\t\022\035\n\025destS" +
      "erviceInstanceId\030\n \001(\005\022\020\n\010endpoint\030\013 \001(\t" +
      "\022\017\n\007latency\030\014 \001(\005\022\024\n\014responseCode\030\r \001(\005\022",
      "\016\n\006status\030\016 \001(\010\022\033\n\010protocol\030\017 \001(\0162\t.Prot" +
      "ocol\022!\n\013detectPoint\030\020 \001(\0162\014.DetectPoint\"" +
      "\025\n\023MeshProbeDownstream*\036\n\010Protocol\022\010\n\004HT" +
      "TP\020\000\022\010\n\004gRPC\020\0012S\n\030ServiceMeshMetricServi" +
      "ce\0227\n\007collect\022\022.ServiceMeshMetric\032\024.Mesh" +
      "ProbeDownstream\"\000(\001B1\n-org.apache.skywal" +
      "king.apm.network.servicemeshP\001b\006proto3"
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
    internal_static_ServiceMeshMetric_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServiceMeshMetric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceMeshMetric_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "SourceServiceName", "SourceServiceId", "SourceServiceInstance", "SourceServiceInstanceId", "DestServiceName", "DestServiceId", "DestServiceInstance", "DestServiceInstanceId", "Endpoint", "Latency", "ResponseCode", "Status", "Protocol", "DetectPoint", });
    internal_static_MeshProbeDownstream_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MeshProbeDownstream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MeshProbeDownstream_descriptor,
        new java.lang.String[] { });
    org.apache.skywalking.apm.network.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
