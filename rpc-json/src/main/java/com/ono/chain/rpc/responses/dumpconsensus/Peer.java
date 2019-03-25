
package com.ono.chain.rpc.responses.dumpconsensus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "node_address",
    "peer_state"
})
public class Peer {

    @JsonProperty("node_address")
    private String nodeAddress;
    @JsonProperty("peer_state")
    private PeerState peerState;

    @JsonProperty("node_address")
    public String getNodeAddress() {
        return nodeAddress;
    }

    @JsonProperty("node_address")
    public void setNodeAddress(String nodeAddress) {
        this.nodeAddress = nodeAddress;
    }

    @JsonProperty("peer_state")
    public PeerState getPeerState() {
        return peerState;
    }

    @JsonProperty("peer_state")
    public void setPeerState(PeerState peerState) {
        this.peerState = peerState;
    }

}
