package PersonPackage;

public class Person
{
    // This file does not have a main method.
    // We will start typing fields (variables).

    String name;
    char gender;
    int age;
    String car;
    boolean violations;
    int credit_score;

    double monthly_rate;
    double adjusted_rate;

    public void display()
    {
        System.out.println("Customer Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Car Owned: " + car);
        System.out.println("Has Violations: " + violations);
        System.out.println("Credit Score: " + credit_score);
    }

    public double getRate()
    {
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
        if (gender == 'M' && age <= 25)
        {
            adjusted_rate = 100;
        }
        else
        {
            adjusted_rate = 0;
        }

        return adjusted_rate;
    }
}
