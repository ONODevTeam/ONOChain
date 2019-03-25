
package com.ono.chain.rpc.responses.dumpconsensus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "height",
    "round",
    "step",
    "start_time",
    "proposal",
    "proposal_block_parts_header",
    "proposal_block_parts",
    "proposal_pol_round",
    "proposal_pol",
    "prevotes",
    "precommits",
    "last_commit_round",
    "last_commit",
    "catchup_commit_round",
    "catchup_commit"
})
public class PeerRoundState {

    @JsonProperty("height")
    private Long height;
    @JsonProperty("round")
    private Long round;
    @JsonProperty("step")
    private Long step;
    @JsonProperty("start_time")
    private String startTime;
    @JsonProperty("proposal")
    private Boolean proposal;
    @JsonProperty("proposal_block_parts_header")
    private ProposalBlockPartsHeader proposalBlockPartsHeader;
    @JsonProperty("proposal_block_parts")
    private Object proposalBlockParts;
    @JsonProperty("proposal_pol_round")
    private Long proposalPolRound;
    @JsonProperty("proposal_pol")
    private String proposalPol;
    @JsonProperty("prevotes")
    private String prevotes;
    @JsonProperty("precommits")
    private String precommits;
    @JsonProperty("last_commit_round")
    private Long lastCommitRound;
    @JsonProperty("last_commit")
    private String lastCommit;
    @JsonProperty("catchup_commit_round")
    private Long catchupCommitRound;
    @JsonProperty("catchup_commit")
    private String catchupCommit;

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

    @JsonProperty("proposal")
    public Boolean getProposal() {
        return proposal;
    }

    @JsonProperty("proposal")
    public void setProposal(Boolean proposal) {
        this.proposal = proposal;
    }

    @JsonProperty("proposal_block_parts_header")
    public ProposalBlockPartsHeader getProposalBlockPartsHeader() {
        return proposalBlockPartsHeader;
    }

    @JsonProperty("proposal_block_parts_header")
    public void setProposalBlockPartsHeader(ProposalBlockPartsHeader proposalBlockPartsHeader) {
        this.proposalBlockPartsHeader = proposalBlockPartsHeader;
    }

    @JsonProperty("proposal_block_parts")
    public Object getProposalBlockParts() {
        return proposalBlockParts;
    }

    @JsonProperty("proposal_block_parts")
    public void setProposalBlockParts(Object proposalBlockParts) {
        this.proposalBlockParts = proposalBlockParts;
    }

    @JsonProperty("proposal_pol_round")
    public Long getProposalPolRound() {
        return proposalPolRound;
    }

    @JsonProperty("proposal_pol_round")
    public void setProposalPolRound(Long proposalPolRound) {
        this.proposalPolRound = proposalPolRound;
    }

    @JsonProperty("proposal_pol")
    public String getProposalPol() {
        return proposalPol;
    }

    @JsonProperty("proposal_pol")
    public void setProposalPol(String proposalPol) {
        this.proposalPol = proposalPol;
    }

    @JsonProperty("prevotes")
    public String getPrevotes() {
        return prevotes;
    }

    @JsonProperty("prevotes")
    public void setPrevotes(String prevotes) {
        this.prevotes = prevotes;
    }

    @JsonProperty("precommits")
    public String getPrecommits() {
        return precommits;
    }

    @JsonProperty("precommits")
    public void setPrecommits(String precommits) {
        this.precommits = precommits;
    }

    @JsonProperty("last_commit_round")
    public Long getLastCommitRound() {
        return lastCommitRound;
    }

    @JsonProperty("last_commit_round")
    public void setLastCommitRound(Long lastCommitRound) {
        this.lastCommitRound = lastCommitRound;
    }

    @JsonProperty("last_commit")
    public String getLastCommit() {
        return lastCommit;
    }

    @JsonProperty("last_commit")
    public void setLastCommit(String lastCommit) {
        this.lastCommit = lastCommit;
    }

    @JsonProperty("catchup_commit_round")
    public Long getCatchupCommitRound() {
        return catchupCommitRound;
    }

    @JsonProperty("catchup_commit_round")
    public void setCatchupCommitRound(Long catchupCommitRound) {
        this.catchupCommitRound = catchupCommitRound;
    }

    @JsonProperty("catchup_commit")
    public String getCatchupCommit() {
        return catchupCommit;
    }

    @JsonProperty("catchup_commit")
    public void setCatchupCommit(String catchupCommit) {
        this.catchupCommit = catchupCommit;
    }

}
