import java.util.Objects;
import java.util.Scanner;

public class DailySpecialsFinal
{
    public static void main(String[] args)
    {
        // Create our specials & our input:

        String specials;
        Scanner input = new Scanner(System.in);

        // Prompt our user to input the day, and assign it to specials:

        System.out.println("Please enter a day of the week, excluding weekends! (Monday - Friday only.) ");
        specials = input.next();

        // Send specials to checkDay to see if it is valid. Send input to checkDay to reuse if it is not:

        checkDay(specials, input);
    }

    public static void checkDay(String specials, Scanner input)
    {
        // To ignore casing for our check, set specials to all-lowercase.

        specials = specials.toLowerCase();

        // While the answer is a not a weekday, ask the user to provide different input:

        while (!Objects.equals(specials, "monday") && !Objects.equals(specials, "tuesday") && !Objects.equals(specials, "wednesday") && !Objects.equals(specials, "thursday") && !Objects.equals(specials, "friday"))
        {
            if (Objects.equals(specials, "saturday") || Objects.equals(specials, "sunday"))
            {
                System.out.println("Please enter a weekday, not weekend!");
                specials = input.next();
            }
            else
            {
                System.out.println("Please enter a valid day, or check your spelling!");
                specials = input.next();
            }
            specials = specials.toLowerCase();
        }

        // Once specials is a weekday, capitalize the first letter and use it to set some variables
        // in our switch:

        String first_letter = specials.substring(0, 1).toUpperCase();
        specials = first_letter + specials.substring(1);

        // These need to be initialized with values, or it gets mad at me:

        String coffee = null;
        double price = 0;

        switch (specials)
        {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
            }
        } // End switch.

        System.out.println(specials + "'s coffee of the day is a " + coffee + ", and the price is $" + price + ".");

        // Now that the user knows the coffee of the day and the price, ask how many of that coffee they want to order:

        String amount_of_coffees;
        int valid_amount_of_coffees = 0;
        boolean valid_amount = false;

        System.out.println("How many " + coffee + "s would you like to order?");

        // Make sure the user answers with an int (by using a string first because I had issues with try-catching just for nextInt.):

        while (!valid_amount)
        {
            System.out.println("Please answer in whole numbers.");
            amount_of_coffees = input.next();
            try
            {
                Integer.parseInt(amount_of_coffees);
                valid_amount = true;
                valid_amount_of_coffees = Integer.parseInt(amount_of_coffees);
            }
            catch(Exception e) {
                valid_amount = false;
            }
        }

        if (valid_amount_of_coffees == 0)
        {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        }
        else if (valid_amount_of_coffees == 1)
        {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        }
        else if (valid_amount_of_coffees < 5 )
        {
            System.out.print(valid_amount_of_coffees + " " + coffee + "s have been ordered, totaling $");
            System.out.printf("%.2f", (valid_amount_of_coffees * price));
            System.out.print(".");
        }
        else if (valid_amount_of_coffees < 10)
        {
            System.out.print(valid_amount_of_coffees + " " + coffee + "s have been ordered, qualifying you for a group discount!");
            System.out.println();
            System.out.print("Your regular total would be $");
            System.out.printf("%.2f", (valid_amount_of_coffees * price));
            System.out.print(", but with the discount, it is only $");
            System.out.printf("%.2f", ((valid_amount_of_coffees * price) * 0.95));
            System.out.print(".");
        }
        else
        {
            System.out.print(valid_amount_of_coffees + " " + coffee + "s have been ordered, qualifying you for a BIG group discount!");
            System.out.println();
            System.out.print("Your regular total would be $");
            System.out.printf("%.2f", (valid_amount_of_coffees * price));
            System.out.print(", but with the discount, it is only $");
            System.out.printf("%.2f", (0.9 * (valid_amount_of_coffees * price)));
            System.out.print(".");
        }
    }
}
