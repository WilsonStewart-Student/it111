public class MyDataTypes
{
    public static void main(String[] args)
    {
        // Primitive data types:

        // In Java, we can use underscores where commas would be in numbers to make them more legible.

        // A short stores whole numbers from -32,768 to 32,767.
        short number1 = 32_000;

        // An int stores whole numbers from -2,147,483,648 to 2,147,483,647
        int number2 = 2_000_000_000;

        // A long stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        // You also need to add an "L" at the end of a long.
        long number3 = 3_000_000_000L;

        // A float stores fractional numbers with up to 7 decimal places.
        // You also need to add an "F" at the end of a float.
        float number4 = 30.57F;

        // A double stores fractional numbers with up to 15 decimal places.
        double number5 = 50.45678910;

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);

        // A boolean stores a true or false value.
        boolean dry = true;

        if (dry)
        {
            System.out.println("Time to hang up those curtains!");
        }
        else
        {
            System.out.println("We will have to wait a spell!");
        }

        // A char stores a single unicode character.
        char best = 'A';

        // Because char stores a character as a numerical value, we can add 1 to it to get the next
        // unicode character.
        System.out.println(++best);
    }
}
