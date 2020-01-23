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

public interface VideoContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1beta2.VideoContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video
   * is treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment segments = 1;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1beta2.VideoSegment> getSegmentsList();
  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video
   * is treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment segments = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta2.VideoSegment getSegments(int index);
  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video
   * is treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment segments = 1;</code>
   */
  int getSegmentsCount();
  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video
   * is treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment segments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1beta2.VideoSegmentOrBuilder>
      getSegmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Video segments to annotate. The segments may overlap and are not required
   * to be contiguous or span the whole video. If unspecified, each video
   * is treated as a single segment.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1beta2.VideoSegment segments = 1;</code>
   */
  com.google.cloud.videointelligence.v1beta2.VideoSegmentOrBuilder getSegmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.LabelDetectionConfig label_detection_config = 2;
   * </code>
   *
   * @return Whether the labelDetectionConfig field is set.
   */
  boolean hasLabelDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.LabelDetectionConfig label_detection_config = 2;
   * </code>
   *
   * @return The labelDetectionConfig.
   */
  com.google.cloud.videointelligence.v1beta2.LabelDetectionConfig getLabelDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for LABEL_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.LabelDetectionConfig label_detection_config = 2;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.LabelDetectionConfigOrBuilder
      getLabelDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ShotChangeDetectionConfig shot_change_detection_config = 3;
   * </code>
   *
   * @return Whether the shotChangeDetectionConfig field is set.
   */
  boolean hasShotChangeDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ShotChangeDetectionConfig shot_change_detection_config = 3;
   * </code>
   *
   * @return The shotChangeDetectionConfig.
   */
  com.google.cloud.videointelligence.v1beta2.ShotChangeDetectionConfig
      getShotChangeDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for SHOT_CHANGE_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ShotChangeDetectionConfig shot_change_detection_config = 3;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.ShotChangeDetectionConfigOrBuilder
      getShotChangeDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   *
   * @return Whether the explicitContentDetectionConfig field is set.
   */
  boolean hasExplicitContentDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   *
   * @return The explicitContentDetectionConfig.
   */
  com.google.cloud.videointelligence.v1beta2.ExplicitContentDetectionConfig
      getExplicitContentDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * <code>
   * .google.cloud.videointelligence.v1beta2.ExplicitContentDetectionConfig explicit_content_detection_config = 4;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.ExplicitContentDetectionConfigOrBuilder
      getExplicitContentDetectionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.FaceDetectionConfig face_detection_config = 5;
   * </code>
   *
   * @return Whether the faceDetectionConfig field is set.
   */
  boolean hasFaceDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.FaceDetectionConfig face_detection_config = 5;
   * </code>
   *
   * @return The faceDetectionConfig.
   */
  com.google.cloud.videointelligence.v1beta2.FaceDetectionConfig getFaceDetectionConfig();
  /**
   *
   *
   * <pre>
   * Config for FACE_DETECTION.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1beta2.FaceDetectionConfig face_detection_config = 5;
   * </code>
   */
  com.google.cloud.videointelligence.v1beta2.FaceDetectionConfigOrBuilder
      getFaceDetectionConfigOrBuilder();
}
