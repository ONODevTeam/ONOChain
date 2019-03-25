
package com.ono.chain.rpc.responses.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latest_block_hash",
    "latest_app_hash",
    "latest_block_height",
    "latest_block_time",
    "syncing"
})
class SyncInfo {

    @JsonProperty("latest_block_hash")
    private String latestBlockHash;
    @JsonProperty("latest_app_hash")
    private String latestAppHash;
    @JsonProperty("latest_block_height")
    private Long latestBlockHeight;
    @JsonProperty("latest_block_time")
    private String latestBlockTime;
    @JsonProperty("syncing")
    private Boolean syncing;

    @JsonProperty("latest_block_hash")
    public String getLatestBlockHash() {
        return latestBlockHash;
    }

    @JsonProperty("latest_block_hash")
    public void setLatestBlockHash(String latestBlockHash) {
        this.latestBlockHash = latestBlockHash;
    }

    @JsonProperty("latest_app_hash")
    public String getLatestAppHash() {
        return latestAppHash;
    }

    @JsonProperty("latest_app_hash")
    public void setLatestAppHash(String latestAppHash) {
        this.latestAppHash = latestAppHash;
    }

    @JsonProperty("latest_block_height")
    public Long getLatestBlockHeight() {
        return latestBlockHeight;
    }

    @JsonProperty("latest_block_height")
    public void setLatestBlockHeight(Long latestBlockHeight) {
        this.latestBlockHeight = latestBlockHeight;
    }

    @JsonProperty("latest_block_time")
    public String getLatestBlockTime() {
        return latestBlockTime;
    }

    @JsonProperty("latest_block_time")
    public void setLatestBlockTime(String latestBlockTime) {
        this.latestBlockTime = latestBlockTime;
    }

    @JsonProperty("syncing")
    public Boolean getSyncing() {
        return syncing;
    }

    @JsonProperty("syncing")
    public void setSyncing(Boolean syncing) {
        this.syncing = syncing;
    }

}
