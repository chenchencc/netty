package io.netty.example.nio;

import java.nio.IntBuffer;

public class Buffer {
    public static void main(String args[]) {

        IntBuffer intBuffer = IntBuffer.allocate(10);
        intBuffer.put(10);
        intBuffer.put(101);

        System.err.println("Write mode: ");
        System.err.println("\tCapacity: " + intBuffer.capacity());
        System.err.println("\tPosition: " + intBuffer.position());
        System.err.println("\tLimit: " + intBuffer.limit());

        intBuffer.flip();
        System.err.println("Read mode: ");
        System.err.println("\tCapacity: " + intBuffer.capacity());
        System.err.println("\tPosition: " + intBuffer.position());
        System.err.println("\tLimit: " + intBuffer.limit());

        IntBuffer intBuffer1 = IntBuffer.allocate(2);
        intBuffer1.put(1);
        intBuffer1.put(2);
        System.err.println("position: " + intBuffer1.position());

        intBuffer1.rewind();
        System.err.println("position: " + intBuffer1.position());
        intBuffer1.put(1);
        intBuffer1.put(2);
        System.err.println("position: " + intBuffer1.position());


        intBuffer1.flip();
        System.err.println("position: " + intBuffer1.position());
        intBuffer1.get();
        intBuffer1.get();
        System.err.println("position: " + intBuffer1.position());

        intBuffer1.rewind();
        System.err.println("position: " + intBuffer1.position());
    }
}
