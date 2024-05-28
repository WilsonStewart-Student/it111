public class PersonRegular
{
    public static void main(String[] args)
    {
        // Create Our Variables:

        String first_person_name = "Kathy", second_person_name = "Kendall";
        char first_person_gender = 'F', second_person_gender = 'M';
        int first_person_age = 33, second_person_age = 22;
        String first_person_car = "Volkswagen Bug", second_person_car = "Mustang";
        boolean first_person_violations = false, second_person_violations = true;
        int first_person_credit_score = 690, second_person_credit_score = 670;
        double monthly_rate_one, monthly_rate_two;
        double adjusted_rate_one, adjusted_rate_two;
        double total_one, total_two;

        // Use Our Variables To Determine Car Insurance Prices:
        // -- If you have: traffic tickets, DUIs, other violations, you will be paying more.

        if (first_person_violations && first_person_credit_score <= 700)
        {
            monthly_rate_one = 500;
        }
        else
        {
            monthly_rate_one = 100;
        }

        if (second_person_violations && second_person_credit_score <= 700)
        {
            monthly_rate_two = 500;
        }
        else
        {
            monthly_rate_two = 100;
        }

        // Also, gender and age make a difference...

        if (first_person_gender == 'F' && first_person_age <= 25)
        {
            adjusted_rate_one = 100;
        }
        else
        {
            adjusted_rate_one = 0;
        }

        if (second_person_gender == 'M' && second_person_age <= 25)
        {
            adjusted_rate_two = 100;
        }
        else
        {
            adjusted_rate_two = 0;
        }

        total_one = monthly_rate_one + adjusted_rate_one;
        total_two = monthly_rate_two + adjusted_rate_two;

        // Print Them All Out:

        System.out.println("First Person Name: " + first_person_name);
        System.out.println("First Person Gender: " + first_person_gender);
        System.out.println("First Person Age: " + first_person_age);
        System.out.println("First Person Car: " + first_person_car);
        System.out.println("First Person Has Violations: " + first_person_violations);
        System.out.println("First Person Credit Score: " + first_person_credit_score);
        System.out.println("First Person Preliminary Rate: " + monthly_rate_one);
        System.out.println("First Person Final Monthly Rate (including gender & age): " + total_one);

        System.out.println();

        System.out.println("Second Person Name: " + second_person_name);
        System.out.println("Second Person Gender: " + second_person_gender);
        System.out.println("Second Person Age: " + second_person_age);
        System.out.println("Second Person Car: " + second_person_car);
        System.out.println("Second Person Has Violations: " + second_person_violations);
        System.out.println("Second Person Credit Score: " + second_person_credit_score);
        System.out.println("Second Person Preliminary Rate: " + monthly_rate_two);
        System.out.println("Second Person Final Monthly Rate (including gender & age): " + total_two);
    }
}
