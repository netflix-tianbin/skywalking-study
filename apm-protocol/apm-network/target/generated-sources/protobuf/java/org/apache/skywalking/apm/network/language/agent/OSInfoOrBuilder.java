// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/DiscoveryService.proto

package org.apache.skywalking.apm.network.language.agent;

public interface OSInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OSInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string osName = 1;</code>
   */
  java.lang.String getOsName();
  /**
   * <code>string osName = 1;</code>
   */
  com.google.protobuf.ByteString
      getOsNameBytes();

  /**
   * <code>string hostname = 2;</code>
   */
  java.lang.String getHostname();
  /**
   * <code>string hostname = 2;</code>
   */
  com.google.protobuf.ByteString
      getHostnameBytes();

  /**
   * <code>int32 processNo = 3;</code>
   */
  int getProcessNo();

  /**
   * <code>repeated string ipv4s = 4;</code>
   */
  java.util.List<java.lang.String>
      getIpv4SList();
  /**
   * <code>repeated string ipv4s = 4;</code>
   */
  int getIpv4SCount();
  /**
   * <code>repeated string ipv4s = 4;</code>
   */
  java.lang.String getIpv4S(int index);
  /**
   * <code>repeated string ipv4s = 4;</code>
   */
  com.google.protobuf.ByteString
      getIpv4SBytes(int index);
}
