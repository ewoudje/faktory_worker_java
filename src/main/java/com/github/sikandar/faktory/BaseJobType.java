package com.github.sikandar.faktory;

public class BaseJobType implements JobType {
    private String name;

    BaseJobType(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
