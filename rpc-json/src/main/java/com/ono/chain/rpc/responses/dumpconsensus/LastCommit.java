
package com.ono.chain.rpc.responses.dumpconsensus;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "votes",
    "votes_bit_array",
    "peer_maj_23s"
})
public class LastCommit {

    @JsonProperty("votes")
    private List<String> votes = null;
    @JsonProperty("votes_bit_array")
    private String votesBitArray;
    @JsonProperty("peer_maj_23s")
    private PeerMaj23s peerMaj23s;

    @JsonProperty("votes")
    public List<String> getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(List<String> votes) {
        this.votes = votes;
    }

    @JsonProperty("votes_bit_array")
    public String getVotesBitArray() {
        return votesBitArray;
    }

    @JsonProperty("votes_bit_array")
    public void setVotesBitArray(String votesBitArray) {
        this.votesBitArray = votesBitArray;
    }

    @JsonProperty("peer_maj_23s")
    public PeerMaj23s getPeerMaj23s() {
        return peerMaj23s;
    }

    @JsonProperty("peer_maj_23s")
    public void setPeerMaj23s(PeerMaj23s peerMaj23s) {
        this.peerMaj23s = peerMaj23s;
    }

}
