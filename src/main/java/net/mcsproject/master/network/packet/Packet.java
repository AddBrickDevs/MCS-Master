package net.mcsproject.master.network.packet;

import io.netty.buffer.ByteBuf;

public abstract class Packet {

    public abstract void read(ByteBuf byteBuf);

    public abstract void write(ByteBuf byteBuf);

}
