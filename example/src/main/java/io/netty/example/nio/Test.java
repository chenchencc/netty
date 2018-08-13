package io.netty.example.nio;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newScheduledThreadPool(3);
//        Future<Integer> future = service.submit(()->
//                 1);
//        System.out.println(future.get());
    }
}
