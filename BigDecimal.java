package OOP;

import java.util.Scanner;
import java.math.*;

public class BigDecimal {

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your first number ");
		java.math.BigDecimal e1 = sc.nextBigDecimal();
		
		System.out.println("Input your second number ");
		java.math.BigDecimal e2 = sc.nextBigDecimal();
	
		System.out.println("Result is : " +e1.abs().add(e2.abs()));

	}

}
