// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.ono.chain.jabci.types;

/**
 * <pre>
 * VoteInfo
 * </pre>
 *
 * Protobuf type {@code com.ono.chain.jabci.types.VoteInfo}
 */
public  final class VoteInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ono.chain.jabci.types.VoteInfo)
    VoteInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoteInfo.newBuilder() to construct.
  private VoteInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoteInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VoteInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            com.ono.chain.jabci.types.Validator.Builder subBuilder = null;
            if (validator_ != null) {
              subBuilder = validator_.toBuilder();
            }
            validator_ = input.readMessage(com.ono.chain.jabci.types.Validator.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(validator_);
              validator_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            signedLastBlock_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_VoteInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_VoteInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ono.chain.jabci.types.VoteInfo.class, com.ono.chain.jabci.types.VoteInfo.Builder.class);
  }

  public static final int VALIDATOR_FIELD_NUMBER = 1;
  private com.ono.chain.jabci.types.Validator validator_;
  /**
   * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
   */
  public boolean hasValidator() {
    return validator_ != null;
  }
  /**
   * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
   */
  public com.ono.chain.jabci.types.Validator getValidator() {
    return validator_ == null ? com.ono.chain.jabci.types.Validator.getDefaultInstance() : validator_;
  }
  /**
   * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
   */
  public com.ono.chain.jabci.types.ValidatorOrBuilder getValidatorOrBuilder() {
    return getValidator();
  }

  public static final int SIGNED_LAST_BLOCK_FIELD_NUMBER = 2;
  private boolean signedLastBlock_;
  /**
   * <code>bool signed_last_block = 2;</code>
   */
  public boolean getSignedLastBlock() {
    return signedLastBlock_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (validator_ != null) {
      output.writeMessage(1, getValidator());
    }
    if (signedLastBlock_ != false) {
      output.writeBool(2, signedLastBlock_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (validator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getValidator());
    }
    if (signedLastBlock_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, signedLastBlock_);
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
    if (!(obj instanceof com.ono.chain.jabci.types.VoteInfo)) {
      return super.equals(obj);
    }
    com.ono.chain.jabci.types.VoteInfo other = (com.ono.chain.jabci.types.VoteInfo) obj;

    if (hasValidator() != other.hasValidator()) return false;
    if (hasValidator()) {
      if (!getValidator()
          .equals(other.getValidator())) return false;
    }
    if (getSignedLastBlock()
        != other.getSignedLastBlock()) return false;
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
    if (hasValidator()) {
      hash = (37 * hash) + VALIDATOR_FIELD_NUMBER;
      hash = (53 * hash) + getValidator().hashCode();
    }
    hash = (37 * hash) + SIGNED_LAST_BLOCK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSignedLastBlock());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ono.chain.jabci.types.VoteInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.VoteInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ono.chain.jabci.types.VoteInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * VoteInfo
   * </pre>
   *
   * Protobuf type {@code com.ono.chain.jabci.types.VoteInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ono.chain.jabci.types.VoteInfo)
      com.ono.chain.jabci.types.VoteInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_VoteInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_VoteInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ono.chain.jabci.types.VoteInfo.class, com.ono.chain.jabci.types.VoteInfo.Builder.class);
    }

    // Construct using com.ono.chain.jabci.types.VoteInfo.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (validatorBuilder_ == null) {
        validator_ = null;
      } else {
        validator_ = null;
        validatorBuilder_ = null;
      }
      signedLastBlock_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_VoteInfo_descriptor;
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.VoteInfo getDefaultInstanceForType() {
      return com.ono.chain.jabci.types.VoteInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.VoteInfo build() {
      com.ono.chain.jabci.types.VoteInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.VoteInfo buildPartial() {
      com.ono.chain.jabci.types.VoteInfo result = new com.ono.chain.jabci.types.VoteInfo(this);
      if (validatorBuilder_ == null) {
        result.validator_ = validator_;
      } else {
        result.validator_ = validatorBuilder_.build();
      }
      result.signedLastBlock_ = signedLastBlock_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ono.chain.jabci.types.VoteInfo) {
        return mergeFrom((com.ono.chain.jabci.types.VoteInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ono.chain.jabci.types.VoteInfo other) {
      if (other == com.ono.chain.jabci.types.VoteInfo.getDefaultInstance()) return this;
      if (other.hasValidator()) {
        mergeValidator(other.getValidator());
      }
      if (other.getSignedLastBlock() != false) {
        setSignedLastBlock(other.getSignedLastBlock());
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
      com.ono.chain.jabci.types.VoteInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ono.chain.jabci.types.VoteInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.ono.chain.jabci.types.Validator validator_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ono.chain.jabci.types.Validator, com.ono.chain.jabci.types.Validator.Builder, com.ono.chain.jabci.types.ValidatorOrBuilder> validatorBuilder_;
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    public boolean hasValidator() {
      return validatorBuilder_ != null || validator_ != null;
    }
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    public com.ono.chain.jabci.types.Validator getValidator() {
      if (validatorBuilder_ == null) {
        return validator_ == null ? com.ono.chain.jabci.types.Validator.getDefaultInstance() : validator_;
      } else {
        return validatorBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    public Builder setValidator(com.ono.chain.jabci.types.Validator value) {
      if (validatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validator_ = value;
        onChanged();
      } else {
        validatorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    public Builder setValidator(
        com.ono.chain.jabci.types.Validator.Builder builderForValue) {
      if (validatorBuilder_ == null) {
        validator_ = builderForValue.build();
        onChanged();
      } else {
        validatorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    public Builder mergeValidator(com.ono.chain.jabci.types.Validator value) {
      if (validatorBuilder_ == null) {
        if (validator_ != null) {
          validator_ =
            com.ono.chain.jabci.types.Validator.newBuilder(validator_).mergeFrom(value).buildPartial();
        } else {
          validator_ = value;
        }
        onChanged();
      } else {
        validatorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    public Builder clearValidator() {
      if (validatorBuilder_ == null) {
        validator_ = null;
        onChanged();
      } else {
        validator_ = null;
        validatorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    public com.ono.chain.jabci.types.Validator.Builder getValidatorBuilder() {
      
      onChanged();
      return getValidatorFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    public com.ono.chain.jabci.types.ValidatorOrBuilder getValidatorOrBuilder() {
      if (validatorBuilder_ != null) {
        return validatorBuilder_.getMessageOrBuilder();
      } else {
        return validator_ == null ?
            com.ono.chain.jabci.types.Validator.getDefaultInstance() : validator_;
      }
    }
    /**
     * <code>.com.ono.chain.jabci.types.Validator validator = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ono.chain.jabci.types.Validator, com.ono.chain.jabci.types.Validator.Builder, com.ono.chain.jabci.types.ValidatorOrBuilder> 
        getValidatorFieldBuilder() {
      if (validatorBuilder_ == null) {
        validatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ono.chain.jabci.types.Validator, com.ono.chain.jabci.types.Validator.Builder, com.ono.chain.jabci.types.ValidatorOrBuilder>(
                getValidator(),
                getParentForChildren(),
                isClean());
        validator_ = null;
      }
      return validatorBuilder_;
    }

    private boolean signedLastBlock_ ;
    /**
     * <code>bool signed_last_block = 2;</code>
     */
    public boolean getSignedLastBlock() {
      return signedLastBlock_;
    }
    /**
     * <code>bool signed_last_block = 2;</code>
     */
    public Builder setSignedLastBlock(boolean value) {
      
      signedLastBlock_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool signed_last_block = 2;</code>
     */
    public Builder clearSignedLastBlock() {
      
      signedLastBlock_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ono.chain.jabci.types.VoteInfo)
  }

  // @@protoc_insertion_point(class_scope:com.ono.chain.jabci.types.VoteInfo)
  private static final com.ono.chain.jabci.types.VoteInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ono.chain.jabci.types.VoteInfo();
  }

  public static com.ono.chain.jabci.types.VoteInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoteInfo>
      PARSER = new com.google.protobuf.AbstractParser<VoteInfo>() {
    @java.lang.Override
    public VoteInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VoteInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VoteInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoteInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ono.chain.jabci.types.VoteInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

