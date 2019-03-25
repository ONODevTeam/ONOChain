package com.ono.chain.rpc.mapper;

public abstract class AbstractMapperFactory<T extends IMapper> {

    private T mapper;

    public AbstractMapperFactory() {
        init();
    }

    private synchronized void init() {
        this.mapper = createMapper();
    }

    public synchronized T getMapper() {
        if (mapper == null) {
            init();
        }
        return mapper;
    }

    public abstract T createMapper();

}
