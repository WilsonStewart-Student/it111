public class MyOperators1
{
    public static void main(String[] args)
    {

////        Arithmetic Operators
//
////        employee, wage, hours worked, overtime
//
//        int regular_hours, overtime_hours;
//        double regular_pay, overtime_pay, total_pay;
//        float wage;
//        double hourly_with_overtime;
//
//        regular_hours = 40;
//        overtime_hours = 5;
//
//        wage = 25.50f;
//        regular_pay = regular_hours * wage;
//        overtime_pay = overtime_hours * (wage * 1.5);
//        total_pay = regular_pay + overtime_pay;
//        hourly_with_overtime = total_pay / (regular_hours + overtime_hours);
//
//        System.out.println("Our regular pay is: $" + regular_pay + " dollars.");
//        System.out.println("Our overtime pay is: $" + overtime_pay + " dollars.");
//        System.out.println("Our total pay is: $" + total_pay + " dollars.");
//
////        System.out.println("Our hourly rate with overtime is: $" + hourly_with_overtime + " dollars.");
//        System.out.print("Our hourly rate with overtime is: ");
//        System.out.printf("$%.2f", hourly_with_overtime);
//        System.out.print(" dollars.");


//        Modulus Operator

        int num_1, num_2, num_3;

        num_1 = 2579;
        num_2 = 2;
        num_3 = num_1 % num_2;

        if (num_3 == 0)
        {
            System.out.println(num_1 + " is an even number.");
        }
        else
        {
            System.out.println(num_1 + " is an odd number.");
        }

//        We are now going shopping!

//        double tax, item_price, item_tax, total_price;
//
//        tax = .10;
//        item_price = 100;
//        item_tax = item_price * tax;
//        total_price = item_price + item_tax;
//
//        System.out.println("Price of item: $" + item_price + " dollars.");
//        System.out.println("Tax on item: $" + item_tax + " dollars.");
//        System.out.println("Price including tax: $" + total_price + " dollars.");

        double item_price = 100;
        item_price *= 1.10;
        System.out.println("The total price of our item is: $" + item_price + " dollars.");
        System.out.print("The total price of our item is: ");
        System.out.printf("$%.2f", item_price);
        System.out.print(" dollars.");
    }
}
