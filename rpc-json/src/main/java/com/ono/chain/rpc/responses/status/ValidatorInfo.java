
package com.ono.chain.rpc.responses.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "address",
    "pub_key",
    "voting_power"
})
class ValidatorInfo {

    @JsonProperty("address")
    private String address;
    @JsonProperty("pub_key")
    private PubKey pubKey;
    @JsonProperty("voting_power")
    private Integer votingPower;

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("pub_key")
    public PubKey getPubKey() {
        return pubKey;
    }

    @JsonProperty("pub_key")
    public void setPubKey(PubKey pubKey) {
        this.pubKey = pubKey;
    }

    @JsonProperty("voting_power")
    public Integer getVotingPower() {
        return votingPower;
    }

    @JsonProperty("voting_power")
    public void setVotingPower(Integer votingPower) {
        this.votingPower = votingPower;
    }

}
