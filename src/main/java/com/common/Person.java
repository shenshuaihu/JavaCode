package com.common;

import org.hibernate.validator.constraints.Length;

import javax.annotation.Generated;

@Generated("PERSON_TABLE")
@Length(max = 777)
public class Person extends BaseDto {
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "("+name + ", " +age+")";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
