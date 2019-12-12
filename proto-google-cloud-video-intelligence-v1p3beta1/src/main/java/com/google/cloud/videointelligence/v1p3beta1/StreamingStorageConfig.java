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

/**
 *
 *
 * <pre>
 * Config for streaming storage option.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig}
 */
public final class StreamingStorageConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig)
    StreamingStorageConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StreamingStorageConfig.newBuilder() to construct.
  private StreamingStorageConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StreamingStorageConfig() {
    annotationResultStorageDirectory_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StreamingStorageConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StreamingStorageConfig(
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
          case 8:
            {
              enableStorageAnnotationResult_ = input.readBool();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              annotationResultStorageDirectory_ = s;
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
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p3beta1_StreamingStorageConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p3beta1_StreamingStorageConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig.class,
            com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig.Builder.class);
  }

  public static final int ENABLE_STORAGE_ANNOTATION_RESULT_FIELD_NUMBER = 1;
  private boolean enableStorageAnnotationResult_;
  /**
   *
   *
   * <pre>
   * Enable streaming storage. Default: false.
   * </pre>
   *
   * <code>bool enable_storage_annotation_result = 1;</code>
   *
   * @return The enableStorageAnnotationResult.
   */
  public boolean getEnableStorageAnnotationResult() {
    return enableStorageAnnotationResult_;
  }

  public static final int ANNOTATION_RESULT_STORAGE_DIRECTORY_FIELD_NUMBER = 3;
  private volatile java.lang.Object annotationResultStorageDirectory_;
  /**
   *
   *
   * <pre>
   * GCS URI to store all annotation results for one client. Client should
   * specify this field as the top-level storage directory. Annotation results
   * of different sessions will be put into different sub-directories denoted
   * by project_name and session_id. All sub-directories will be auto generated
   * by program and will be made accessible to client in response proto.
   * URIs must be specified in the following format: `gs://bucket-id/object-id`
   * `bucket-id` should be a valid GCS bucket created by client and bucket
   * permission shall also be configured properly. `object-id` can be arbitrary
   * string that make sense to client. Other URI formats will return error and
   * cause GCS write failure.
   * </pre>
   *
   * <code>string annotation_result_storage_directory = 3;</code>
   *
   * @return The annotationResultStorageDirectory.
   */
  public java.lang.String getAnnotationResultStorageDirectory() {
    java.lang.Object ref = annotationResultStorageDirectory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      annotationResultStorageDirectory_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * GCS URI to store all annotation results for one client. Client should
   * specify this field as the top-level storage directory. Annotation results
   * of different sessions will be put into different sub-directories denoted
   * by project_name and session_id. All sub-directories will be auto generated
   * by program and will be made accessible to client in response proto.
   * URIs must be specified in the following format: `gs://bucket-id/object-id`
   * `bucket-id` should be a valid GCS bucket created by client and bucket
   * permission shall also be configured properly. `object-id` can be arbitrary
   * string that make sense to client. Other URI formats will return error and
   * cause GCS write failure.
   * </pre>
   *
   * <code>string annotation_result_storage_directory = 3;</code>
   *
   * @return The bytes for annotationResultStorageDirectory.
   */
  public com.google.protobuf.ByteString getAnnotationResultStorageDirectoryBytes() {
    java.lang.Object ref = annotationResultStorageDirectory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      annotationResultStorageDirectory_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (enableStorageAnnotationResult_ != false) {
      output.writeBool(1, enableStorageAnnotationResult_);
    }
    if (!getAnnotationResultStorageDirectoryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 3, annotationResultStorageDirectory_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableStorageAnnotationResult_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableStorageAnnotationResult_);
    }
    if (!getAnnotationResultStorageDirectoryBytes().isEmpty()) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(
              3, annotationResultStorageDirectory_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig other =
        (com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig) obj;

    if (getEnableStorageAnnotationResult() != other.getEnableStorageAnnotationResult())
      return false;
    if (!getAnnotationResultStorageDirectory().equals(other.getAnnotationResultStorageDirectory()))
      return false;
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
    hash = (37 * hash) + ENABLE_STORAGE_ANNOTATION_RESULT_FIELD_NUMBER;
    hash =
        (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableStorageAnnotationResult());
    hash = (37 * hash) + ANNOTATION_RESULT_STORAGE_DIRECTORY_FIELD_NUMBER;
    hash = (53 * hash) + getAnnotationResultStorageDirectory().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parseFrom(
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
      com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig prototype) {
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
   * Config for streaming storage option.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig)
      com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_StreamingStorageConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_StreamingStorageConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig.class,
              com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig.Builder.class);
    }

    // Construct using
    // com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig.newBuilder()
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
      enableStorageAnnotationResult_ = false;

      annotationResultStorageDirectory_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p3beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p3beta1_StreamingStorageConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig build() {
      com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig buildPartial() {
      com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig result =
          new com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig(this);
      result.enableStorageAnnotationResult_ = enableStorageAnnotationResult_;
      result.annotationResultStorageDirectory_ = annotationResultStorageDirectory_;
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
      if (other instanceof com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig) {
        return mergeFrom(
            (com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig other) {
      if (other
          == com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig
              .getDefaultInstance()) return this;
      if (other.getEnableStorageAnnotationResult() != false) {
        setEnableStorageAnnotationResult(other.getEnableStorageAnnotationResult());
      }
      if (!other.getAnnotationResultStorageDirectory().isEmpty()) {
        annotationResultStorageDirectory_ = other.annotationResultStorageDirectory_;
        onChanged();
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
      com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableStorageAnnotationResult_;
    /**
     *
     *
     * <pre>
     * Enable streaming storage. Default: false.
     * </pre>
     *
     * <code>bool enable_storage_annotation_result = 1;</code>
     *
     * @return The enableStorageAnnotationResult.
     */
    public boolean getEnableStorageAnnotationResult() {
      return enableStorageAnnotationResult_;
    }
    /**
     *
     *
     * <pre>
     * Enable streaming storage. Default: false.
     * </pre>
     *
     * <code>bool enable_storage_annotation_result = 1;</code>
     *
     * @param value The enableStorageAnnotationResult to set.
     * @return This builder for chaining.
     */
    public Builder setEnableStorageAnnotationResult(boolean value) {

      enableStorageAnnotationResult_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Enable streaming storage. Default: false.
     * </pre>
     *
     * <code>bool enable_storage_annotation_result = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableStorageAnnotationResult() {

      enableStorageAnnotationResult_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object annotationResultStorageDirectory_ = "";
    /**
     *
     *
     * <pre>
     * GCS URI to store all annotation results for one client. Client should
     * specify this field as the top-level storage directory. Annotation results
     * of different sessions will be put into different sub-directories denoted
     * by project_name and session_id. All sub-directories will be auto generated
     * by program and will be made accessible to client in response proto.
     * URIs must be specified in the following format: `gs://bucket-id/object-id`
     * `bucket-id` should be a valid GCS bucket created by client and bucket
     * permission shall also be configured properly. `object-id` can be arbitrary
     * string that make sense to client. Other URI formats will return error and
     * cause GCS write failure.
     * </pre>
     *
     * <code>string annotation_result_storage_directory = 3;</code>
     *
     * @return The annotationResultStorageDirectory.
     */
    public java.lang.String getAnnotationResultStorageDirectory() {
      java.lang.Object ref = annotationResultStorageDirectory_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        annotationResultStorageDirectory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * GCS URI to store all annotation results for one client. Client should
     * specify this field as the top-level storage directory. Annotation results
     * of different sessions will be put into different sub-directories denoted
     * by project_name and session_id. All sub-directories will be auto generated
     * by program and will be made accessible to client in response proto.
     * URIs must be specified in the following format: `gs://bucket-id/object-id`
     * `bucket-id` should be a valid GCS bucket created by client and bucket
     * permission shall also be configured properly. `object-id` can be arbitrary
     * string that make sense to client. Other URI formats will return error and
     * cause GCS write failure.
     * </pre>
     *
     * <code>string annotation_result_storage_directory = 3;</code>
     *
     * @return The bytes for annotationResultStorageDirectory.
     */
    public com.google.protobuf.ByteString getAnnotationResultStorageDirectoryBytes() {
      java.lang.Object ref = annotationResultStorageDirectory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        annotationResultStorageDirectory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * GCS URI to store all annotation results for one client. Client should
     * specify this field as the top-level storage directory. Annotation results
     * of different sessions will be put into different sub-directories denoted
     * by project_name and session_id. All sub-directories will be auto generated
     * by program and will be made accessible to client in response proto.
     * URIs must be specified in the following format: `gs://bucket-id/object-id`
     * `bucket-id` should be a valid GCS bucket created by client and bucket
     * permission shall also be configured properly. `object-id` can be arbitrary
     * string that make sense to client. Other URI formats will return error and
     * cause GCS write failure.
     * </pre>
     *
     * <code>string annotation_result_storage_directory = 3;</code>
     *
     * @param value The annotationResultStorageDirectory to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationResultStorageDirectory(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      annotationResultStorageDirectory_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCS URI to store all annotation results for one client. Client should
     * specify this field as the top-level storage directory. Annotation results
     * of different sessions will be put into different sub-directories denoted
     * by project_name and session_id. All sub-directories will be auto generated
     * by program and will be made accessible to client in response proto.
     * URIs must be specified in the following format: `gs://bucket-id/object-id`
     * `bucket-id` should be a valid GCS bucket created by client and bucket
     * permission shall also be configured properly. `object-id` can be arbitrary
     * string that make sense to client. Other URI formats will return error and
     * cause GCS write failure.
     * </pre>
     *
     * <code>string annotation_result_storage_directory = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnnotationResultStorageDirectory() {

      annotationResultStorageDirectory_ =
          getDefaultInstance().getAnnotationResultStorageDirectory();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * GCS URI to store all annotation results for one client. Client should
     * specify this field as the top-level storage directory. Annotation results
     * of different sessions will be put into different sub-directories denoted
     * by project_name and session_id. All sub-directories will be auto generated
     * by program and will be made accessible to client in response proto.
     * URIs must be specified in the following format: `gs://bucket-id/object-id`
     * `bucket-id` should be a valid GCS bucket created by client and bucket
     * permission shall also be configured properly. `object-id` can be arbitrary
     * string that make sense to client. Other URI formats will return error and
     * cause GCS write failure.
     * </pre>
     *
     * <code>string annotation_result_storage_directory = 3;</code>
     *
     * @param value The bytes for annotationResultStorageDirectory to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationResultStorageDirectoryBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      annotationResultStorageDirectory_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig)
  private static final com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig();
  }

  public static com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StreamingStorageConfig> PARSER =
      new com.google.protobuf.AbstractParser<StreamingStorageConfig>() {
        @java.lang.Override
        public StreamingStorageConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StreamingStorageConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StreamingStorageConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StreamingStorageConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p3beta1.StreamingStorageConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
