package com.ono.chain.rpc.mapper.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ono.chain.rpc.mapper.AbstractMapperFactory;

public final class SimpleJacksonMapperFactory extends AbstractMapperFactory<SimpleJacksonMapper> {

    @Override
    public SimpleJacksonMapper createMapper() {
        return new SimpleJacksonMapper(new ObjectMapper());
    }
}
