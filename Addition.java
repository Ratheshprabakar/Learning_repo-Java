//Addition of two numbers
package javapracticeprograms;
import java.util.Scanner;
public class Addition {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=input.nextInt();
		System.out.println("Enter the second number");
		int secondNumber=input.nextInt();
		int sum=firstNumber+secondNumber;
		System.out.println("Addtion of two numbers " + firstNumber + " and " + secondNumber + " is " + sum);
		
	}
}
