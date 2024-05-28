package PersonPackageHomework;

import java.time.Year;

public class Person
{
    // This file does not have a main method.
    // We will start typing fields (variables).

    String name;
    char gender;
    int age;
    int car;
    boolean violations;
    int credit_score;

    double monthly_rate;
    double adjusted_rate;

    public void display()
    {
        System.out.println("Customer Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Car Manufacturing Date: " + car);
        System.out.println("Has Violations: " + violations);
        System.out.println("Credit Score: " + credit_score);
    }

    public double getRate()
    {
        // Base rate defined whether or not you have violations and a less than ideal credit score.

        if (violations && credit_score <= 700)
        {
            monthly_rate = 500;
        }
        else
        {
            monthly_rate = 100;
        }

        return monthly_rate;
    }

    public double adjustRate()
    {
        // Adjusted rate is secretly added based on your gender and age.

        if (gender == 'M' && age <= 25)
        {
            adjusted_rate = 100;
        }
        else
        {
            adjusted_rate = 0;
        }

        // And the age of your car.

        // Grab the current year as an int.

        int year = Year.now().getValue();

        // I have no idea at what age a car is considered old! Here are some numbers.

        if (year - car < 7)
        {
            // If the car's less than 7 years old:
            adjusted_rate += 120;
        }
        else if (year - car < 14)
        {
            // If the car's less than 14 years old:
            adjusted_rate += 60;
        }
        else
        {
            // If the car's more than 14 years old:
            adjusted_rate += 0;
        }

        return adjusted_rate;
    }
}

