package com.ono.chain.rpc.requests;

import com.ono.chain.rpc.TmRpcMethod;

import java.nio.charset.Charset;
import java.util.Base64;

public class StringParam extends JSONRPC {

    public final String[] params;

    /***
     * Creates a JSON-RPC with String parameters
     * 
     * @param method
     * @param string  content to transmit
     */
    public StringParam(TmRpcMethod method, String string) {
        super(method);
        params = new String[] { convertToBase64(string) };
    }

    public StringParam(TmRpcMethod m, byte[] bytes) {
        super(m);
        params = new String[] { convertToBase64(bytes) };
    }

    public StringParam(TmRpcMethod m, byte[][] bytes) {
        super(m);

        params = new String[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            params[i] = convertToBase64(bytes[i]);
        }
    }

    private String convertToBase64(String string) {
        return convertToBase64(string.getBytes(Charset.forName("UTF-8")));
    }
    
    private String convertToBase64(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }
}