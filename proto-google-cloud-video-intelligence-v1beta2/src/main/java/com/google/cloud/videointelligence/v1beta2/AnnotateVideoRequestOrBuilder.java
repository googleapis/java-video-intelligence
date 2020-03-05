/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1beta2/video_intelligence.proto

package com.google.cloud.videointelligence.v1beta2;

public interface AnnotateVideoRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta2.AnnotateVideoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Input video location. Currently, only
   * [Google Cloud Storage](https://cloud.google.com/storage/) URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket-id/object-id` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For
   * more information, see [Request URIs](https://cloud.google.com/storage/docs/request-endpoints). A video
   * URI may include wildcards in `object-id`, and thus identify multiple
   * videos. Supported wildcards: '*' to match 0 or more characters;
   * '?' to match 1 character. If unset, the input video should be embedded
   * in the request as `input_content`. If set, `input_content` should be unset.
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The inputUri.
   */
  java.lang.String getInputUri();
  /**
   *
   *
   * <pre>
   * Input video location. Currently, only
   * [Google Cloud Storage](https://cloud.google.com/storage/) URIs are
   * supported, which must be specified in the following format:
   * `gs://bucket-id/object-id` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For
   * more information, see [Request URIs](https://cloud.google.com/storage/docs/request-endpoints). A video
   * URI may include wildcards in `object-id`, and thus identify multiple
   * videos. Supported wildcards: '*' to match 0 or more characters;
   * '?' to match 1 character. If unset, the input video should be embedded
   * in the request as `input_content`. If set, `input_content` should be unset.
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The bytes for inputUri.
   */
  com.google.protobuf.ByteString getInputUriBytes();

  /**
   *
   *
   * <pre>
   * The video data bytes.
   * If unset, the input video(s) should be specified via `input_uri`.
   * If set, `input_uri` should be unset.
   * </pre>
   *
   * <code>bytes input_content = 6;</code>
   *
   * @return The inputContent.
   */
  com.google.protobuf.ByteString getInputContent();

  /**
   *
   *
   * <pre>
   * Required. Requested video annotation features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.Feature features = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the features.
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.Feature> getFeaturesList();
  /**
   *
   *
   * <pre>
   * Required. Requested video annotation features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.Feature features = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of features.
   */
  int getFeaturesCount();
  /**
   *
   *
   * <pre>
   * Required. Requested video annotation features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.Feature features = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The features at the given index.
   */
  com.google.cloud.videointelligence.v1beta2.Feature getFeatures(int index);
  /**
   *
   *
   * <pre>
   * Required. Requested video annotation features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.Feature features = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for features.
   */
  java.util.List<java.lang.Integer> getFeaturesValueList();
  /**
   *
   *
   * <pre>
   * Required. Requested video annotation features.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.videointelligence.v1beta2.Feature features = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of features at the given index.
   */
  int getFeaturesValue(int index);

  /**
   *
   *
   * <pre>
   * Additional video context and/or feature-specific parameters.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.VideoContext video_context = 3;</code>
   *
   * @return Whether the videoContext field is set.
   */
  boolean hasVideoContext();
  /**
   *
   *
   * <pre>
   * Additional video context and/or feature-specific parameters.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.VideoContext video_context = 3;</code>
   *
   * @return The videoContext.
   */
  com.google.cloud.videointelligence.v1beta2.VideoContext getVideoContext();
  /**
   *
   *
   * <pre>
   * Additional video context and/or feature-specific parameters.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.VideoContext video_context = 3;</code>
   */
  com.google.cloud.videointelligence.v1beta2.VideoContextOrBuilder getVideoContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Location where the output (in JSON format) should be stored.
   * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
   * URIs are supported, which must be specified in the following format:
   * `gs://bucket-id/object-id` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For
   * more information, see [Request URIs](https://cloud.google.com/storage/docs/request-endpoints).
   * </pre>
   *
   * <code>string output_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The outputUri.
   */
  java.lang.String getOutputUri();
  /**
   *
   *
   * <pre>
   * Optional. Location where the output (in JSON format) should be stored.
   * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
   * URIs are supported, which must be specified in the following format:
   * `gs://bucket-id/object-id` (other URI formats return
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT]). For
   * more information, see [Request URIs](https://cloud.google.com/storage/docs/request-endpoints).
   * </pre>
   *
   * <code>string output_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for outputUri.
   */
  com.google.protobuf.ByteString getOutputUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Cloud region where annotation should take place. Supported cloud
   * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region
   * is specified, a region will be determined based on video file location.
   * </pre>
   *
   * <code>string location_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * Optional. Cloud region where annotation should take place. Supported cloud
   * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region
   * is specified, a region will be determined based on video file location.
   * </pre>
   *
   * <code>string location_id = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();
}
