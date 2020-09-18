package com.it.demo.ccmap;

import java.util.Map;
import java.util.concurrent.*;

public class CcMapDemo {

    public static void main(String[] args) {
        ExecutorService executor = new ThreadPoolExecutor(100,
                150,
                10,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue());
        for (int i = 0; i < 100; i++) {
            executor.execute(new AddInterMapTask());
        }
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class AddInterMapTask implements Runnable {
        private final static String keyName = "keyName";
        private final ConcurrentHashMap<String, Map> outer = new ConcurrentHashMap<String, Map>();

        public void run() {
            System.out.println("init");
            if (!outer.containsKey(keyName)){
                synchronized (outer){
                    outer.put(keyName, new ConcurrentHashMap());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    if (!outer.containsKey(keyName)) {
//                    }
                }
            }

//            System.out.println(outer.size());
        }
    }
}
