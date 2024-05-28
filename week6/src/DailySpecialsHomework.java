import java.util.Objects;
import java.util.Scanner;

public class DailySpecialsHomework
{
    public static void main(String[] args)
    {
        // Initialize our specials and our input:

        String specials = "";
        Scanner input = new Scanner(System.in);

        // Prompt our user to input the day:

        System.out.println("Please enter a day of the week, excluding weekends! (Monday - Friday only.) ");
        specials = input.next();

        // Send the user's input to checkDay:

        checkDay(specials, input);
    }

    public static void checkDay(String specials, Scanner input)
    {
        // To ignore casing, set the user's input to all-lowercase:

        specials = specials.toLowerCase();

        // If the day is on the weekend, request input again and check once more:

        if (Objects.equals(specials, "saturday") || Objects.equals(specials, "sunday"))
        {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
            checkDay(specials, input);
        }
        // If the day isn't a weekday or weekend day, request input again and check once more:
        // (There's almost certainly a better way to write this, but this is my solution off the top of my head with limited knowledge.)

        else if (!Objects.equals(specials, "monday") && !Objects.equals(specials, "tuesday") && !Objects.equals(specials, "wednesday") && !Objects.equals(specials, "thursday") && !Objects.equals(specials, "friday") && !Objects.equals(specials, "saturday") && !Objects.equals(specials, "sunday"))
        {
            System.out.println("Please enter a valid day, or check your spelling!");
            specials = input.next();
            checkDay(specials, input);
        }
        // Once a valid day is received, capitalize the first letter of the day and use our switch:

        else
        {
            String first_letter = specials.substring(0, 1).toUpperCase();
            specials = first_letter + specials.substring(1);

            String coffee;
            double price;

            switch (specials) {
                case "Monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + ", and the price is $" + price + ".");
                    HowManyCoffees(coffee, price, input);
                }
                case "Tuesday" -> {
                    coffee = "Frappe";
                    price = 5.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + ", and the price is $" + price + ".");
                    HowManyCoffees(coffee, price, input);
                }
                case "Wednesday" -> {
                    coffee = "Cappuccino";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + ", and the price is $" + price + ".");
                    HowManyCoffees(coffee, price, input);
                }
                case "Thursday" -> {
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + ", and the price is $" + price + ".");
                    HowManyCoffees(coffee, price, input);
                }
                case "Friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + ", and the price is $" + price + ".");
                    HowManyCoffees(coffee, price, input);
                }
            } // End switch.

        }
    }

    public static void HowManyCoffees(String coffee, double price, Scanner input)
    {
        int amount_of_coffees;

        System.out.println("How many " + coffee + "s would you like to order?");
        amount_of_coffees = input.nextInt();

        if (amount_of_coffees == 0)
        {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        }
        else if (amount_of_coffees == 1)
        {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        }
        else
        {
            System.out.print(amount_of_coffees + " " + coffee + "s have been ordered, totaling $");
            System.out.printf("%.2f", (amount_of_coffees * price));
            System.out.print(" dollars.");
        }
    }
}


