package io.netty.example.nio;

public class ByteBuffer {

    public static void main(String[] args) {
        java.nio.ByteBuffer buffer = java.nio.ByteBuffer.allocateDirect(64);
        //JDK的clear不会清除缓冲区中的内容，只会讲position和limit、mark等变量变为默认值
        buffer.clear();
        buffer.put("Hi,Netty!".getBytes());

    }

}
