import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum;
        int i;

        System.out.print("Input N: ");
        n = scanner.nextInt(); //n = 10

        sum = 0;

        i = 1;
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
            //Moi lan thay doi gia tri bien i thi se cong vao tong
        }
        System.out.println("Tong cac so tu 1 den " + n + " = " + sum);

        System.out.println();
        sum = 0;
        for (i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Tong cac so tu 1 den " + n + " = " + sum);

        System.out.println();
        for (sum = 0, i = 1; i <= n; sum += i, i++);
        System.out.println("Tong cac so tu 1 den " + n + " = " + sum);

        System.out.println();
        sum = 0;
        i = 1;
        do {
            sum += i;
            i += 1;
        } while (i <= n);
        System.out.println("Tong cac so tu 1 den " + n + " = " + sum);
    }
}
