package com.ono.chain.rpc.requests;

/**
 * Specification of Tendermint-Node JSON objects sent as answer from tendermint via Websocket RPC<br>
 * <br>
 */
public class JSONRPCResult {

    private String jsonrpc;
    private String id;
    private String error;
    private InternalResult result;

    public String getJsonrpc() {
        return jsonrpc;
    }

    public String getId() {
        return id;
    }

    public String getError() {
        return error;
    }

    public InternalResult getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "JSONRPCResult [result=" + result + ", error=" + error + ", jsonrpc=" + jsonrpc + ", id=" + id + "]";
    }

    public class InternalResult {
        private int code;
        private String data;
        private String log;
        private String hash;

        public int getCode() {
            return code;
        }

        public String getData() {
            return data;
        }

        public String getLog() {
            return log;
        }

        public String getHash() {
            return hash;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("InternalResult{");
            sb.append("data='").append(data).append('\'');
            sb.append(", log='").append(log).append('\'');
            sb.append(", hash='").append(hash).append('\'');
            sb.append(", code=").append(code);
            sb.append('}');
            return sb.toString();
        }
    }
}