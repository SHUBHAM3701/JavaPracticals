import java.util.*;

class GoodMorning
{

    public static void main(String[] args)

    { 

        int n = 100; // loop for 100 times

        for (int i=1; i<=n; i++)                                 

        {
          if (i%15==0)                                                 

                System.out.println("GoodMorning"); 

            

            else if (i%5==0)     

                System.out.println("Morning"); 
 


            else if (i%3==0)     

                System.out.println("Good");

                 

            else // print the numbers

                System.out.println(i);                         

        }

    }
}