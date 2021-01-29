package com.mashibing.test;

@MyAnnotation({"ab", "cd"})
public class Person {

    private String name;

    @Deprecated
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
