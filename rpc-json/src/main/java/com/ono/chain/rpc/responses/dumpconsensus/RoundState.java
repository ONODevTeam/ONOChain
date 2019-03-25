
package com.ono.chain.rpc.responses.dumpconsensus;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "height",
    "round",
    "step",
    "start_time",
    "commit_time",
    "validators",
    "proposal",
    "proposal_block",
    "proposal_block_parts",
    "locked_round",
    "locked_block",
    "locked_block_parts",
    "valid_round",
    "valid_block",
    "valid_block_parts",
    "votes",
    "commit_round",
    "last_commit",
    "last_validators"
})
public class RoundState {

    @JsonProperty("height")
    private Long height;
    @JsonProperty("round")
    private Long round;
    @JsonProperty("step")
    private Long step;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("commit_time")
    private String commitTime;
    @JsonProperty("validators")
    private Validators validators;
    @JsonProperty("proposal")
    private Object proposal;
    @JsonProperty("proposal_block")
    private Object proposalBlock;
    @JsonProperty("proposal_block_parts")
    private Object proposalBlockParts;
    @JsonProperty("locked_round")
    private Long lockedRound;
    @JsonProperty("locked_block")
    private Object lockedBlock;
    @JsonProperty("locked_block_parts")
    private Object lockedBlockParts;
    @JsonProperty("valid_round")
    private Long validRound;
    @JsonProperty("valid_block")
    private Object validBlock;
    @JsonProperty("valid_block_parts")
    private Object validBlockParts;
    @JsonProperty("votes")
    private List<Vote> votes = null;
    @JsonProperty("commit_round")
    private Long commitRound;
    @JsonProperty("last_commit")
    private LastCommit lastCommit;
    @JsonProperty("last_validators")
    private LastValidators lastValidators;

    @JsonProperty("height")
    public Long getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Long height) {
        this.height = height;
    }

    @JsonProperty("round")
    public Long getRound() {
        return round;
    }

    @JsonProperty("round")
    public void setRound(Long round) {
        this.round = round;
    }

    @JsonProperty("step")
    public Long getStep() {
        return step;
    }

    @JsonProperty("step")
    public void setStep(Long step) {
        this.step = step;
    }

    @JsonProperty("start_time")
    public String getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("commit_time")
    public String getCommitTime() {
        return commitTime;
    }

    @JsonProperty("commit_time")
    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime;
    }

    @JsonProperty("validators")
    public Validators getValidators() {
        return validators;
    }

    @JsonProperty("validators")
    public void setValidators(Validators validators) {
        this.validators = validators;
    }

    @JsonProperty("proposal")
    public Object getProposal() {
        return proposal;
    }

    @JsonProperty("proposal")
    public void setProposal(Object proposal) {
        this.proposal = proposal;
    }

    @JsonProperty("proposal_block")
    public Object getProposalBlock() {
        return proposalBlock;
    }

    @JsonProperty("proposal_block")
    public void setProposalBlock(Object proposalBlock) {
        this.proposalBlock = proposalBlock;
    }

    @JsonProperty("proposal_block_parts")
    public Object getProposalBlockParts() {
        return proposalBlockParts;
    }

    @JsonProperty("proposal_block_parts")
    public void setProposalBlockParts(Object proposalBlockParts) {
        this.proposalBlockParts = proposalBlockParts;
    }

    @JsonProperty("locked_round")
    public Long getLockedRound() {
        return lockedRound;
    }

    @JsonProperty("locked_round")
    public void setLockedRound(Long lockedRound) {
        this.lockedRound = lockedRound;
    }

    @JsonProperty("locked_block")
    public Object getLockedBlock() {
        return lockedBlock;
    }

    @JsonProperty("locked_block")
    public void setLockedBlock(Object lockedBlock) {
        this.lockedBlock = lockedBlock;
    }

    @JsonProperty("locked_block_parts")
    public Object getLockedBlockParts() {
        return lockedBlockParts;
    }

    @JsonProperty("locked_block_parts")
    public void setLockedBlockParts(Object lockedBlockParts) {
        this.lockedBlockParts = lockedBlockParts;
    }

    @JsonProperty("valid_round")
    public Long getValidRound() {
        return validRound;
    }

    @JsonProperty("valid_round")
    public void setValidRound(Long validRound) {
        this.validRound = validRound;
    }

    @JsonProperty("valid_block")
    public Object getValidBlock() {
        return validBlock;
    }

    @JsonProperty("valid_block")
    public void setValidBlock(Object validBlock) {
        this.validBlock = validBlock;
    }

    @JsonProperty("valid_block_parts")
    public Object getValidBlockParts() {
        return validBlockParts;
    }

    @JsonProperty("valid_block_parts")
    public void setValidBlockParts(Object validBlockParts) {
        this.validBlockParts = validBlockParts;
    }

    @JsonProperty("votes")
    public List<Vote> getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    @JsonProperty("commit_round")
    public Long getCommitRound() {
        return commitRound;
    }

    @JsonProperty("commit_round")
    public void setCommitRound(Long commitRound) {
        this.commitRound = commitRound;
    }

    @JsonProperty("last_commit")
    public LastCommit getLastCommit() {
        return lastCommit;
    }

    @JsonProperty("last_commit")
    public void setLastCommit(LastCommit lastCommit) {
        this.lastCommit = lastCommit;
    }

    @JsonProperty("last_validators")
    public LastValidators getLastValidators() {
        return lastValidators;
    }

    @JsonProperty("last_validators")
    public void setLastValidators(LastValidators lastValidators) {
        this.lastValidators = lastValidators;
    }

}
