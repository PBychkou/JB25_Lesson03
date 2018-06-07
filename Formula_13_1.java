//package by.epam.les03.formula01;

import java.util.Scanner;

public class Formula_13_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0, Fx;

		System.out.print("Enter x: ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}

		if (x >= 3) {
			Fx = -Math.pow(x, 2) + 3 * x + 9;
		} else {
			Fx = 1 / (Math.pow(x, 3) - 6);
		}

		System.out.println("F(x) = " + Fx);		
	}
}
