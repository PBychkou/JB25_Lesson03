import java.util.Scanner;

public class HomeWork_13_6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number = readFromConsole(sc);
        printRes(number, calcPow(number));

        sc.close(); 
             
    }

    public static int readFromConsole(Scanner sc) {

        int num = 0;
        System.out.print("Enter the number: ");
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        }
        return num;
    }

    public static int lastDigit(int number) {       
        int lastDig = number % 10;
        return lastDig;
    }

    public static int calcPow(int number) {
        int lastDigitSq = 0;
        switch (lastDigit(number)) {
            case 0:
                lastDigitSq = 0;
                break;
            case 1:
                lastDigitSq = 1;
                break;
            case 2:
                lastDigitSq = 4;
                break;
            case 3:
                lastDigitSq = 9;
                break;
            case 4:
                lastDigitSq = 6;
                break;
            case 5:
                lastDigitSq = 5;
                break;
            case 6:
                lastDigitSq = 6;
                break;
            case 7:
                lastDigitSq = 9;
                break;
            case 8:
                lastDigitSq = 4;
                break;
            case 9:
                lastDigitSq = 1;
                break;
            default:
                System.out.println("Something went wrong");                    
        }
        return lastDigitSq;
    }

    public static void printRes(int number, int calcPow) {
        System.out.println("Square of last digit " + number + " equals " + calcPow);
    }
}