package com.ono.chain.rpc.mapper;

public interface IMapper {


    <T> T fromJson(final String json, final Class<T> targetClass) throws CouldNotReadJsonException;

    <T> String toJson(final T object) throws CouldNotWriteJsonException;

    String getFieldAsString(final String json, final String fieldName) throws CouldNotReadJsonException;
}
