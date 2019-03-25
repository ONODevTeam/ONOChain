package com.ono.chain.rpc.requests;

import com.ono.chain.rpc.TmRpcMethod;

public class RequestBuilder {

    private static final String DEFAULT_JSONRPC_VERSION = "2.0";
    private TmRpcMethod method;
    private String jsonrpc = DEFAULT_JSONRPC_VERSION;
    private Object params = new Object();
    private long id;

    RequestBuilder withMethod(TmRpcMethod method) {
        this.method = method;
        return this;
    }

    public RequestBuilder withJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }

    public RequestBuilder withParams(Object params) {
        this.params = params;
        return this;
    }

    public RequestBuilder withId(long id) {
        this.id = id;
        return this;
    }
    
    public TmRpcMethod getMethod() {
        return method;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public Object getParams() {
        return params;
    }

    public long getId() {
        return id;
    }

    public TendermintRequest build() {
        return new TendermintRequest(this);
    }
}
