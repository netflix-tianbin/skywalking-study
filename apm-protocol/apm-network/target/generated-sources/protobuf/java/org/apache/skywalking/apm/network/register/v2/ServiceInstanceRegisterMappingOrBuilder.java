// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

public interface ServiceInstanceRegisterMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ServiceInstanceRegisterMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .KeyIntValuePair serviceInstances = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.common.KeyIntValuePair> 
      getServiceInstancesList();
  /**
   * <code>repeated .KeyIntValuePair serviceInstances = 1;</code>
   */
  org.apache.skywalking.apm.network.common.KeyIntValuePair getServiceInstances(int index);
  /**
   * <code>repeated .KeyIntValuePair serviceInstances = 1;</code>
   */
  int getServiceInstancesCount();
  /**
   * <code>repeated .KeyIntValuePair serviceInstances = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder> 
      getServiceInstancesOrBuilderList();
  /**
   * <code>repeated .KeyIntValuePair serviceInstances = 1;</code>
   */
  org.apache.skywalking.apm.network.common.KeyIntValuePairOrBuilder getServiceInstancesOrBuilder(
      int index);
}