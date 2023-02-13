
import java.util.Scanner;

class A_pattern 
{

   void display(int n)
   {

    for (int i = 0; i<=n; i++) 
    { 
 // Outer for loop for number of lines

      for (int j = 0; j<= n / 2; j++) 
      { 
// Inner for loop for logic execution

        if ((j == 0 || j == n / 2) && i != 0 || // prints two column lines

           i == 0  && j != n / 2 ||// print first line of alphabet
           i == n / 2) // prints middle line
           System.out.print("*");
        else

            System.out.print(" ");
      }
        System.out.println();
    }
   }  
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       A_pattern a =new A_pattern();
       a.display(7);
    }
}
