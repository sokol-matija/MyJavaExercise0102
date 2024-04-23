/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hr.algebra.model;

/**
 *
 * @author daniel.bele
 */
public final class Person {
    
    private final String firstName;
    private final String lastName;
    private final int age;
    private final double salary;
    private final String gender;

    public Person(String firstName, String lastName, int age, double salary, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", salary=" + salary + ", gender=" + gender + '}';
    }

    
    
    
}
