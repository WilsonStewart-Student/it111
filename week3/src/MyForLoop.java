public class MyForLoop
{
    public static void main(String[] args)
    {

//        for(int count = 0; count <= 30; count = count+3)
//        {
//            System.out.println(count);
//        }
//        System.out.println("All done!");

        int new_count;
        for(new_count = 30; new_count > 0; new_count = new_count-1)
        {
//            System.out.println(new_count);
            if (new_count <= 10)
            {
                System.out.println("We are almost at blast off! Only " + new_count + " seconds away!");
            }
            else
            {
                System.out.println(new_count);
            }
        }
        System.out.println("Blast off!");
    }
}
