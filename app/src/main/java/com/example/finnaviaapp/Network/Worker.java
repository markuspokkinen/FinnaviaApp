package com.example.finnaviaapp.Network;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Worker {


    private static Worker instance = null;

    private static final Object isLock = new Object();

    private ExecutorService executor = Executors.newSingleThreadExecutor();

    private Worker() {}

    static Worker getInstance() {

        synchronized (isLock) {
            if(instance == null) instance = new Worker();
        }
        return instance;
    }

    void registerTask(Runnable runnable){
        if(executor.isShutdown()) {
            executor = null;
            executor = Executors.newSingleThreadExecutor();
        }
        executor.execute(runnable);
    }

    public void shutdown(boolean force){
        if(force)
            executor.shutdownNow();
        else
            executor.shutdown();
    }

}
