package io.netty.buffer;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0000 0100
//        System.out.println(-8>>>1);

//        List<Integer> sizeTable = new ArrayList<Integer>();
//        for (int i = 16; i < 512; i += 16) {
//            sizeTable.add(i);
//        }
//
//        for (int i = 512; i > 0; i <<= 1) {
//            sizeTable.add(i);
//        }

        assert 1==2;
        System.out.println(1024^1040);
        System.out.println(62 ^ 71);
        /**
         *  &
         */

        System.out.println(3&1);
        System.out.println(64 >>> 30);
    }

    @org.junit.Test
    public void test(){

        PooledByteBufAllocator allocator = PooledByteBufAllocator.DEFAULT;
        ByteBuf buf = allocator.buffer();
        buf.writeBytes("jason".getBytes());
    }
}
