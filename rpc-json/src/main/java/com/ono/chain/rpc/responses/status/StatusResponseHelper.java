package com.ono.chain.rpc.responses.status;

import com.ono.chain.rpc.TmRpcMethod;
import com.ono.chain.rpc.mapper.CouldNotReadJsonException;
import com.ono.chain.rpc.mapper.IMapper;
import com.ono.chain.rpc.responses.ResponseHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class StatusResponseHelper extends ResponseHelper {

    private static final Logger LOG = LoggerFactory.getLogger(StatusResponseHelper.class);

    public StatusResponseHelper(IMapper mapper) {
        super(mapper);
    }

    public boolean isStatusResponse(String json) throws CouldNotReadJsonException {
        if (StringUtils.isBlank(json)) {
            return false;
        }
        String id = getRawId(json);
        return StringUtils.startsWithIgnoreCase(id, TmRpcMethod.STATUS.getMethodString());
    }

    public Long parseLatestBlockHeight(String webSocketResponse) throws CouldNotReadJsonException {
        Objects.requireNonNull(webSocketResponse, "Status response message was null.");
        final StatusResponse statusResponse = mapper.fromJson(webSocketResponse, StatusResponse.class);
        return statusResponse.getResult().getSyncInfo().getLatestBlockHeight();
    }

    public String parseNodeId(String webSocketResponse) throws CouldNotReadJsonException {
        Objects.requireNonNull(webSocketResponse, "Status response message was null.");
        final StatusResponse statusResponse = mapper.fromJson(webSocketResponse, StatusResponse.class);
        return statusResponse.getResult().getNodeInfo().getId();
    }

    public LocalDateTime parseLatestBlockTime(String webSocketResponse) throws CouldNotReadJsonException {
        Objects.requireNonNull(webSocketResponse, "Status response message was null.");
        final StatusResponse statusResponse = mapper.fromJson(webSocketResponse, StatusResponse.class);
        final String latestBlockTimeAsString = statusResponse.getResult().getSyncInfo().getLatestBlockTime();
        return LocalDateTime.parse(latestBlockTimeAsString, DateTimeFormatter.ISO_DATE_TIME);
    }

    public boolean parseSyncing(String webSocketResponse) throws CouldNotReadJsonException {
        Objects.requireNonNull(webSocketResponse, "Status response message was null.");
        final StatusResponse statusResponse = mapper.fromJson(webSocketResponse, StatusResponse.class);
        return statusResponse.getResult().getSyncInfo().getSyncing();
    }

    /**
     * @param webSocketResponse the response from RPC as JSON. Is ignored.
     * @return an empty string
     * @deprecated Since TM20, the field "error" is no longer available in the status response
     */
    @Deprecated
    public String parseError(final String webSocketResponse) {
        return "";
    }
}
