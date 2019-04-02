// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.ono.chain.jabci.types;

/**
 * Protobuf type {@code com.ono.chain.jabci.types.ResponseBeginBlock}
 */
public  final class ResponseBeginBlock extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ono.chain.jabci.types.ResponseBeginBlock)
    ResponseBeginBlockOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseBeginBlock.newBuilder() to construct.
  private ResponseBeginBlock(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseBeginBlock() {
    tags_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseBeginBlock(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tags_ = new java.util.ArrayList<com.ono.chain.jabci.types.KVPair>();
              mutable_bitField0_ |= 0x00000001;
            }
            tags_.add(
                input.readMessage(com.ono.chain.jabci.types.KVPair.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        tags_ = java.util.Collections.unmodifiableList(tags_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_ResponseBeginBlock_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_ResponseBeginBlock_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ono.chain.jabci.types.ResponseBeginBlock.class, com.ono.chain.jabci.types.ResponseBeginBlock.Builder.class);
  }

  public static final int TAGS_FIELD_NUMBER = 1;
  private java.util.List<com.ono.chain.jabci.types.KVPair> tags_;
  /**
   * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
   */
  public java.util.List<com.ono.chain.jabci.types.KVPair> getTagsList() {
    return tags_;
  }
  /**
   * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
   */
  public java.util.List<? extends com.ono.chain.jabci.types.KVPairOrBuilder> 
      getTagsOrBuilderList() {
    return tags_;
  }
  /**
   * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
   */
  public com.ono.chain.jabci.types.KVPair getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
   */
  public com.ono.chain.jabci.types.KVPairOrBuilder getTagsOrBuilder(
      int index) {
    return tags_.get(index);
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
    for (int i = 0; i < tags_.size(); i++) {
      output.writeMessage(1, tags_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tags_.get(i));
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
    if (!(obj instanceof com.ono.chain.jabci.types.ResponseBeginBlock)) {
      return super.equals(obj);
    }
    com.ono.chain.jabci.types.ResponseBeginBlock other = (com.ono.chain.jabci.types.ResponseBeginBlock) obj;

    if (!getTagsList()
        .equals(other.getTagsList())) return false;
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
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ono.chain.jabci.types.ResponseBeginBlock parseFrom(
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
  public static Builder newBuilder(com.ono.chain.jabci.types.ResponseBeginBlock prototype) {
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
   * Protobuf type {@code com.ono.chain.jabci.types.ResponseBeginBlock}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ono.chain.jabci.types.ResponseBeginBlock)
      com.ono.chain.jabci.types.ResponseBeginBlockOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_ResponseBeginBlock_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_ResponseBeginBlock_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ono.chain.jabci.types.ResponseBeginBlock.class, com.ono.chain.jabci.types.ResponseBeginBlock.Builder.class);
    }

    // Construct using com.ono.chain.jabci.types.ResponseBeginBlock.newBuilder()
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
        getTagsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ono.chain.jabci.types.Types.internal_static_com_ono_chain_jabci_types_ResponseBeginBlock_descriptor;
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.ResponseBeginBlock getDefaultInstanceForType() {
      return com.ono.chain.jabci.types.ResponseBeginBlock.getDefaultInstance();
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.ResponseBeginBlock build() {
      com.ono.chain.jabci.types.ResponseBeginBlock result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ono.chain.jabci.types.ResponseBeginBlock buildPartial() {
      com.ono.chain.jabci.types.ResponseBeginBlock result = new com.ono.chain.jabci.types.ResponseBeginBlock(this);
      int from_bitField0_ = bitField0_;
      if (tagsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tags_ = java.util.Collections.unmodifiableList(tags_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tags_ = tags_;
      } else {
        result.tags_ = tagsBuilder_.build();
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
      if (other instanceof com.ono.chain.jabci.types.ResponseBeginBlock) {
        return mergeFrom((com.ono.chain.jabci.types.ResponseBeginBlock)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ono.chain.jabci.types.ResponseBeginBlock other) {
      if (other == com.ono.chain.jabci.types.ResponseBeginBlock.getDefaultInstance()) return this;
      if (tagsBuilder_ == null) {
        if (!other.tags_.isEmpty()) {
          if (tags_.isEmpty()) {
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTagsIsMutable();
            tags_.addAll(other.tags_);
          }
          onChanged();
        }
      } else {
        if (!other.tags_.isEmpty()) {
          if (tagsBuilder_.isEmpty()) {
            tagsBuilder_.dispose();
            tagsBuilder_ = null;
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tagsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTagsFieldBuilder() : null;
          } else {
            tagsBuilder_.addAllMessages(other.tags_);
          }
        }
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
      com.ono.chain.jabci.types.ResponseBeginBlock parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ono.chain.jabci.types.ResponseBeginBlock) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.ono.chain.jabci.types.KVPair> tags_ =
      java.util.Collections.emptyList();
    private void ensureTagsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tags_ = new java.util.ArrayList<com.ono.chain.jabci.types.KVPair>(tags_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ono.chain.jabci.types.KVPair, com.ono.chain.jabci.types.KVPair.Builder, com.ono.chain.jabci.types.KVPairOrBuilder> tagsBuilder_;

    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public java.util.List<com.ono.chain.jabci.types.KVPair> getTagsList() {
      if (tagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tags_);
      } else {
        return tagsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public int getTagsCount() {
      if (tagsBuilder_ == null) {
        return tags_.size();
      } else {
        return tagsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public com.ono.chain.jabci.types.KVPair getTags(int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);
      } else {
        return tagsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder setTags(
        int index, com.ono.chain.jabci.types.KVPair value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.set(index, value);
        onChanged();
      } else {
        tagsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder setTags(
        int index, com.ono.chain.jabci.types.KVPair.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.set(index, builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder addTags(com.ono.chain.jabci.types.KVPair value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.add(value);
        onChanged();
      } else {
        tagsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder addTags(
        int index, com.ono.chain.jabci.types.KVPair value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.add(index, value);
        onChanged();
      } else {
        tagsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder addTags(
        com.ono.chain.jabci.types.KVPair.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.add(builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder addTags(
        int index, com.ono.chain.jabci.types.KVPair.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.add(index, builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder addAllTags(
        java.lang.Iterable<? extends com.ono.chain.jabci.types.KVPair> values) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tags_);
        onChanged();
      } else {
        tagsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder clearTags() {
      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public Builder removeTags(int index) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.remove(index);
        onChanged();
      } else {
        tagsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public com.ono.chain.jabci.types.KVPair.Builder getTagsBuilder(
        int index) {
      return getTagsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public com.ono.chain.jabci.types.KVPairOrBuilder getTagsOrBuilder(
        int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);  } else {
        return tagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public java.util.List<? extends com.ono.chain.jabci.types.KVPairOrBuilder> 
         getTagsOrBuilderList() {
      if (tagsBuilder_ != null) {
        return tagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tags_);
      }
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public com.ono.chain.jabci.types.KVPair.Builder addTagsBuilder() {
      return getTagsFieldBuilder().addBuilder(
          com.ono.chain.jabci.types.KVPair.getDefaultInstance());
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public com.ono.chain.jabci.types.KVPair.Builder addTagsBuilder(
        int index) {
      return getTagsFieldBuilder().addBuilder(
          index, com.ono.chain.jabci.types.KVPair.getDefaultInstance());
    }
    /**
     * <code>repeated .com.ono.chain.jabci.types.KVPair tags = 1;</code>
     */
    public java.util.List<com.ono.chain.jabci.types.KVPair.Builder> 
         getTagsBuilderList() {
      return getTagsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ono.chain.jabci.types.KVPair, com.ono.chain.jabci.types.KVPair.Builder, com.ono.chain.jabci.types.KVPairOrBuilder> 
        getTagsFieldBuilder() {
      if (tagsBuilder_ == null) {
        tagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ono.chain.jabci.types.KVPair, com.ono.chain.jabci.types.KVPair.Builder, com.ono.chain.jabci.types.KVPairOrBuilder>(
                tags_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tags_ = null;
      }
      return tagsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.ono.chain.jabci.types.ResponseBeginBlock)
  }

  // @@protoc_insertion_point(class_scope:com.ono.chain.jabci.types.ResponseBeginBlock)
  private static final com.ono.chain.jabci.types.ResponseBeginBlock DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ono.chain.jabci.types.ResponseBeginBlock();
  }

  public static com.ono.chain.jabci.types.ResponseBeginBlock getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseBeginBlock>
      PARSER = new com.google.protobuf.AbstractParser<ResponseBeginBlock>() {
    @java.lang.Override
    public ResponseBeginBlock parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseBeginBlock(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseBeginBlock> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseBeginBlock> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ono.chain.jabci.types.ResponseBeginBlock getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

