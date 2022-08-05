import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int num1 = reader.nextInt();
	  System.out.print("Enter 2nd number : ");

	  int num2 = reader.nextInt();
	  int sum=num1+num2;

        System.out.println("Sum of two numbers is : " + sum);
    }
}