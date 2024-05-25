//14.Verilmiş ədədin rəqəmlərindən ən kiçiyini tapan proqram tərtib edin.

import java.util.Scanner;

public class sual14 {
    public static void main(String[] args) {
        int reqem;
        int min = 9;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        while (n > 0) {
            reqem = n % 10;
            n = n / 10;
            if (reqem < min) {
                min = reqem;
            }

        }
        System.out.println(min);
    }
}
