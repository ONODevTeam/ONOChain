// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.ono.chain.jabci.types;

public interface HeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ono.chain.jabci.types.Header)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * basic block info
   * </pre>
   *
   * <code>.com.ono.chain.jabci.types.Version version = 1;</code>
   */
  boolean hasVersion();
  /**
   * <pre>
   * basic block info
   * </pre>
   *
   * <code>.com.ono.chain.jabci.types.Version version = 1;</code>
   */
  com.ono.chain.jabci.types.Version getVersion();
  /**
   * <pre>
   * basic block info
   * </pre>
   *
   * <code>.com.ono.chain.jabci.types.Version version = 1;</code>
   */
  com.ono.chain.jabci.types.VersionOrBuilder getVersionOrBuilder();

  /**
   * <code>string chain_id = 2;</code>
   */
  java.lang.String getChainId();
  /**
   * <code>string chain_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <code>int64 height = 3;</code>
   */
  long getHeight();

  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  boolean hasTime();
  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  com.google.protobuf.Timestamp getTime();
  /**
   * <code>.google.protobuf.Timestamp time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   * <code>int64 num_txs = 5;</code>
   */
  long getNumTxs();

  /**
   * <code>int64 total_txs = 6;</code>
   */
  long getTotalTxs();

  /**
   * <pre>
   * prev block info
   * </pre>
   *
   * <code>.com.ono.chain.jabci.types.BlockID last_block_id = 7;</code>
   */
  boolean hasLastBlockId();
  /**
   * <pre>
   * prev block info
   * </pre>
   *
   * <code>.com.ono.chain.jabci.types.BlockID last_block_id = 7;</code>
   */
  com.ono.chain.jabci.types.BlockID getLastBlockId();
  /**
   * <pre>
   * prev block info
   * </pre>
   *
   * <code>.com.ono.chain.jabci.types.BlockID last_block_id = 7;</code>
   */
  com.ono.chain.jabci.types.BlockIDOrBuilder getLastBlockIdOrBuilder();

  /**
   * <pre>
   * hashes of block data
   * </pre>
   *
   * <code>bytes last_commit_hash = 8;</code>
   */
  com.google.protobuf.ByteString getLastCommitHash();

  /**
   * <pre>
   * transactions
   * </pre>
   *
   * <code>bytes data_hash = 9;</code>
   */
  com.google.protobuf.ByteString getDataHash();

  /**
   * <pre>
   * hashes from the app output from the prev block
   * </pre>
   *
   * <code>bytes validators_hash = 10;</code>
   */
  com.google.protobuf.ByteString getValidatorsHash();

  /**
   * <pre>
   * validators for the next block
   * </pre>
   *
   * <code>bytes next_validators_hash = 11;</code>
   */
  com.google.protobuf.ByteString getNextValidatorsHash();

  /**
   * <pre>
   * consensus params for current block
   * </pre>
   *
   * <code>bytes consensus_hash = 12;</code>
   */
  com.google.protobuf.ByteString getConsensusHash();

  /**
   * <pre>
   * state after txs from the previous block
   * </pre>
   *
   * <code>bytes app_hash = 13;</code>
   */
  com.google.protobuf.ByteString getAppHash();

  /**
   * <pre>
   * root hash of all results from the txs from the previous block
   * </pre>
   *
   * <code>bytes last_results_hash = 14;</code>
   */
  com.google.protobuf.ByteString getLastResultsHash();

  /**
   * <pre>
   * consensus info
   * </pre>
   *
   * <code>bytes evidence_hash = 15;</code>
   */
  com.google.protobuf.ByteString getEvidenceHash();

  /**
   * <pre>
   * original proposer of the block
   * </pre>
   *
   * <code>bytes proposer_address = 16;</code>
   */
  com.google.protobuf.ByteString getProposerAddress();
}
