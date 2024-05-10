import java.util.Scanner;

public class DailySpecials
{
    public static void main(String[] args)
    {
        String specials;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week, excluding weekends! (Monday - Friday only.) ");
        specials = input.next();

//        input.close();

        // For each weekday special, I need a name of a coffee beverage, and a price.
        String coffee;
        double price;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday)
        {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }

        switch (specials) {
            // The case will be the day of the week.

            // This is an enhanced switch. A non-enhanced switch looks like this:
            // case "Monday":
            //      coffee = "Latte";
            //      price = 4.95;
            //      System.out.println(specials + "'s coffee of the day is a " + coffee + ", and the price is $" + price + ".");
            //      break;

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

//          default:
//              System.out.println("Please enter a valid day, or check your spelling!");
            }
        } // End switch.
    }

    // Using a method so I don't have to write this 5 times:
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
