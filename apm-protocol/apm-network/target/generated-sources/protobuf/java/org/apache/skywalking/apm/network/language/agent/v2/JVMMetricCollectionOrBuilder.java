// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent-v2/JVMMetric.proto

package org.apache.skywalking.apm.network.language.agent.v2;

public interface JVMMetricCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:JVMMetricCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.language.agent.JVMMetric> 
      getMetricsList();
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.JVMMetric getMetrics(int index);
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  int getMetricsCount();
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <code>repeated .JVMMetric metrics = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.JVMMetricOrBuilder getMetricsOrBuilder(
      int index);

  /**
   * <code>int32 serviceInstanceId = 2;</code>
   */
  int getServiceInstanceId();
}