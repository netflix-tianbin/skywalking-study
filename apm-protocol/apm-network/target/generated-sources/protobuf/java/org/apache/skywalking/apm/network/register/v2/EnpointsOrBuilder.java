// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

public interface EnpointsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Enpoints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Endpoint endpoints = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.register.v2.Endpoint> 
      getEndpointsList();
  /**
   * <code>repeated .Endpoint endpoints = 1;</code>
   */
  org.apache.skywalking.apm.network.register.v2.Endpoint getEndpoints(int index);
  /**
   * <code>repeated .Endpoint endpoints = 1;</code>
   */
  int getEndpointsCount();
  /**
   * <code>repeated .Endpoint endpoints = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.register.v2.EndpointOrBuilder> 
      getEndpointsOrBuilderList();
  /**
   * <code>repeated .Endpoint endpoints = 1;</code>
   */
  org.apache.skywalking.apm.network.register.v2.EndpointOrBuilder getEndpointsOrBuilder(
      int index);
}