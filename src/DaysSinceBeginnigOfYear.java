import java.util.Scanner;

public class DaysSinceBeginnigOfYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int i = in.nextInt();
        NumberOfDaysInAMonth(i);
    }

    private static void NumberOfDaysInAMonth(int i) {
        int a = 31, b = 28, c = 30;
        switch (i) {
            case 1:
                System.out.println("The number of days in month number " + i + " is " + a);
                break;
            case 2:
                System.out.println("The number of days in month number " + i + " is " + (a + b));
                break;
            case 3:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a));
                break;
            case 4:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c));
                break;
            case 5:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c + a));
                break;
            case 6:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c + a + c));
                break;
            case 7:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c + a + c + a));
                break;
            case 8:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c + a + c + a + a));
                break;
            case 9:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c + a + c + a + a + c));
                break;
            case 10:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c + a + c + a + a + c + a));
                break;
            case 11:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c + a + c + a + a + c + a + c));
                break;
            case 12:
                System.out.println("The number of days in month number " + i + " is " + (a + b + a + c + a + c + a + a + c + a + c + a));
                break;
            default:
                System.out.println("No such number of the month!");
        }
    }
}
