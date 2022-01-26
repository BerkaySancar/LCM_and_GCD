import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        // Greatest Common Divisor / EBOB(tr)  [With 'While' Loop]

        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.print("Number 1 = ");
        n1 = input.nextInt();
        System.out.print("Number 2 = ");
        n2 = input.nextInt();

        int gCD = 1;
        int i = 1;

        if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gCD = i;
                }
                i++;
            }
            System.out.print("Greatest common divisor = " + gCD);
        } else {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gCD = i;
                }
                i++;
            }
            System.out.print("Greatest Common Divisor = " + gCD);
        }
    }
}