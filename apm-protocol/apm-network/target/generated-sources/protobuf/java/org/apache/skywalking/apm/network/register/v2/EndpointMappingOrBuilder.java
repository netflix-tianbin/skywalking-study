// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

public interface EndpointMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EndpointMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .EndpointMappingElement elements = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.register.v2.EndpointMappingElement> 
      getElementsList();
  /**
   * <code>repeated .EndpointMappingElement elements = 1;</code>
   */
  org.apache.skywalking.apm.network.register.v2.EndpointMappingElement getElements(int index);
  /**
   * <code>repeated .EndpointMappingElement elements = 1;</code>
   */
  int getElementsCount();
  /**
   * <code>repeated .EndpointMappingElement elements = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.register.v2.EndpointMappingElementOrBuilder> 
      getElementsOrBuilderList();
  /**
   * <code>repeated .EndpointMappingElement elements = 1;</code>
   */
  org.apache.skywalking.apm.network.register.v2.EndpointMappingElementOrBuilder getElementsOrBuilder(
      int index);
}
