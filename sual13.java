
//13.Verilmiş ədədin rəqəmlərindən ən böyüyünü tapan proqram tərtib edin.
import java.util.Scanner;

public class sual13 {
    public static void main(String[] args) {
        int reqem;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        while (n > 0) {
            reqem = n % 10;
            n = n / 10;
            if (reqem > max) {
                max = reqem;
            }

        }
        System.out.println(max);

    }
}
