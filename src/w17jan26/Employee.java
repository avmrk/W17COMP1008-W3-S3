/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17jan26;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author AV
 */
public abstract class Employee {
    private String firstName, lastName;
    private int socialInsuranceNumber;
    private LocalDate birthdate;
 
    public Employee(String first, String last, int sin, LocalDate dob)
    {
        firstName = first;
        lastName = last;
        socialInsuranceNumber = sin;
        setBirthday(dob);
    }
/**
 * This method will validate that the Employee is 15-90 years old
 */
    private void setBirthday(LocalDate dob) 
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();
        
        if (age >=15 && age <=90)
            birthdate =dob;
        else
            throw new IllegalArgumentException("Employees must be 15-90 years old");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

/**
 * This method will return the employee's first and last name
 */
    @Override
public String toString()
{
    return firstName +" " + lastName;
}

public abstract Paycheque getPayCheck();
}


