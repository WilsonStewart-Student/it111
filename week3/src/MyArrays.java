import java.util.Arrays;

public class MyArrays
{
    public static void main(String[] args)
    {
//        String car = "volvo";
        String[] cars = new String[4];
        // 4 is literally how many values will be in our array,
        // but the array indexes from 0 to 3.
        cars[0] = "Volvo";
        cars[1] = "Ford";
        cars[2] = "Toyota";
        cars[3] = "Honda";

        System.out.println(cars[0].toUpperCase());
        // We can use a Java library to access "Arrays.toString(array_name)",
        // and print our array without a loop as one string.
        System.out.println(Arrays.toString(cars));



//        String[] books = {"Handmaid's Tale", "Slenderman", "The Joy Luck Club", "East of Eden", "The Looming Tower"};
        String[] books = new String[5];
        books[0] = "Handmaid's Tale";
        books[1] = "Slenderman";
        books[2] = "The Joy Luck Club";
        books[3] = "East of Eden";
        books[4] = "The Looming Tower";

        System.out.println(Arrays.toString(books));



        // Now we are going to build a for each loop.

        for(String book : books)
        {
            System.out.println(book);
        }

        int[] numbers = new int[3];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 50;

        System.out.println(Arrays.toString(numbers));

        for(int number : numbers)
        {
            System.out.println(number);
        }

        String[] wines = new String[5];
        wines[0] = "Cabernet";
        wines[1] = "Merlot";
        wines[2] = "Syrah";
        wines[3] = "Malbec";
        wines[4] = "Cabernet-Frank";

        for(String wine : wines)
        {
            System.out.println(wine);
            System.out.println(wine.length());
        }

        for(String wine : wines)
        {
            if (wine.equals("Malbec"))
            {
                break;
            }

            System.out.println(wine);
        }
    }
}
