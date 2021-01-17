package com.github.sikandar.faktory;

/**
 * Faktory Job Queue
 * @author Sikandar Ali Awan
 */
public interface JobQueue {
    String getName();

    static JobQueue of(String name) {
        return new BaseJobQueue(name);
    }
}
