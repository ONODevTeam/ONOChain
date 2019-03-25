
package com.ono.chain.rpc.responses.status;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "node_info",
    "sync_info",
    "validator_info"
})
class Result {

    @JsonProperty("node_info")
    private NodeInfo nodeInfo;
    @JsonProperty("sync_info")
    private SyncInfo syncInfo;
    @JsonProperty("validator_info")
    private ValidatorInfo validatorInfo = null;

    @JsonProperty("node_info")
    public NodeInfo getNodeInfo() {
        return nodeInfo;
    }

    @JsonProperty("node_info")
    public void setNodeInfo(NodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    @JsonProperty("sync_info")
    public SyncInfo getSyncInfo() {
        return syncInfo;
    }

    @JsonProperty("sync_info")
    public void setSyncInfo(SyncInfo syncInfo) {
        this.syncInfo = syncInfo;
    }

    @JsonProperty("validator_info")
    public ValidatorInfo getValidatorInfo() {
        return validatorInfo;
    }

    @JsonProperty("validator_info")
    public void setValidatorInfo(ValidatorInfo validatorInfo) {
        this.validatorInfo = validatorInfo;
    }

}
