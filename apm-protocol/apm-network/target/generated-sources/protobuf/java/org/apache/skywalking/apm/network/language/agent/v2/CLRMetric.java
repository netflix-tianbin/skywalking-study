// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent-v2/CLRMetric.proto

package org.apache.skywalking.apm.network.language.agent.v2;

public final class CLRMetric {
  private CLRMetric() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CLRMetricCollection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CLRMetricCollection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!language-agent-v2/CLRMetric.proto\032\023com" +
      "mon/common.proto\032\020common/CLR.proto\"M\n\023CL" +
      "RMetricCollection\022\033\n\007metrics\030\001 \003(\0132\n.CLR" +
      "Metric\022\031\n\021serviceInstanceId\030\002 \001(\0052F\n\026CLR" +
      "MetricReportService\022,\n\007collect\022\024.CLRMetr" +
      "icCollection\032\t.Commands\"\000BT\n3org.apache." +
      "skywalking.apm.network.language.agent.v2" +
      "P\001\252\002\032SkyWalking.NetworkProtocolb\006proto3"
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
          org.apache.skywalking.apm.network.language.agent.CLR.getDescriptor(),
        }, assigner);
    internal_static_CLRMetricCollection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CLRMetricCollection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CLRMetricCollection_descriptor,
        new java.lang.String[] { "Metrics", "ServiceInstanceId", });
    org.apache.skywalking.apm.network.common.Common.getDescriptor();
    org.apache.skywalking.apm.network.language.agent.CLR.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
