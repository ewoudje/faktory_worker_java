package com.github.sikandar.faktory;

public class BaseJobQueue implements JobQueue {
    private String name;

    BaseJobQueue(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
