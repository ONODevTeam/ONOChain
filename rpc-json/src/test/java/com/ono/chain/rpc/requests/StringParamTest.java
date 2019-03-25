package com.ono.chain.rpc.requests;

import com.ono.chain.rpc.TmRpcMethod;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class StringParamTest {

    @Test
    public void testStringParamMethodString() {
        StringParam classUnderTest = new StringParam(TmRpcMethod.BROADCAST_TX_COMMIT, "A003");

        assertThat(classUnderTest.getId(), is(notNullValue()));
        assertThat(classUnderTest.getMethod(), is("broadcast_tx_commit"));
        assertThat(Arrays.asList(classUnderTest.params), hasItem("QTAwMw=="));
    }

    @Test
    public void testStringParamMethodByteArray() {
        StringParam classUnderTest = new StringParam(TmRpcMethod.BROADCAST_TX_COMMIT, new byte[] {0x41, 0x30, 0x30, 0x33});

        assertThat(classUnderTest.getId(), is(notNullValue()));
        assertThat(classUnderTest.getMethod(), is("broadcast_tx_commit"));
        assertThat(Arrays.asList(classUnderTest.params), hasItem("QTAwMw=="));
    }

    @Test
    public void testStringParamMethodByteArrayArray() {
        StringParam classUnderTest = new StringParam(TmRpcMethod.BROADCAST_TX_COMMIT, new byte[][] {{0x41, 0x30, 0x30, 0x33}, {0x39, 0x42}});

        assertThat(classUnderTest.getId(), is(notNullValue()));
        assertThat(classUnderTest.getMethod(), is("broadcast_tx_commit"));
        assertThat(Arrays.asList(classUnderTest.params), hasItems("QTAwMw==", "OUI="));
    }

}
