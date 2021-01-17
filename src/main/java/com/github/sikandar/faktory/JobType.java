package com.github.sikandar.faktory;

/**
 * Faktory JobType
 * @author Sikandar Ali Awan
 */
public interface JobType {

    String getName();

    static JobType of(String name) {
        return new BaseJobType(name);
    }
}
