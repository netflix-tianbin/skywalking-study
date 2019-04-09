// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

public final class RegisterOuterClass {
  private RegisterOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Services_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Services_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceRegisterMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceRegisterMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceInstances_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceInstances_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceInstance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceInstanceRegisterMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceInstanceRegisterMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NetAddresses_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NetAddresses_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NetAddressMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NetAddressMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Enpoints_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Enpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EndpointMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EndpointMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EndpointMappingElement_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EndpointMappingElement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceAndNetworkAddressMappings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceAndNetworkAddressMappings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServiceAndNetworkAddressMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServiceAndNetworkAddressMapping_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027register/Register.proto\032\023common/common" +
      ".proto\"&\n\010Services\022\032\n\010services\030\001 \003(\0132\010.S" +
      "ervice\"j\n\007Service\022\023\n\013serviceName\030\001 \001(\t\022!" +
      "\n\004tags\030\003 \003(\0132\023.KeyStringValuePair\022\'\n\npro" +
      "perties\030\004 \003(\0132\023.KeyStringValuePair\"<\n\026Se" +
      "rviceRegisterMapping\022\"\n\010services\030\001 \003(\0132\020" +
      ".KeyIntValuePair\"7\n\020ServiceInstances\022#\n\t" +
      "instances\030\001 \003(\0132\020.ServiceInstance\"\224\001\n\017Se" +
      "rviceInstance\022\021\n\tserviceId\030\001 \001(\005\022\024\n\014inst" +
      "anceUUID\030\002 \001(\t\022\014\n\004time\030\003 \001(\003\022!\n\004tags\030\004 \003",
      "(\0132\023.KeyStringValuePair\022\'\n\nproperties\030\005 " +
      "\003(\0132\023.KeyStringValuePair\"L\n\036ServiceInsta" +
      "nceRegisterMapping\022*\n\020serviceInstances\030\001" +
      " \003(\0132\020.KeyIntValuePair\"!\n\014NetAddresses\022\021" +
      "\n\taddresses\030\001 \003(\t\"9\n\021NetAddressMapping\022$" +
      "\n\naddressIds\030\001 \003(\0132\020.KeyIntValuePair\"(\n\010" +
      "Enpoints\022\034\n\tendpoints\030\001 \003(\0132\t.Endpoint\"\233" +
      "\001\n\010Endpoint\022\021\n\tserviceId\030\001 \001(\005\022\024\n\014endpoi" +
      "ntName\030\002 \001(\t\022!\n\004tags\030\003 \003(\0132\023.KeyStringVa" +
      "luePair\022\'\n\nproperties\030\004 \003(\0132\023.KeyStringV",
      "aluePair\022\032\n\004from\030\005 \001(\0162\014.DetectPoint\"<\n\017" +
      "EndpointMapping\022)\n\010elements\030\001 \003(\0132\027.Endp" +
      "ointMappingElement\"q\n\026EndpointMappingEle" +
      "ment\022\021\n\tserviceId\030\001 \001(\005\022\024\n\014endpointName\030" +
      "\002 \001(\t\022\022\n\nendpointId\030\003 \001(\005\022\032\n\004from\030\004 \001(\0162" +
      "\014.DetectPoint\"V\n ServiceAndNetworkAddres" +
      "sMappings\0222\n\010mappings\030\001 \003(\0132 .ServiceAnd" +
      "NetworkAddressMapping\"\201\001\n\037ServiceAndNetw" +
      "orkAddressMapping\022\021\n\tserviceId\030\001 \001(\005\022\031\n\021" +
      "serviceInstanceId\030\002 \001(\005\022\026\n\016networkAddres",
      "s\030\003 \001(\t\022\030\n\020networkAddressId\030\004 \001(\0052\353\002\n\010Re" +
      "gister\0229\n\021doServiceRegister\022\t.Services\032\027" +
      ".ServiceRegisterMapping\"\000\022Q\n\031doServiceIn" +
      "stanceRegister\022\021.ServiceInstances\032\037.Serv" +
      "iceInstanceRegisterMapping\"\000\0223\n\022doEndpoi" +
      "ntRegister\022\t.Enpoints\032\020.EndpointMapping\"" +
      "\000\022?\n\030doNetworkAddressRegister\022\r.NetAddre" +
      "sses\032\022.NetAddressMapping\"\000\022[\n)doServiceA" +
      "ndNetworkAddressMappingRegister\022!.Servic" +
      "eAndNetworkAddressMappings\032\t.Commands\"\000B",
      "N\n-org.apache.skywalking.apm.network.reg" +
      "ister.v2P\001\252\002\032SkyWalking.NetworkProtocolb" +
      "\006proto3"
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
    internal_static_Services_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Services_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Services_descriptor,
        new java.lang.String[] { "Services", });
    internal_static_Service_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Service_descriptor,
        new java.lang.String[] { "ServiceName", "Tags", "Properties", });
    internal_static_ServiceRegisterMapping_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ServiceRegisterMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceRegisterMapping_descriptor,
        new java.lang.String[] { "Services", });
    internal_static_ServiceInstances_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ServiceInstances_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceInstances_descriptor,
        new java.lang.String[] { "Instances", });
    internal_static_ServiceInstance_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ServiceInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceInstance_descriptor,
        new java.lang.String[] { "ServiceId", "InstanceUUID", "Time", "Tags", "Properties", });
    internal_static_ServiceInstanceRegisterMapping_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ServiceInstanceRegisterMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceInstanceRegisterMapping_descriptor,
        new java.lang.String[] { "ServiceInstances", });
    internal_static_NetAddresses_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_NetAddresses_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NetAddresses_descriptor,
        new java.lang.String[] { "Addresses", });
    internal_static_NetAddressMapping_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_NetAddressMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NetAddressMapping_descriptor,
        new java.lang.String[] { "AddressIds", });
    internal_static_Enpoints_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_Enpoints_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Enpoints_descriptor,
        new java.lang.String[] { "Endpoints", });
    internal_static_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Endpoint_descriptor,
        new java.lang.String[] { "ServiceId", "EndpointName", "Tags", "Properties", "From", });
    internal_static_EndpointMapping_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_EndpointMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EndpointMapping_descriptor,
        new java.lang.String[] { "Elements", });
    internal_static_EndpointMappingElement_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_EndpointMappingElement_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EndpointMappingElement_descriptor,
        new java.lang.String[] { "ServiceId", "EndpointName", "EndpointId", "From", });
    internal_static_ServiceAndNetworkAddressMappings_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_ServiceAndNetworkAddressMappings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceAndNetworkAddressMappings_descriptor,
        new java.lang.String[] { "Mappings", });
    internal_static_ServiceAndNetworkAddressMapping_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_ServiceAndNetworkAddressMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServiceAndNetworkAddressMapping_descriptor,
        new java.lang.String[] { "ServiceId", "ServiceInstanceId", "NetworkAddress", "NetworkAddressId", });
    org.apache.skywalking.apm.network.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}