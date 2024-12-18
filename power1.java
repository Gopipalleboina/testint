//Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
import java.util.Scanner;
class Power1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);        
		System.out.print("Enter the Base Number :");
		int base = input.nextInt();        
		System.out.print("Enter the Power Number :");
		int power = input.nextInt();
		int result = 1;
		for(int i = 1; i <= power; i++)
		{
			result *= base;
		}
 
		System.out.println("Result: "+ result);
	}
}