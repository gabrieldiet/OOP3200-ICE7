
package com.company;

public class Person {
    private String m_name;
    private int m_age;

    public String getName() {
        return this.m_name;
    }

    public void setName(String m_name) {
        this.m_name = m_name;
    }

    public int getAge() {
        return this.m_age;
    }

    public void setAge(int m_age) {
        this.m_age = m_age;
    }

    public Person() {
        this.m_name = "unknown";
        this.m_age = 0;
    }

    public Person(String name, int age) {
        this.m_name = name;
        this.m_age = age;
    }

    public Person(String name) {
        this.m_name = name;
        this.m_age = 0;
    }

    public Person(int age) {
        this.m_name = "unknown";
        this.m_age = age;
    }

    public void saysHello() {
        System.out.println(this.m_name + " says Hello!");
    }

    public String toString() {
        String outputString = "";
        outputString = outputString + "Name: " + this.m_name + " ";
        outputString = outputString + "Age: " + this.m_age;
        return outputString;
    }
}
