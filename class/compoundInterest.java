import java.util.Scanner;
class compInt
{
	public static void main(String args[])
	{
        double principle, rate, time, compound_interest;
        Scanner my_scanner = new Scanner(System.in);
        System.out.println("A Scanner object has been defined ");
        System.out.print("Enter a Principle number : ");
        principle = my_scanner.nextInt();
        System.out.print("Enter Interest rate : ");
        rate = my_scanner.nextInt();
        System.out.print("Enter a Time period in years : ");
        time = my_scanner.nextInt();
 
	double amount=0;
	amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
    System.out.println("amount="+amount);
    compound_interest=amount-principle;
    System.out.println("compound interest="+compound_interest);
 
	}
}
