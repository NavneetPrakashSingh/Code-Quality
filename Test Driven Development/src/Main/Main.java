package Main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		System.out.println("Enter first and second number:");
		Scanner getInputValuesFromUser = new Scanner(System.in);	
		
		ModelSum sumObj = new ModelSum();
		sumObj.setFirstValue(getInputValuesFromUser.nextInt());
		sumObj.setSecondValue(getInputValuesFromUser.nextInt());
		
		CalculateSum calculateSum = new CalculateSum(sumObj);
		System.out.println("Sum is:"+calculateSum.sum());
	}
}
