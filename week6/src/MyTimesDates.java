import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimesDates
{
    public static void main(String[] args)
    {
        // Let's display the current date!

        LocalDate current_date = LocalDate.now();
        System.out.println(current_date);

        // But what about the name of the month, and day of the week?

        Month current_month = LocalDate.now().getMonth();
        System.out.println(current_month);

        DayOfWeek current_day = LocalDate.now().getDayOfWeek();
        System.out.println(current_day);

        // Or just the year, as an integer?

        int current_year = LocalDate.now().getYear();
        System.out.println(current_year);

        // Or the day as an integer?

        int current_day_number = LocalDate.now().getDayOfMonth();
        System.out.println(current_day_number);

        System.out.println("Today is " + current_day + ", " + current_month + " " + current_day_number + ", " + current_year + "!");

    }
}
