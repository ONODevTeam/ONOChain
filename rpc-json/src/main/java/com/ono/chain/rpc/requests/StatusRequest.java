package com.ono.chain.rpc.requests;

import com.ono.chain.rpc.TmRpcMethod;

public class StatusRequest extends TendermintRequest {

    protected StatusRequest(RequestBuilder builder) {
        super(builder);
    }

    public static RequestBuilder builder() {
        RequestBuilder builder = new RequestBuilder();
        builder.withMethod(TmRpcMethod.STATUS);
        return builder;
    }
}
