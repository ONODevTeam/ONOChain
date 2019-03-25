
package com.ono.chain.rpc.responses.dumpconsensus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "round_state",
    "stats"
})
public class PeerState {

    @JsonProperty("round_state")
    private PeerRoundState roundState;
    @JsonProperty("stats")
    private Stats stats;

    @JsonProperty("round_state")
    public PeerRoundState getRoundState() {
        return roundState;
    }

    @JsonProperty("round_state")
    public void setRoundState(PeerRoundState roundState) {
        this.roundState = roundState;
    }

    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

}
