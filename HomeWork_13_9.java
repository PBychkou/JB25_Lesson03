//Calculate F(x) on line segment [a, b] with the step h. Result should be displayed as a table.
//	

import java.util.Scanner;

public class HomeWork_13_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = readDataFromConsole(sc);
        printRes(array);

        sc.close();
    }

    public static int[] readDataFromConsole(Scanner sc) {

        int[] arr = new int[3];
        System.out.print("Enter the beggining of the line, a*PI: ");
        if (sc.hasNextInt()) {
            arr[0] = sc.nextInt();
        }
        System.out.print("Enter the end of the line, b*PI: ");
        if (sc.hasNextInt()) {
            arr[1] = sc.nextInt();
        }
        System.out.print("Enter the step, h: ");
        if (sc.hasNextInt()) {
            arr[2] = sc.nextInt();
        }
        return arr;
    }

    public static double calcFx(int x) {
        double Fx = 2 * Math.tan((double)x/2) + 1;
        return Fx;
    }

    public static void printRes(int[] array) {
        int i;
        for (i = array[0]; i <= array[1]; i += array[2]) {
            System.out.println("For x = " + i + ", F(x) = " + calcFx(i));
        }
        
    }
}