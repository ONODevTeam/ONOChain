package com.ono.chain.rpc.responses.dumpconsensus;

import com.ono.chain.rpc.TmRpcMethod;
import com.ono.chain.rpc.mapper.CouldNotReadJsonException;
import com.ono.chain.rpc.mapper.IMapper;
import com.ono.chain.rpc.responses.ResponseHelper;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DumpConsensusStateResponseHelper extends ResponseHelper {

    private static final Logger log = LoggerFactory.getLogger(DumpConsensusStateResponseHelper.class);

    public DumpConsensusStateResponseHelper(IMapper mapper) {
        super(mapper);
    }


    public boolean isDumpConsensusStateResponse(final String inboundMessage) throws CouldNotReadJsonException {
        if (inboundMessage == null || inboundMessage.isEmpty()) {
            return false;
        }
        final String id = getRawId(inboundMessage);
        return StringUtils.startsWithIgnoreCase(id, TmRpcMethod.DUMP_CONSENSUS_STATE.getMethodString());
    }

    public Map<String, Long> parseAllOtherNodeHeights(final String dumpConsensusResponseJson) {
        Objects.requireNonNull(dumpConsensusResponseJson, "Dump consensus state response message was null.");

        final Map<String, Long> allPeerHeights = new HashMap<>();

        final DumpConsensusStateResponse dumpConsensusResponse;
        try {
            dumpConsensusResponse = mapper.fromJson(dumpConsensusResponseJson, DumpConsensusStateResponse.class);
        } catch (Exception e) {
            final String message = "Could not parse dump_consensus_response JSON";
            log.error(message + " [json={}; exceptionMessage={}].", dumpConsensusResponseJson, e.getMessage());
            throw new RuntimeException(message, e);
        }

        try {
            final Result result = dumpConsensusResponse.getResult();
            final List<Peer> peers = result.getPeers();
            peers.forEach(peer -> {
                final String nodeAddress = peer.getNodeAddress();
                final long height = peer.getPeerState().getRoundState().getHeight();

                allPeerHeights.put(nodeAddress, (long) height);
            });
        } catch (Exception e) {
            final String message = "Could not extract nodeHeights from dump_consensus_response";
            log.error(message + " [json={}; exceptionMessage={}].", dumpConsensusResponseJson, e.getMessage());
            throw new RuntimeException(message, e);
        }

        return allPeerHeights;
    }

}
