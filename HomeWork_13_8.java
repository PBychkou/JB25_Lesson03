import java.util.Scanner;

public class HomeWork_13_8 {

    public static void main(String[] args) {

        printRez(calc(readFromConsole()));
            
    }

    public static int readFromConsole() {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        System.out.print("Enter number: ");
        if (sc.hasNextInt()) {
            tmp = sc.nextInt();
        }
        sc.close();
        return tmp;
    }

    public static boolean calc(int readFromConsole) {
        boolean rez = false;
        while (readFromConsole != 0) {
            int digit = readFromConsole % 10;
            readFromConsole /= 10;
            if (digit % 2 == 0) {
                rez = true;                
            }
        }
        return rez;
    }

    public static void printRez(boolean calc) {
        if (calc == true) {
            System.out.println("There is an even digit in the number.");
        } else {
            System.out.println("There are no even digit in the number.");
        }
        
    }
}