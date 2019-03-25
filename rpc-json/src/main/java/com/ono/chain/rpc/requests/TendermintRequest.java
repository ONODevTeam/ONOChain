package com.ono.chain.rpc.requests;

public class TendermintRequest {

    private static final String DEFAULT_JSONRPC_VERSION = "2.0";
    private final String method;
    private String jsonrpc = DEFAULT_JSONRPC_VERSION;
    private Object params;
    private String id;

    protected TendermintRequest(RequestBuilder builder) {
        this.method = builder.getMethod().getMethodString();
        this.jsonrpc = builder.getJsonrpc();
        this.params = builder.getParams();
        this.id = this.method + "." + Long.toString(builder.getId());
    }

    public String getMethod() {
        return method;
    }
    
    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
