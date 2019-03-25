
package com.ono.chain.rpc.responses.status;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "listen_addr",
    "network",
    "version",
    "channels",
    "moniker",
    "other"
})
class NodeInfo {

    @JsonProperty("id")
    private String id;
    @JsonProperty("listen_addr")
    private String listenAddr;
    @JsonProperty("network")
    private String network;
    @JsonProperty("version")
    private String version;
    @JsonProperty("channels")
    private String channels;
    @JsonProperty("moniker")
    private String moniker;
    @JsonProperty("other")
    private List<String> other = null;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("listen_addr")
    public String getListenAddr() {
        return listenAddr;
    }

    @JsonProperty("listen_addr")
    public void setListenAddr(String listenAddr) {
        this.listenAddr = listenAddr;
    }

    @JsonProperty("network")
    public String getNetwork() {
        return network;
    }

    @JsonProperty("network")
    public void setNetwork(String network) {
        this.network = network;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("channels")
    public String getChannels() {
        return channels;
    }

    @JsonProperty("channels")
    public void setChannels(String channels) {
        this.channels = channels;
    }

    @JsonProperty("moniker")
    public String getMoniker() {
        return moniker;
    }

    @JsonProperty("moniker")
    public void setMoniker(String moniker) {
        this.moniker = moniker;
    }

    @JsonProperty("other")
    public List<String> getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(List<String> other) {
        this.other = other;
    }

}
