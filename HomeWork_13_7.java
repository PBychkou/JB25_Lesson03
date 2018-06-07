import java.util.Scanner;

public class HomeWork_13_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = readYearFromConsole(sc);

        printRes(readMonthFromConsole(year, sc));

        sc.close();        
    }

    public static int readYearFromConsole(Scanner sc) {
        System.out.print("Enter year: ");
        int year_internal = 0;
        if (sc.hasNextInt()) {
            year_internal = sc.nextInt();
        }
        return year_internal;
    }   

    public static int readMonthFromConsole(int year, Scanner sc) {
        System.out.print("Enter month: ");
        int col_day = 0;
        if (sc.hasNextInt()) {
            int month_internal = sc.nextInt();
            switch (month_internal) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    col_day = 31;
                    break;
                case 2:
                    if (0 == year % 4) {
                        col_day = 29;
                    } else {
                        col_day = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    col_day = 30;
                    break;
            }
        }
        return col_day;
    }

    public static void printRes(int readMonthFromConsole) {
        System.out.println("The amount of days equals: " + readMonthFromConsole);
    }

}