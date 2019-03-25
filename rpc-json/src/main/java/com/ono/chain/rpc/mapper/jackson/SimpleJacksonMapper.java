package com.ono.chain.rpc.mapper.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ono.chain.rpc.mapper.CouldNotReadJsonException;
import com.ono.chain.rpc.mapper.CouldNotWriteJsonException;
import com.ono.chain.rpc.mapper.IMapper;

import java.io.IOException;

public class SimpleJacksonMapper implements IMapper {

    private final ObjectMapper mapper;

    public SimpleJacksonMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public <T> T fromJson(final String json, final Class<T> targetClass) throws CouldNotReadJsonException {
        try {
            return mapper.readValue(json, targetClass);
        } catch (IOException e) {
            throw new CouldNotReadJsonException(e);
        }
    }

    @Override
    public <T> String toJson(final T object) throws CouldNotWriteJsonException {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new CouldNotWriteJsonException(e);
        }
    }

    @Override
    public String getFieldAsString(final String json, final String fieldName) throws CouldNotReadJsonException {
        if (json != null) {
            final ObjectNode object;
            try {
                object = mapper.readValue(json, ObjectNode.class);
            } catch (IOException e) {
                throw new CouldNotReadJsonException(e);
            }
            JsonNode node = object.get(fieldName);
            if (node == null) {
                return null;
            } else if (node.isContainerNode()) {
                return node.toString();
            } else {
                return node.asText();
            }
        }
        return null;
    }
}
