// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/NetworkAddressRegisterService.proto

package org.apache.skywalking.apm.network.language.agent;

public interface NetworkAddressMappingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:NetworkAddressMappings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .KeyWithIntegerValue addressIds = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.language.agent.KeyWithIntegerValue> 
      getAddressIdsList();
  /**
   * <code>repeated .KeyWithIntegerValue addressIds = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.KeyWithIntegerValue getAddressIds(int index);
  /**
   * <code>repeated .KeyWithIntegerValue addressIds = 1;</code>
   */
  int getAddressIdsCount();
  /**
   * <code>repeated .KeyWithIntegerValue addressIds = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.language.agent.KeyWithIntegerValueOrBuilder> 
      getAddressIdsOrBuilderList();
  /**
   * <code>repeated .KeyWithIntegerValue addressIds = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.KeyWithIntegerValueOrBuilder getAddressIdsOrBuilder(
      int index);
}
