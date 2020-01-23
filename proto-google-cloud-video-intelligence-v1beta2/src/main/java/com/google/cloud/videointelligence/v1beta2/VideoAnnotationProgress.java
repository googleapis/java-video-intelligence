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

/**
 *
 *
 * <pre>
 * Annotation progress for a single video.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1beta2.VideoAnnotationProgress}
 */
public final class VideoAnnotationProgress extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1beta2.VideoAnnotationProgress)
    VideoAnnotationProgressOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoAnnotationProgress.newBuilder() to construct.
  private VideoAnnotationProgress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoAnnotationProgress() {
    inputUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoAnnotationProgress();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VideoAnnotationProgress(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              inputUri_ = s;
              break;
            }
          case 16:
            {
              progressPercent_ = input.readInt32();
              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (startTime_ != null) {
                subBuilder = startTime_.toBuilder();
              }
              startTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startTime_);
                startTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (updateTime_ != null) {
                subBuilder = updateTime_.toBuilder();
              }
              updateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateTime_);
                updateTime_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta2_VideoAnnotationProgress_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1beta2_VideoAnnotationProgress_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress.class,
            com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress.Builder.class);
  }

  public static final int INPUT_URI_FIELD_NUMBER = 1;
  private volatile java.lang.Object inputUri_;
  /**
   *
   *
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The inputUri.
   */
  public java.lang.String getInputUri() {
    java.lang.Object ref = inputUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inputUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Video file location in
   * [Google Cloud Storage](https://cloud.google.com/storage/).
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The bytes for inputUri.
   */
  public com.google.protobuf.ByteString getInputUriBytes() {
    java.lang.Object ref = inputUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      inputUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROGRESS_PERCENT_FIELD_NUMBER = 2;
  private int progressPercent_;
  /**
   *
   *
   * <pre>
   * Approximate percentage processed thus far.
   * Guaranteed to be 100 when fully processed.
   * </pre>
   *
   * <code>int32 progress_percent = 2;</code>
   *
   * @return The progressPercent.
   */
  public int getProgressPercent() {
    return progressPercent_;
  }

  public static final int START_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp startTime_;
  /**
   *
   *
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return Whether the startTime field is set.
   */
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   *
   * @return The startTime.
   */
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * Time when the request was received.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 3;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Time of the most recent update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return Whether the updateTime field is set.
   */
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Time of the most recent update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   *
   * @return The updateTime.
   */
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Time of the most recent update.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getInputUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inputUri_);
    }
    if (progressPercent_ != 0) {
      output.writeInt32(2, progressPercent_);
    }
    if (startTime_ != null) {
      output.writeMessage(3, getStartTime());
    }
    if (updateTime_ != null) {
      output.writeMessage(4, getUpdateTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInputUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inputUri_);
    }
    if (progressPercent_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, progressPercent_);
    }
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStartTime());
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getUpdateTime());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress other =
        (com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress) obj;

    if (!getInputUri().equals(other.getInputUri())) return false;
    if (getProgressPercent() != other.getProgressPercent()) return false;
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
    }
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INPUT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getInputUri().hashCode();
    hash = (37 * hash) + PROGRESS_PERCENT_FIELD_NUMBER;
    hash = (53 * hash) + getProgressPercent();
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Annotation progress for a single video.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1beta2.VideoAnnotationProgress}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1beta2.VideoAnnotationProgress)
      com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgressOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_VideoAnnotationProgress_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_VideoAnnotationProgress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress.class,
              com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress.Builder.class);
    }

    // Construct using
    // com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      inputUri_ = "";

      progressPercent_ = 0;

      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1beta2.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1beta2_VideoAnnotationProgress_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress build() {
      com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress buildPartial() {
      com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress result =
          new com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress(this);
      result.inputUri_ = inputUri_;
      result.progressPercent_ = progressPercent_;
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress) {
        return mergeFrom(
            (com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress other) {
      if (other
          == com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress
              .getDefaultInstance()) return this;
      if (!other.getInputUri().isEmpty()) {
        inputUri_ = other.inputUri_;
        onChanged();
      }
      if (other.getProgressPercent() != 0) {
        setProgressPercent(other.getProgressPercent());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object inputUri_ = "";
    /**
     *
     *
     * <pre>
     * Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @return The inputUri.
     */
    public java.lang.String getInputUri() {
      java.lang.Object ref = inputUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inputUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @return The bytes for inputUri.
     */
    public com.google.protobuf.ByteString getInputUriBytes() {
      java.lang.Object ref = inputUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        inputUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @param value The inputUri to set.
     * @return This builder for chaining.
     */
    public Builder setInputUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      inputUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInputUri() {

      inputUri_ = getDefaultInstance().getInputUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Video file location in
     * [Google Cloud Storage](https://cloud.google.com/storage/).
     * </pre>
     *
     * <code>string input_uri = 1;</code>
     *
     * @param value The bytes for inputUri to set.
     * @return This builder for chaining.
     */
    public Builder setInputUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      inputUri_ = value;
      onChanged();
      return this;
    }

    private int progressPercent_;
    /**
     *
     *
     * <pre>
     * Approximate percentage processed thus far.
     * Guaranteed to be 100 when fully processed.
     * </pre>
     *
     * <code>int32 progress_percent = 2;</code>
     *
     * @return The progressPercent.
     */
    public int getProgressPercent() {
      return progressPercent_;
    }
    /**
     *
     *
     * <pre>
     * Approximate percentage processed thus far.
     * Guaranteed to be 100 when fully processed.
     * </pre>
     *
     * <code>int32 progress_percent = 2;</code>
     *
     * @param value The progressPercent to set.
     * @return This builder for chaining.
     */
    public Builder setProgressPercent(int value) {

      progressPercent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Approximate percentage processed thus far.
     * Guaranteed to be 100 when fully processed.
     * </pre>
     *
     * <code>int32 progress_percent = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProgressPercent() {

      progressPercent_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     *
     * @return Whether the startTime field is set.
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     *
     * @return The startTime.
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
              com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {

      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time when the request was received.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Time of the most recent update.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1beta2.VideoAnnotationProgress)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1beta2.VideoAnnotationProgress)
  private static final com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress();
  }

  public static com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoAnnotationProgress> PARSER =
      new com.google.protobuf.AbstractParser<VideoAnnotationProgress>() {
        @java.lang.Override
        public VideoAnnotationProgress parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VideoAnnotationProgress(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VideoAnnotationProgress> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoAnnotationProgress> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1beta2.VideoAnnotationProgress
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
