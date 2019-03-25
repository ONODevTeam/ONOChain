package com.ono.chain.rpc;

public enum TmRpcMethod {

    /**
     * query the ABCI_APP, path=x, data=x, prove={true/false}; use: MixedParam(ABCI_QUERY, new Object[]{"value","value",true})
     */
    ABCI_QUERY("abci_query"), //
    NET_INFO("net_info"), //
    STATUS("status"), //
    DUMP_CONSENSUS_STATE("dump_consensus_state"), //
    /**
     * Shows unconfirmed transactions
     */
    UNCONFIRMED_TXS("unconfirmed_txs"), //
    /**
     * number of unconfirmed txs
     */
    NUM_UNCONFIRMED_TXS("num_unconfirmed_txs"), //
    /**
     * takes TX as parameter
     */
    BROADCAST_TX_SYNC("broadcast_tx_sync"), //
    /**
     * takes TX as parameter
     */
    BROADCAST_TX_ASYNC("broadcast_tx_async"), //
    /**
     * takes TX as parameter
     */
    BROADCAST_TX_COMMIT("broadcast_tx_commit"), //
    /**
     * Retrieves information about the given block, takes height as parameter
     */
    BLOCK_HEIGHT("block"), //
    /**
     * subscribes to an event, takes event as parameter
     */
    SUBSCRIBE_EVENT("subscribe"), //
    /**
     * Query a TX by its hash, hash=X prove={true/false}; use: MixedParam(TX, new Object[]{"HASHVALUEHERE",true})
     */
    TX("tx");

    private final String methodString;

    TmRpcMethod(String method) {
        this.methodString = method;
    }

    public String getMethodString() {
        return methodString;
    }

}
