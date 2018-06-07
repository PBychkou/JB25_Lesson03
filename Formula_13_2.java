//package by.epam.les03.formula02;

import java.util.Scanner;

public class Formula_13_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;

		System.out.print("Enter x: ");
		x = sc.nextDouble();
		
		calcY(x);
		
		System.out.print("Enter x: ");
		x = sc.nextDouble();
		
		calcY(x);

		sc.close();
	}

	public static void calcY(double x){
		double fx;
		if (x >= 3) {
			fx = -Math.pow(x, 2) + 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) - 6);
		}
	
		System.out.println("x = " + x + "; y = " + fx);
	}

}
