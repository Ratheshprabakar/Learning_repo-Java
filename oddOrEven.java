//Addition of two numbers
package javapracticeprograms;
import java.util.Scanner;
public class oddOrEven {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number\t");
		int inputNumber=input.nextInt();
		if(inputNumber%2==0)
		{
			System.out.println("The Given number is Even");
		}
		else
		{
			System.out.println("The Given number is Odd");
		}
	}
}
