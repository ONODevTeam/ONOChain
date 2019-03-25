
package com.ono.chain.rpc.responses.dumpconsensus;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "validators",
    "proposer"
})
public class LastValidators {

    @JsonProperty("validators")
    private List<Validator> validators = null;
    @JsonProperty("proposer")
    private Proposer proposer;

    @JsonProperty("validators")
    public List<Validator> getValidators() {
        return validators;
    }

    @JsonProperty("validators")
    public void setValidators(List<Validator> validators) {
        this.validators = validators;
    }

    @JsonProperty("proposer")
    public Proposer getProposer() {
        return proposer;
    }

    @JsonProperty("proposer")
    public void setProposer(Proposer proposer) {
        this.proposer = proposer;
    }

}
