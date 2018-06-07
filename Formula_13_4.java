//package by.epam.les03.formula04;

import java.util.Scanner;

public class Formula_13_4 {
	public static void main(String[] args) {

		double x = 0, y = 0;

		x = readXFromConsole();
		y = calcY(x);
		printResult(x, y);
		
		
		x = readXFromConsole();
		y = calcY(x);
		printResult(x, y);
		
	}
	
	public static double calcY(double x){
		double fx;
		if (x >= 3) {
			fx = -Math.pow(x, 2) + 3 * x + 9;
		} else {
			fx = 1 / (Math.pow(x, 3) - 6);
		}
		
		return fx;
	}
	
	public static double readXFromConsole(){
		Scanner sc = new Scanner(System.in);
		int x = 0;
		
		System.out.print("Enter x: ");
		while(!sc.hasNextDouble()){
			sc.next();
			System.out.print("Enter x: ");
		}
		x = sc.nextInt();
		
		return x;		
	}
	
	public static void printResult(double x, double y){
		System.out.println("y(" + x + ")=" + y + ";");		
	}

}
