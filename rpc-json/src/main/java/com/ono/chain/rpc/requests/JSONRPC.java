package com.ono.chain.rpc.requests;

import com.ono.chain.rpc.TmRpcMethod;

/**
 * Specification of Tendermint-Node JSON objects sent via JSON-RPC<br>
 * <br>
 */
public abstract class JSONRPC {

    private final String id;
    private final String jsonrpc;
    private final String method;

    private static long idCounter = 0;

    public JSONRPC(String method) {
        this.jsonrpc = "2.0";
        this.method = method;
        this.id = Long.toString(idCounter++);
    }

    public JSONRPC(TmRpcMethod method) {
        this(method.getMethodString());
    }

    public String getId() {
        return id;
    }

    public String getMethod() {
        return method;
    }

    public static long getIdCounter() {
        return idCounter;
    }
}