public class MyOperators2
{
    public static void main(String[] args)
    {
//        boolean tuna = true;
//        boolean bread = true;
//
//        if(tuna == true && bread == true)
//        {
//            System.out.println("We are having a sandwich!");
//        }
//        else
//        {
//            System.out.println("We are not!");
//        }

        boolean tuna = false;
        boolean bread = true;

        if(tuna == true || bread == true)
        {
            System.out.println("We are having some food products.");
        }
        else
        {
            System.out.println("We will not be eating any food products today...");
        }

        // Age - Drinking Age

        int age = 18;

        if (age >= 18)
        {
            System.out.println("Yippy skippy! We can order an adult beverage!");
        }
        else
        {
            System.out.println("We will have a diet coke!");
        }

        // Amusement Park Rollercoaster - Must be This Tall to Ride!

        float height = 4.0f;

        if (height < 4)
        {
            System.out.println("You will not be able to ride the rollercoaster!");
        }
        else
        {
            System.out.println("Have a great time on the rollercoaster!");
        }
    }
}
