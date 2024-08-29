package com.pandaria.portal.proto;

import bnet.protocol.RpcProto;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class RpcPacket {

    private final RpcProto.Header header;
    private final byte[] protoData;
    public RpcPacket(RpcProto.Header header) {
        this(header, null);
    }

    public RpcPacket(RpcProto.Header header, byte[] protoData) {
        this.header = header;
        this.protoData = protoData;
    }
}
