// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

public interface EndpointMappingElementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EndpointMappingElement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 serviceId = 1;</code>
   */
  int getServiceId();

  /**
   * <code>string endpointName = 2;</code>
   */
  java.lang.String getEndpointName();
  /**
   * <code>string endpointName = 2;</code>
   */
  com.google.protobuf.ByteString
      getEndpointNameBytes();

  /**
   * <code>int32 endpointId = 3;</code>
   */
  int getEndpointId();

  /**
   * <code>.DetectPoint from = 4;</code>
   */
  int getFromValue();
  /**
   * <code>.DetectPoint from = 4;</code>
   */
  org.apache.skywalking.apm.network.common.DetectPoint getFrom();
}
