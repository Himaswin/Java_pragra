package io.sample;

import java.util.concurrent.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int x;
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Runnable r1 = ()->{
            System.out.println("name of thread: " + Thread.currentThread().getName());
            int i = 0;
            while(i < 10){
                System.out.println(Thread.currentThread().getName());
//                System.out.println("i = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                i++;
            }
        };

        //        Thread t1 = new Thread(r1);
//        System.out.println("t1.getState = " + t1.getState());
//        t1.start();
////        t1.run(); //if you use only run then it will be on the same thread
//        System.out.println("start state = " + t1.getState());
//        System.out.println(Thread.currentThread().getName());
//        Callable<String> callable = ()->{
//            System.out.println(Thread.currentThread().getName());
//                int i = 0;
//                while(i < 10){
//                    Thread.sleep(1000);
//                    i++;
//                    System.out.println(i + " sleeping rn");
//                }
//                return "hello from Callable";
//
//
//        };
//        FutureTask<String> future = new FutureTask<>(callable);
//        Thread t2 = new Thread(future);
//        t2.start();
//        System.out.println("t2.getState = " + t2.getState());
//        System.out.println("future.get() = " + future.get());

        ExecutorService executor = Executors.newFixedThreadPool(3);
        ExecutorService executor2 = Executors.newCachedThreadPool();
        //        executor2.execute(r1);
//        executor2.execute(r1);
//        executor2.execute(r1);
//        executor2.execute(r1);
//        executor2.execute(r1);
//        executor2.close();
//        ForkJoinPool forkJoinPool = new ForkJoinPool();
//        ForkJoinTask<?> submit = forkJoinPool.submit(r1);
//        forkJoinPool.submit(r1);
//        forkJoinPool.submit(r1);
//        forkJoinPool.submit(r1);
//        forkJoinPool.submit(r1);
//        submit.get();

    }
}