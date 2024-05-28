package PersonPackageHomework;

import PersonPackageHomework.Person;

public class PersonDetails
{
    // This file will have a main method!

    public static void main(String[] args)
    {
        // Using Our Person Class to Create Two Person Objects:
        PersonPackageHomework.Person first_person = new Person();
        first_person.name = "Kathy";
        first_person.gender = 'F';
        first_person.age = 33;
        first_person.car = 2010;
        first_person.violations = false;
        first_person.credit_score = 690;

        PersonPackageHomework.Person second_person = new Person();
        second_person.name = "Kendall";
        second_person.gender = 'M';
        second_person.age = 22;
        second_person.car = 2019;
        second_person.violations = true;
        second_person.credit_score = 670;

        PersonPackageHomework.Person third_person = new Person();
        third_person.name = "Ariel";
        third_person.gender = 'F';
        third_person.age = 54;
        third_person.car = 2003;
        third_person.violations = true;
        third_person.credit_score = 600;

        first_person.display();
        System.out.println("Preliminary Rate: " + first_person.getRate() + " USD");
        System.out.println("Adjustments: " + first_person.adjustRate() + " USD");
        System.out.println("Total Monthly Premium: " + (first_person.getRate() + first_person.adjustRate()));

        System.out.println();

        second_person.display();
        System.out.println("Preliminary Rate: " + second_person.getRate() + " USD");
        System.out.println("Adjustments: " + second_person.adjustRate() + " USD");
        System.out.println("Total Monthly Premium: " + (second_person.getRate() + second_person.adjustRate()));

        System.out.println();

        third_person.display();
        System.out.println("Preliminary Rate: " + third_person.getRate() + " USD");
        System.out.println("Adjustments: " + third_person.adjustRate() + " USD");
        System.out.println("Total Monthly Premium: " + (third_person.getRate() + third_person.adjustRate()));
    }
}

