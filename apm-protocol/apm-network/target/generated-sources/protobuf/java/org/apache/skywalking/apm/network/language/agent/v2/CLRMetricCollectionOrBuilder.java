// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language-agent-v2/CLRMetric.proto

package org.apache.skywalking.apm.network.language.agent.v2;

public interface CLRMetricCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CLRMetricCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .CLRMetric metrics = 1;</code>
   */
  java.util.List<org.apache.skywalking.apm.network.language.agent.CLRMetric> 
      getMetricsList();
  /**
   * <code>repeated .CLRMetric metrics = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.CLRMetric getMetrics(int index);
  /**
   * <code>repeated .CLRMetric metrics = 1;</code>
   */
  int getMetricsCount();
  /**
   * <code>repeated .CLRMetric metrics = 1;</code>
   */
  java.util.List<? extends org.apache.skywalking.apm.network.language.agent.CLRMetricOrBuilder> 
      getMetricsOrBuilderList();
  /**
   * <code>repeated .CLRMetric metrics = 1;</code>
   */
  org.apache.skywalking.apm.network.language.agent.CLRMetricOrBuilder getMetricsOrBuilder(
      int index);

  /**
   * <code>int32 serviceInstanceId = 2;</code>
   */
  int getServiceInstanceId();
}