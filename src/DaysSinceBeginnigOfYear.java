import java.util.Scanner;

public class DaysSinceBeginnigOfYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int i = in.nextInt();
        numberOfDaysInAMonth(i);
    }

    private static void numberOfDaysInAMonth(int i) {
        int a = 31, b = 28, c = 30;
        switch (i) {
            case 1:
                System.out.println("The number of days in month number " + i + " is " + a);
                break;
            case 2:
                System.out.println("The number of days in month number " + i + " is " + (a + b));
                break;
            case 3:
                System.out.println("The number of days in month number " + i + " is " + ((2 * a) + b));
                break;
            case 4:
                System.out.println("The number of days in month number " + i + " is " + ((2 * a) + b + c));
                break;
            case 5:
                System.out.println("The number of days in month number " + i + " is " + ((3 * a) + b + c));
                break;
            case 6:
                System.out.println("The number of days in month number " + i + " is " + ((3 * a) + b + (2 * c)));
                break;
            case 7:
                System.out.println("The number of days in month number " + i + " is " + ((4 * a) + b + (2 * c)));
                break;
            case 8:
                System.out.println("The number of days in month number " + i + " is " + ((5 * a) + b + (2 * c)));
                break;
            case 9:
                System.out.println("The number of days in month number " + i + " is " + ((5 * a) + b + (3 * c)));
                break;
            case 10:
                System.out.println("The number of days in month number " + i + " is " + ((6 * a) + b + (3 * c)));
                break;
            case 11:
                System.out.println("The number of days in month number " + i + " is " + ((6 * a) + b + (4 * c)));
                break;
            case 12:
                System.out.println("The number of days in month number " + i + " is " + ((7 * a) + b + (4 * c)));
                break;
            default:
                System.out.println("No such number of the month!");
        }
    }
}
