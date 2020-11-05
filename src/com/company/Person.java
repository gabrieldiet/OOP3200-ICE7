/**
 * @author Gabriel Dietrich, 100764733
 * @date Nov 04, 2020
 * @description Introduction to Java code
 */

package com.company;

public class Person
{
    // Private instance variables
    private String m_name;
    private int m_age;

    // Public properties
    public String getName()
    {
        return this.m_name;
    }

    public void setName(String m_name)
    {
        this.m_name = m_name;
    }

    public int getAge()
    {
        return this.m_age;
    }

    public void setAge(int m_age)
    {
        this.m_age = m_age;
    }

    // Constructors

    // Default constructor sets the same to "unknown" and age to 0
    public Person()
    {
        this.m_name = "unknown";
        this.m_age = 0;
    }

    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    public Person(String name)
    {
        this.m_name = name;
        this.m_age = 0;
    }

    public Person(int age)
    {
        this.m_name = "unknown";
        this.m_age = age;
    }

    // Methods
    public void saysHello()
    {
        System.out.println(this.m_name + " says Hello!");
    }

    /**
     * This method overrides the built-in ToString() method and returns the Person properties
     * @return {String}
     */
    @Override
    public String toString()
    {
        String outputString = "";
        outputString = outputString + "Name: " + this.m_name + " ";
        outputString = outputString + "Age: " + this.m_age;

        return outputString;
    }
}
