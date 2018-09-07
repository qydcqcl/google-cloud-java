// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

/**
 * <pre>
 * Set of detected objects with bounding boxes.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1.LocalizedObjectAnnotation}
 */
public  final class LocalizedObjectAnnotation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1.LocalizedObjectAnnotation)
    LocalizedObjectAnnotationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalizedObjectAnnotation.newBuilder() to construct.
  private LocalizedObjectAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalizedObjectAnnotation() {
    mid_ = "";
    languageCode_ = "";
    name_ = "";
    score_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocalizedObjectAnnotation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            mid_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            languageCode_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 37: {

            score_ = input.readFloat();
            break;
          }
          case 42: {
            com.google.cloud.vision.v1.BoundingPoly.Builder subBuilder = null;
            if (boundingPoly_ != null) {
              subBuilder = boundingPoly_.toBuilder();
            }
            boundingPoly_ = input.readMessage(com.google.cloud.vision.v1.BoundingPoly.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(boundingPoly_);
              boundingPoly_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_LocalizedObjectAnnotation_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_LocalizedObjectAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1.LocalizedObjectAnnotation.class, com.google.cloud.vision.v1.LocalizedObjectAnnotation.Builder.class);
  }

  public static final int MID_FIELD_NUMBER = 1;
  private volatile java.lang.Object mid_;
  /**
   * <pre>
   * Object ID that should align with EntityAnnotation mid.
   * </pre>
   *
   * <code>string mid = 1;</code>
   */
  public java.lang.String getMid() {
    java.lang.Object ref = mid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Object ID that should align with EntityAnnotation mid.
   * </pre>
   *
   * <code>string mid = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMidBytes() {
    java.lang.Object ref = mid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object languageCode_;
  /**
   * <pre>
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
   * information, see
   * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
   * </pre>
   *
   * <code>string language_code = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Object name, expressed in its `language_code` language.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Object name, expressed in its `language_code` language.
   * </pre>
   *
   * <code>string name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCORE_FIELD_NUMBER = 4;
  private float score_;
  /**
   * <pre>
   * Score of the result. Range [0, 1].
   * </pre>
   *
   * <code>float score = 4;</code>
   */
  public float getScore() {
    return score_;
  }

  public static final int BOUNDING_POLY_FIELD_NUMBER = 5;
  private com.google.cloud.vision.v1.BoundingPoly boundingPoly_;
  /**
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
   */
  public boolean hasBoundingPoly() {
    return boundingPoly_ != null;
  }
  /**
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
   */
  public com.google.cloud.vision.v1.BoundingPoly getBoundingPoly() {
    return boundingPoly_ == null ? com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance() : boundingPoly_;
  }
  /**
   * <pre>
   * Image region to which this object belongs. This must be populated.
   * </pre>
   *
   * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
   */
  public com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingPolyOrBuilder() {
    return getBoundingPoly();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getMidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mid_);
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, languageCode_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (score_ != 0F) {
      output.writeFloat(4, score_);
    }
    if (boundingPoly_ != null) {
      output.writeMessage(5, getBoundingPoly());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mid_);
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, languageCode_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (score_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, score_);
    }
    if (boundingPoly_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getBoundingPoly());
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
    if (!(obj instanceof com.google.cloud.vision.v1.LocalizedObjectAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1.LocalizedObjectAnnotation other = (com.google.cloud.vision.v1.LocalizedObjectAnnotation) obj;

    boolean result = true;
    result = result && getMid()
        .equals(other.getMid());
    result = result && getLanguageCode()
        .equals(other.getLanguageCode());
    result = result && getName()
        .equals(other.getName());
    result = result && (
        java.lang.Float.floatToIntBits(getScore())
        == java.lang.Float.floatToIntBits(
            other.getScore()));
    result = result && (hasBoundingPoly() == other.hasBoundingPoly());
    if (hasBoundingPoly()) {
      result = result && getBoundingPoly()
          .equals(other.getBoundingPoly());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MID_FIELD_NUMBER;
    hash = (53 * hash) + getMid().hashCode();
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getScore());
    if (hasBoundingPoly()) {
      hash = (37 * hash) + BOUNDING_POLY_FIELD_NUMBER;
      hash = (53 * hash) + getBoundingPoly().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.vision.v1.LocalizedObjectAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Set of detected objects with bounding boxes.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1.LocalizedObjectAnnotation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1.LocalizedObjectAnnotation)
      com.google.cloud.vision.v1.LocalizedObjectAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_LocalizedObjectAnnotation_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_LocalizedObjectAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1.LocalizedObjectAnnotation.class, com.google.cloud.vision.v1.LocalizedObjectAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1.LocalizedObjectAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      mid_ = "";

      languageCode_ = "";

      name_ = "";

      score_ = 0F;

      if (boundingPolyBuilder_ == null) {
        boundingPoly_ = null;
      } else {
        boundingPoly_ = null;
        boundingPolyBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1_LocalizedObjectAnnotation_descriptor;
    }

    public com.google.cloud.vision.v1.LocalizedObjectAnnotation getDefaultInstanceForType() {
      return com.google.cloud.vision.v1.LocalizedObjectAnnotation.getDefaultInstance();
    }

    public com.google.cloud.vision.v1.LocalizedObjectAnnotation build() {
      com.google.cloud.vision.v1.LocalizedObjectAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.vision.v1.LocalizedObjectAnnotation buildPartial() {
      com.google.cloud.vision.v1.LocalizedObjectAnnotation result = new com.google.cloud.vision.v1.LocalizedObjectAnnotation(this);
      result.mid_ = mid_;
      result.languageCode_ = languageCode_;
      result.name_ = name_;
      result.score_ = score_;
      if (boundingPolyBuilder_ == null) {
        result.boundingPoly_ = boundingPoly_;
      } else {
        result.boundingPoly_ = boundingPolyBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1.LocalizedObjectAnnotation) {
        return mergeFrom((com.google.cloud.vision.v1.LocalizedObjectAnnotation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1.LocalizedObjectAnnotation other) {
      if (other == com.google.cloud.vision.v1.LocalizedObjectAnnotation.getDefaultInstance()) return this;
      if (!other.getMid().isEmpty()) {
        mid_ = other.mid_;
        onChanged();
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
      }
      if (other.hasBoundingPoly()) {
        mergeBoundingPoly(other.getBoundingPoly());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1.LocalizedObjectAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1.LocalizedObjectAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mid_ = "";
    /**
     * <pre>
     * Object ID that should align with EntityAnnotation mid.
     * </pre>
     *
     * <code>string mid = 1;</code>
     */
    public java.lang.String getMid() {
      java.lang.Object ref = mid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Object ID that should align with EntityAnnotation mid.
     * </pre>
     *
     * <code>string mid = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMidBytes() {
      java.lang.Object ref = mid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Object ID that should align with EntityAnnotation mid.
     * </pre>
     *
     * <code>string mid = 1;</code>
     */
    public Builder setMid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Object ID that should align with EntityAnnotation mid.
     * </pre>
     *
     * <code>string mid = 1;</code>
     */
    public Builder clearMid() {
      
      mid_ = getDefaultInstance().getMid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Object ID that should align with EntityAnnotation mid.
     * </pre>
     *
     * <code>string mid = 1;</code>
     */
    public Builder setMidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
     * information, see
     * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
     * information, see
     * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
     * information, see
     * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
     * information, see
     * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     */
    public Builder clearLanguageCode() {
      
      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
     * information, see
     * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
     * </pre>
     *
     * <code>string language_code = 2;</code>
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      languageCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Object name, expressed in its `language_code` language.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Object name, expressed in its `language_code` language.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Object name, expressed in its `language_code` language.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Object name, expressed in its `language_code` language.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Object name, expressed in its `language_code` language.
     * </pre>
     *
     * <code>string name = 3;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private float score_ ;
    /**
     * <pre>
     * Score of the result. Range [0, 1].
     * </pre>
     *
     * <code>float score = 4;</code>
     */
    public float getScore() {
      return score_;
    }
    /**
     * <pre>
     * Score of the result. Range [0, 1].
     * </pre>
     *
     * <code>float score = 4;</code>
     */
    public Builder setScore(float value) {
      
      score_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Score of the result. Range [0, 1].
     * </pre>
     *
     * <code>float score = 4;</code>
     */
    public Builder clearScore() {
      
      score_ = 0F;
      onChanged();
      return this;
    }

    private com.google.cloud.vision.v1.BoundingPoly boundingPoly_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1.BoundingPoly, com.google.cloud.vision.v1.BoundingPoly.Builder, com.google.cloud.vision.v1.BoundingPolyOrBuilder> boundingPolyBuilder_;
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    public boolean hasBoundingPoly() {
      return boundingPolyBuilder_ != null || boundingPoly_ != null;
    }
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    public com.google.cloud.vision.v1.BoundingPoly getBoundingPoly() {
      if (boundingPolyBuilder_ == null) {
        return boundingPoly_ == null ? com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance() : boundingPoly_;
      } else {
        return boundingPolyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    public Builder setBoundingPoly(com.google.cloud.vision.v1.BoundingPoly value) {
      if (boundingPolyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        boundingPoly_ = value;
        onChanged();
      } else {
        boundingPolyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    public Builder setBoundingPoly(
        com.google.cloud.vision.v1.BoundingPoly.Builder builderForValue) {
      if (boundingPolyBuilder_ == null) {
        boundingPoly_ = builderForValue.build();
        onChanged();
      } else {
        boundingPolyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    public Builder mergeBoundingPoly(com.google.cloud.vision.v1.BoundingPoly value) {
      if (boundingPolyBuilder_ == null) {
        if (boundingPoly_ != null) {
          boundingPoly_ =
            com.google.cloud.vision.v1.BoundingPoly.newBuilder(boundingPoly_).mergeFrom(value).buildPartial();
        } else {
          boundingPoly_ = value;
        }
        onChanged();
      } else {
        boundingPolyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    public Builder clearBoundingPoly() {
      if (boundingPolyBuilder_ == null) {
        boundingPoly_ = null;
        onChanged();
      } else {
        boundingPoly_ = null;
        boundingPolyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    public com.google.cloud.vision.v1.BoundingPoly.Builder getBoundingPolyBuilder() {
      
      onChanged();
      return getBoundingPolyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    public com.google.cloud.vision.v1.BoundingPolyOrBuilder getBoundingPolyOrBuilder() {
      if (boundingPolyBuilder_ != null) {
        return boundingPolyBuilder_.getMessageOrBuilder();
      } else {
        return boundingPoly_ == null ?
            com.google.cloud.vision.v1.BoundingPoly.getDefaultInstance() : boundingPoly_;
      }
    }
    /**
     * <pre>
     * Image region to which this object belongs. This must be populated.
     * </pre>
     *
     * <code>.google.cloud.vision.v1.BoundingPoly bounding_poly = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.vision.v1.BoundingPoly, com.google.cloud.vision.v1.BoundingPoly.Builder, com.google.cloud.vision.v1.BoundingPolyOrBuilder> 
        getBoundingPolyFieldBuilder() {
      if (boundingPolyBuilder_ == null) {
        boundingPolyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.vision.v1.BoundingPoly, com.google.cloud.vision.v1.BoundingPoly.Builder, com.google.cloud.vision.v1.BoundingPolyOrBuilder>(
                getBoundingPoly(),
                getParentForChildren(),
                isClean());
        boundingPoly_ = null;
      }
      return boundingPolyBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1.LocalizedObjectAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1.LocalizedObjectAnnotation)
  private static final com.google.cloud.vision.v1.LocalizedObjectAnnotation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1.LocalizedObjectAnnotation();
  }

  public static com.google.cloud.vision.v1.LocalizedObjectAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalizedObjectAnnotation>
      PARSER = new com.google.protobuf.AbstractParser<LocalizedObjectAnnotation>() {
    public LocalizedObjectAnnotation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new LocalizedObjectAnnotation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocalizedObjectAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalizedObjectAnnotation> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.vision.v1.LocalizedObjectAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
