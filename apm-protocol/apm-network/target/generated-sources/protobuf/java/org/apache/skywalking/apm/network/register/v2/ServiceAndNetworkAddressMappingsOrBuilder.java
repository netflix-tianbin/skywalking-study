// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

public interface ServiceAndNetworkAddressMappingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ServiceAndNetworkAddressMappings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping> 
      getMappingsList();
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMapping getMappings(int index);
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  int getMappingsCount();
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder> 
      getMappingsOrBuilderList();
  /**
   * <code>repeated .ServiceAndNetworkAddressMapping mappings = 1;</code>
   */
  org.apache.skywalking.apm.network.register.v2.ServiceAndNetworkAddressMappingOrBuilder getMappingsOrBuilder(
      int index);
}
