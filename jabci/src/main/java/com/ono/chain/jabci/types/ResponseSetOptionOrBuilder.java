// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.ono.chain.jabci.types;

public interface ResponseSetOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ono.chain.jabci.types.ResponseSetOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 code = 1;</code>
   */
  int getCode();

  /**
   * <pre>
   * bytes data = 2;
   * </pre>
   *
   * <code>string log = 3;</code>
   */
  java.lang.String getLog();
  /**
   * <pre>
   * bytes data = 2;
   * </pre>
   *
   * <code>string log = 3;</code>
   */
  com.google.protobuf.ByteString
      getLogBytes();

  /**
   * <code>string info = 4;</code>
   */
  java.lang.String getInfo();
  /**
   * <code>string info = 4;</code>
   */
  com.google.protobuf.ByteString
      getInfoBytes();
}
