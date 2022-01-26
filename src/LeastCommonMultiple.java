import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {

        // Least Common Multiple / EKOK(tr)  [With 'While' Loop]

        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.print("Number 1 = ");
        n1 = input.nextInt();
        System.out.print("Number 2 = ");
        n2 = input.nextInt();

        int lCM = 1;
        int i = 1;

        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                lCM = i;
                break;
            }
            i++;
        }
        System.out.print("Least Common Multiple = " + lCM);
    }
}
