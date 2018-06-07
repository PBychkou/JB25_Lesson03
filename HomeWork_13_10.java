import java.util.Scanner;

public class HomeWork_13_10 {

    public static void main(String[] args) {
 
        int x = readFromConsole();
        if ((x >= -3) && (x < 3)) {
            System.out.println("F(x) is not defined for x = " + x);
        } else {
            printRez(x, calcFx(x));
        }
    }

    public static int readFromConsole() {
        Scanner sc = new Scanner (System.in);
        int tmp = 0;
        System.out.print("Enter x: ");
        if (sc.hasNextInt()) {
            tmp = sc.nextInt();
        }
        sc.close();
        return tmp;
    }

    public static double calcFx(int x) {
        double rez = 0;
        if (x <= -3) {
            rez = 9;
        } else if (x > 3) {
            rez = 1 / (Math.pow(x, 2) + 1);
        }
        return rez;
    }

    public static void printRez(int x, double calcFx) {
        System.out.println("For x = " + x + ", F(x) = " + calcFx);
    }
}