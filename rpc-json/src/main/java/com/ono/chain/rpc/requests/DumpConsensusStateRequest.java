package com.ono.chain.rpc.requests;

import com.ono.chain.rpc.TmRpcMethod;

public class DumpConsensusStateRequest extends TendermintRequest {

    protected DumpConsensusStateRequest(RequestBuilder builder) {
        super(builder);
    }

    public static RequestBuilder builder() {
        RequestBuilder builder = new RequestBuilder();
        builder.withMethod(TmRpcMethod.DUMP_CONSENSUS_STATE);
        return builder;
    }
}
