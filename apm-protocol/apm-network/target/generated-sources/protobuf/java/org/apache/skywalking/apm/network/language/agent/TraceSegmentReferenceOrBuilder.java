// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/TraceSegmentService.proto

package org.apache.skywalking.apm.network.language.agent;

public interface TraceSegmentReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TraceSegmentReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.RefType refType = 1;</code>
   */
  int getRefTypeValue();
  /**
   * <code>.RefType refType = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.RefType getRefType();

  /**
   * <code>.UniqueId parentTraceSegmentId = 2;</code>
   */
  boolean hasParentTraceSegmentId();
  /**
   * <code>.UniqueId parentTraceSegmentId = 2;</code>
   */
  org.apache.skywalking.apm.network.language.agent.UniqueId getParentTraceSegmentId();
  /**
   * <code>.UniqueId parentTraceSegmentId = 2;</code>
   */
  org.apache.skywalking.apm.network.language.agent.UniqueIdOrBuilder getParentTraceSegmentIdOrBuilder();

  /**
   * <code>int32 parentSpanId = 3;</code>
   */
  int getParentSpanId();

  /**
   * <code>int32 parentApplicationInstanceId = 4;</code>
   */
  int getParentApplicationInstanceId();

  /**
   * <code>string networkAddress = 5;</code>
   */
  java.lang.String getNetworkAddress();
  /**
   * <code>string networkAddress = 5;</code>
   */
  com.google.protobuf.ByteString
      getNetworkAddressBytes();

  /**
   * <code>int32 networkAddressId = 6;</code>
   */
  int getNetworkAddressId();

  /**
   * <code>int32 entryApplicationInstanceId = 7;</code>
   */
  int getEntryApplicationInstanceId();

  /**
   * <code>string entryServiceName = 8;</code>
   */
  java.lang.String getEntryServiceName();
  /**
   * <code>string entryServiceName = 8;</code>
   */
  com.google.protobuf.ByteString
      getEntryServiceNameBytes();

  /**
   * <code>int32 entryServiceId = 9;</code>
   */
  int getEntryServiceId();

  /**
   * <code>string parentServiceName = 10;</code>
   */
  java.lang.String getParentServiceName();
  /**
   * <code>string parentServiceName = 10;</code>
   */
  com.google.protobuf.ByteString
      getParentServiceNameBytes();

  /**
   * <code>int32 parentServiceId = 11;</code>
   */
  int getParentServiceId();
}
