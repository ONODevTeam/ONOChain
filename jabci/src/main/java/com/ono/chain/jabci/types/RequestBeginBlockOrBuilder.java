// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.ono.chain.jabci.types;

public interface RequestBeginBlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ono.chain.jabci.types.RequestBeginBlock)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes hash = 1;</code>
   */
  com.google.protobuf.ByteString getHash();

  /**
   * <code>.com.ono.chain.jabci.types.Header header = 2;</code>
   */
  boolean hasHeader();
  /**
   * <code>.com.ono.chain.jabci.types.Header header = 2;</code>
   */
  com.ono.chain.jabci.types.Header getHeader();
  /**
   * <code>.com.ono.chain.jabci.types.Header header = 2;</code>
   */
  com.ono.chain.jabci.types.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>.com.ono.chain.jabci.types.LastCommitInfo last_commit_info = 3;</code>
   */
  boolean hasLastCommitInfo();
  /**
   * <code>.com.ono.chain.jabci.types.LastCommitInfo last_commit_info = 3;</code>
   */
  com.ono.chain.jabci.types.LastCommitInfo getLastCommitInfo();
  /**
   * <code>.com.ono.chain.jabci.types.LastCommitInfo last_commit_info = 3;</code>
   */
  com.ono.chain.jabci.types.LastCommitInfoOrBuilder getLastCommitInfoOrBuilder();

  /**
   * <code>repeated .com.ono.chain.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  java.util.List<com.ono.chain.jabci.types.Evidence> 
      getByzantineValidatorsList();
  /**
   * <code>repeated .com.ono.chain.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  com.ono.chain.jabci.types.Evidence getByzantineValidators(int index);
  /**
   * <code>repeated .com.ono.chain.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  int getByzantineValidatorsCount();
  /**
   * <code>repeated .com.ono.chain.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  java.util.List<? extends com.ono.chain.jabci.types.EvidenceOrBuilder> 
      getByzantineValidatorsOrBuilderList();
  /**
   * <code>repeated .com.ono.chain.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  com.ono.chain.jabci.types.EvidenceOrBuilder getByzantineValidatorsOrBuilder(
      int index);
}
