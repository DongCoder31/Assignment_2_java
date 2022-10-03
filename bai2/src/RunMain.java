import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Enter n (1 .. 12): ");
            n = scanner.nextInt();
        } while (n > 12);

    }

    public static void checkDaysInMonth(int a) {
        switch (a) {
            case 1, 3, 5, 7, 9, 11:
                System.out.println("31 day");
                break;
            case 2:
                System.out.println("28 day");
                break;
            default:
                System.out.println("30 day");
        }
    }


}
