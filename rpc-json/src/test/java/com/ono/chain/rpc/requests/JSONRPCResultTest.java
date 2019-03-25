package com.ono.chain.rpc.requests;

import com.ono.chain.rpc.mapper.CouldNotReadJsonException;
import com.ono.chain.rpc.mapper.IMapper;
import com.ono.chain.rpc.mapper.jackson.SimpleJacksonMapperFactory;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

public class JSONRPCResultTest {

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void deserializeJsonRpcResult() throws CouldNotReadJsonException {
        final IMapper mapper = new SimpleJacksonMapperFactory().getMapper();

        final String rpcResultAsJson = "{\n" +
                "  \"jsonrpc\": \"2.0\",\n" +
                "  \"id\": \"1\",\n" +
                "  \"result\": {\n" +
                "    \"code\": 1,\n" +
                "    \"data\": \"here's the data\",\n" +
                "    \"log\": \"here's the log\",\n" +
                "    \"hash\": \"HERES_A_HASH\"\n" +
                "  },\n" +
                "  \"error\": \"\"\n" +
                "}";

        final JSONRPCResult jsonrpcResult = mapper.fromJson(rpcResultAsJson, JSONRPCResult.class);
        assertThat(jsonrpcResult, is(notNullValue()));

        assertThat(jsonrpcResult.getId(), is("1"));
        assertThat(jsonrpcResult.getResult().getCode(), is(1));
        assertThat(jsonrpcResult.getResult().getLog(), is("here's the log"));
        assertThat(jsonrpcResult.getResult().getData(), is("here's the data"));
        assertThat(jsonrpcResult.getResult().getHash(), is("HERES_A_HASH"));

    }

}