import java.util.Scanner;

public class GradeAveraging
{
    public static void main(String[] args)
    {
//      Ask the end user to input their numerical grades.

        int counter = 1;
        int grade;
        double total = 0, average;
        Scanner input = new Scanner(System.in);

//      Our while loop will count how many times we are asking the end user to input a grade.

        while(counter <= 5) {
            System.out.println("Please enter your numerical grade for class " + counter + ".");
            grade = input.nextInt();
            total += grade;

            counter++;
        } // while(counter <= 5)

        String message;
        char letter_grade;

        counter--;

        average = total / counter;

        System.out.println("You have earned an average grade of " + average + " after providing us with " + counter + " grades." );

        if (average >= 90 && average <= 100)
        {
            letter_grade = 'A';
            message = "Excellent work!";
        }
        else if (average >= 80 && average < 90)
        {
            letter_grade = 'B';
            message = "Solid work!";
        }
        else if (average >= 70 && average < 80)
        {
            letter_grade = 'C';
            message = "More studying necessary!";
        }
        else if (average >= 60 && average < 70)
        {
            letter_grade = 'D';
            message = "Squeaking by!";
        }
        else
        {
            letter_grade = 'F';
            message = "Not a passing grade!";
        }

        System.out.println("You have earned the following letter grade: " + letter_grade);
        System.out.println("Here is your message: " + message);

    }
}
