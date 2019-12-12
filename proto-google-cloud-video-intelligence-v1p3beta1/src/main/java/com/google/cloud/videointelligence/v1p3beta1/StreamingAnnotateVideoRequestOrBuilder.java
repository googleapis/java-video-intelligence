/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/videointelligence/v1p3beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p3beta1;

public interface StreamingAnnotateVideoRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Provides information to the annotator, specifing how to process the
   * request. The first `AnnotateStreamingVideoRequest` message must only
   * contain a `video_config` message.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.StreamingVideoConfig video_config = 1;</code>
   *
   * @return Whether the videoConfig field is set.
   */
  boolean hasVideoConfig();
  /**
   *
   *
   * <pre>
   * Provides information to the annotator, specifing how to process the
   * request. The first `AnnotateStreamingVideoRequest` message must only
   * contain a `video_config` message.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.StreamingVideoConfig video_config = 1;</code>
   *
   * @return The videoConfig.
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingVideoConfig getVideoConfig();
  /**
   *
   *
   * <pre>
   * Provides information to the annotator, specifing how to process the
   * request. The first `AnnotateStreamingVideoRequest` message must only
   * contain a `video_config` message.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p3beta1.StreamingVideoConfig video_config = 1;</code>
   */
  com.google.cloud.videointelligence.v1p3beta1.StreamingVideoConfigOrBuilder
      getVideoConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The video data to be annotated. Chunks of video data are sequentially
   * sent in `StreamingAnnotateVideoRequest` messages. Except the initial
   * `StreamingAnnotateVideoRequest` message containing only
   * `video_config`, all subsequent `AnnotateStreamingVideoRequest`
   * messages must only contain `input_content` field.
   * Note: as with all bytes fields, protobuffers use a pure binary
   * representation (not base64).
   * </pre>
   *
   * <code>bytes input_content = 2;</code>
   *
   * @return The inputContent.
   */
  com.google.protobuf.ByteString getInputContent();

  public com.google.cloud.videointelligence.v1p3beta1.StreamingAnnotateVideoRequest
          .StreamingRequestCase
      getStreamingRequestCase();
}
