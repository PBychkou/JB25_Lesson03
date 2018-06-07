//MinMaxString

import java.util.Scanner;

public class HomeWork_13_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = 10;

        printRes(calcMinMax(n, sc));
        
        sc.close();
        
    }

    public static String[] calcMinMax(int n, Scanner sc) {
        String maxStr = "", minStr = "", str = "";
        String[] arr = new String[2];
        for (int i = 0; i < n; i++) {
            System.out.print("> ");
            str = readFromConsole(sc);
            if (0 == i) {
                minStr = str;
            }
            if (str.length() > maxStr.length()) {
                maxStr = str;
            } else if (str.length() < minStr.length()) {
                minStr = str;
            }
        }
        arr[0] = minStr;
        arr[1] = maxStr;
        return arr;
    }

    public static String readFromConsole(Scanner sc) {

        String str = "";
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        }

        return str;
    }

    public static void printRes(String[] calcMinMax) {
        System.out.println("Max string = " + calcMinMax[1] + ", length = " + calcMinMax[1].length());
        System.out.println("Min string = " + calcMinMax[0] + ", length = " + calcMinMax[0].length());
    }
}