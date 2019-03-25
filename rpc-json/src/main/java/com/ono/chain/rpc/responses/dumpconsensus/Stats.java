
package com.ono.chain.rpc.responses.dumpconsensus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "last_vote_height",
    "votes",
    "last_block_part_height",
    "block_parts"
})
public class Stats {

    @JsonProperty("last_vote_height")
    private Long lastVoteHeight;
    @JsonProperty("votes")
    private Long votes;
    @JsonProperty("last_block_part_height")
    private Long lastBlockPartHeight;
    @JsonProperty("block_parts")
    private Long blockParts;

    @JsonProperty("last_vote_height")
    public Long getLastVoteHeight() {
        return lastVoteHeight;
    }

    @JsonProperty("last_vote_height")
    public void setLastVoteHeight(Long lastVoteHeight) {
        this.lastVoteHeight = lastVoteHeight;
    }

    @JsonProperty("votes")
    public Long getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Long votes) {
        this.votes = votes;
    }

    @JsonProperty("last_block_part_height")
    public Long getLastBlockPartHeight() {
        return lastBlockPartHeight;
    }

    @JsonProperty("last_block_part_height")
    public void setLastBlockPartHeight(Long lastBlockPartHeight) {
        this.lastBlockPartHeight = lastBlockPartHeight;
    }

    @JsonProperty("block_parts")
    public Long getBlockParts() {
        return blockParts;
    }

    @JsonProperty("block_parts")
    public void setBlockParts(Long blockParts) {
        this.blockParts = blockParts;
    }

}
