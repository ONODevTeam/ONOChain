
package com.ono.chain.rpc.responses.dumpconsensus;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "round",
    "prevotes",
    "prevotes_bit_array",
    "precommits",
    "precommits_bit_array"
})
public class Vote {

    @JsonProperty("round")
    private Long round;
    @JsonProperty("prevotes")
    private List<String> prevotes = null;
    @JsonProperty("prevotes_bit_array")
    private String prevotesBitArray;
    @JsonProperty("precommits")
    private List<String> precommits = null;
    @JsonProperty("precommits_bit_array")
    private String precommitsBitArray;

    @JsonProperty("round")
    public Long getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(Long round) {
        this.round = round;
    }

    @JsonProperty("prevotes")
    public List<String> getPrevotes() {
        return prevotes;
    }

    @JsonProperty("prevotes")
    public void setPrevotes(List<String> prevotes) {
        this.prevotes = prevotes;
    }

    @JsonProperty("prevotes_bit_array")
    public String getPrevotesBitArray() {
        return prevotesBitArray;
    }

    @JsonProperty("prevotes_bit_array")
    public void setPrevotesBitArray(String prevotesBitArray) {
        this.prevotesBitArray = prevotesBitArray;
    }

    @JsonProperty("precommits")
    public List<String> getPrecommits() {
        return precommits;
    }

    @JsonProperty("precommits")
    public void setPrecommits(List<String> precommits) {
        this.precommits = precommits;
    }

    @JsonProperty("precommits_bit_array")
    public String getPrecommitsBitArray() {
        return precommitsBitArray;
    }

    @JsonProperty("precommits_bit_array")
    public void setPrecommitsBitArray(String precommitsBitArray) {
        this.precommitsBitArray = precommitsBitArray;
    }

}
