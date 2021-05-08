
package javapracticeprograms;

import java.util.Scanner;
public class SalaryCalculator {
	
	public static double salaryCalculator(double hoursPerWeek, double amountPerHour)
	{
		double weeklySalary = hoursPerWeek * amountPerHour;
		return weeklySalary * 52;
	}
	
	public static void main(String[] args) {
		double salary = salaryCalculator(40,15);
		System.out.println(salary);
	}
}
