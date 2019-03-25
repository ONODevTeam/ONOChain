
package com.ono.chain.rpc.responses.dumpconsensus;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "round_state",
    "peers"
})
public class Result {

    @JsonProperty("round_state")
    private RoundState roundState;
    @JsonProperty("peers")
    private List<Peer> peers = null;

    @JsonProperty("round_state")
    public RoundState getRoundState() {
        return roundState;
    }

    @JsonProperty("round_state")
    public void setRoundState(RoundState roundState) {
        this.roundState = roundState;
    }

    @JsonProperty("peers")
    public List<Peer> getPeers() {
        return peers;
    }

    @JsonProperty("peers")
    public void setPeers(List<Peer> peers) {
        this.peers = peers;
    }

}
