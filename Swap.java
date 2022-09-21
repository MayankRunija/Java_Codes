import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 number for swapping :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before Swapping");
        System.out.println("A: " + a + " " + "B: " + b);
        swapper(a,b);
    }
    public  static void swapper(int num1 , int num2){
        int temp = num1 ;
        num1 = num2 ;
        num2 = temp ;
        System.out.println("After Swapping");
        System.out.println("first num : " + num1 + " " + "second num: " + num2);
    }
}
