// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent/DiscoveryService.proto

package org.apache.skywalking.apm.network.language.agent;

public interface ServiceNameCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ServiceNameCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ServiceNameElement elements = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.language.agent.ServiceNameElement> 
      getElementsList();
  /**
   * <code>repeated .ServiceNameElement elements = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.ServiceNameElement getElements(int index);
  /**
   * <code>repeated .ServiceNameElement elements = 1;</code>
   */
  int getElementsCount();
  /**
   * <code>repeated .ServiceNameElement elements = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.language.agent.ServiceNameElementOrBuilder> 
      getElementsOrBuilderList();
  /**
   * <code>repeated .ServiceNameElement elements = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.ServiceNameElementOrBuilder getElementsOrBuilder(
      int index);
}
