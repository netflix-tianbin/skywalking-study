// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register/Register.proto

package org.apache.skywalking.apm.network.register.v2;

public interface ServicesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Services)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Service services = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.register.v2.Service> 
      getServicesList();
  /**
   * <code>repeated .Service services = 1;</code>
   */
  org.apache.skywalking.apm.network.register.v2.Service getServices(int index);
  /**
   * <code>repeated .Service services = 1;</code>
   */
  int getServicesCount();
  /**
   * <code>repeated .Service services = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.register.v2.ServiceOrBuilder> 
      getServicesOrBuilderList();
  /**
   * <code>repeated .Service services = 1;</code>
   */
  org.apache.skywalking.apm.network.register.v2.ServiceOrBuilder getServicesOrBuilder(
      int index);
}