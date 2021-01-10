package com.bilgeadam.thread2;

import com.bilgeadam.threadcolor.ThreadColor;

import java.util.concurrent.*;

public class ExecuterServiceExp {
    public static void main(String[] args) {
        Thread exampleThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(ThreadColor.ANSI_CYAN + Thread.currentThread().getName() + " --> " + i);
                }
            }
        });

        Runnable exampleRunnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(ThreadColor.ANSI_RED + Thread.currentThread().getName() + " --> " + i);
            }
        };
        Thread exampleThread2 = new Thread(exampleRunnable);
       // exampleThread.start();
        // exampleThread2.start();
        /*
        ExecutorService excSer = Executors.newSingleThreadExecutor();
        excSer.execute(exampleRunnable);
        excSer.execute(exampleRunnable);
        excSer.execute(exampleRunnable);
        excSer.execute(exampleRunnable);

        excSer.shutdown();

         */

        ExecutorService excSer1 =  Executors.newCachedThreadPool();
        Future<Integer> result = excSer1.submit(() -> {
            int a = 0;
            for (int i = 0; i < 10; i++) {
                a+=i;
            }
            return a;
        });

        try {
            System.out.println("The result is : " + result.get().intValue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        excSer1.shutdown();

        try {
            excSer1.awaitTermination(5, TimeUnit.SECONDS);
            excSer1.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
