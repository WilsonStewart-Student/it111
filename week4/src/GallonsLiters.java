public class GallonsLiters
{
    public static void main(String[] args)
    {
        int gallons, counter = 0;
        float liters;

        for (gallons = 1; gallons <= 100; gallons = gallons + 4)
        {

            // Every five lines, add a break.
            if (counter % 5 == 0) {
                System.out.println();
            }

            // Convert gallons to liters.
            liters = gallons * 3.785412f;

            // Print liters as a two decimal number.
            System.out.printf("%.2f", liters);
            // Print rest of statement.
            if (gallons == 1) {
                System.out.println(" Liters = " + gallons + " Gallon");
            } else {
                System.out.println(" Liters = " + gallons + " Gallons");
            }

            // Count a line.
            counter++;

        }
        // for (gallons = 1; gallons <= 100; gallons = gallons + 4)

        System.out.println();
        System.out.println("We are done!");
    }
}
