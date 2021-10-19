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
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p2beta1;

/**
 *
 *
 * <pre>
 * Config for EXPLICIT_CONTENT_DETECTION.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig}
 */
public final class ExplicitContentDetectionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig)
    ExplicitContentDetectionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ExplicitContentDetectionConfig.newBuilder() to construct.
  private ExplicitContentDetectionConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExplicitContentDetectionConfig() {
    model_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExplicitContentDetectionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ExplicitContentDetectionConfig(
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

              model_ = s;
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
    return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p2beta1_ExplicitContentDetectionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p2beta1_ExplicitContentDetectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig.class,
            com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig.Builder
                .class);
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object model_;
  /**
   *
   *
   * <pre>
   * Model to use for explicit content detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   *
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Model to use for explicit content detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   *
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      model_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, model_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, model_);
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
    if (!(obj
        instanceof com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig other =
        (com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig) obj;

    if (!getModel().equals(other.getModel())) return false;
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
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      parseFrom(
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
      com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig prototype) {
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
   * Config for EXPLICIT_CONTENT_DETECTION.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig)
      com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_ExplicitContentDetectionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_ExplicitContentDetectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig.class,
              com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig.newBuilder()
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
      model_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_ExplicitContentDetectionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig build() {
      com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
        buildPartial() {
      com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig result =
          new com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig(this);
      result.model_ = model_;
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
      if (other
          instanceof com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig) {
        return mergeFrom(
            (com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig other) {
      if (other
          == com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
              .getDefaultInstance()) return this;
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
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
      com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     *
     *
     * <pre>
     * Model to use for explicit content detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     *
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Model to use for explicit content detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     *
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Model to use for explicit content detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     *
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      model_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Model to use for explicit content detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModel() {

      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Model to use for explicit content detection.
     * Supported values: "builtin/stable" (the default if unset) and
     * "builtin/latest".
     * </pre>
     *
     * <code>string model = 1;</code>
     *
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      model_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig)
  private static final com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig();
  }

  public static com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExplicitContentDetectionConfig> PARSER =
      new com.google.protobuf.AbstractParser<ExplicitContentDetectionConfig>() {
        @java.lang.Override
        public ExplicitContentDetectionConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ExplicitContentDetectionConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ExplicitContentDetectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExplicitContentDetectionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p2beta1.ExplicitContentDetectionConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
