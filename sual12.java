
//12.Verilmiş ədədi rəqəmlərinə ayıran proqram tərtib edin.
import java.util.Scanner;

public class sual12 {
    public static void main(String[] args) {
        int reqem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        while (n > 0) {
            reqem = n % 10;
            n = n / 10;
            System.out.println(reqem);

        }

    }
}
