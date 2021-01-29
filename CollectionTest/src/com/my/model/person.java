package com.my.model;

import java.util.Objects;

public class person {

    public person() {
    }

    public person(String name, int age, Integer bir) {
        this.name = name;
        this.age = age;
        this.bir = bir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (com.my.model.person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(bir, person.bir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, bir);
    }

    private String name;
    private int age;
    private Integer bir;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getBir() {
        return bir;
    }

    public void setBir(Integer bir) {
        this.bir = bir;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bir=" + bir +
                '}';
    }
}
