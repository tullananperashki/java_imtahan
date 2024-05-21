//3.Üç tam ədəd verilmişdir. Onların bərabəryanlı üçbucaq əmələ gətirdiyini yoxlayan proqram tərtib edin.
import java.util.Scanner;

public class sual3 {
    public static void main(String[] args) {
        boolean f = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1ci terefi qeyd edin:");
        int teref_1 = scanner.nextInt();
        System.out.println("2ci terefi qeyd edin:");
        int teref_2 = scanner.nextInt();
        System.out.println("3cu terefi qeyd edin:");
        int teref_3 = scanner.nextInt();

        if ((teref_1 + teref_2 > teref_3) && (teref_1 + teref_3 > teref_2) && (teref_2 + teref_3 > teref_1)) {

            if ((teref_1 == teref_2 && teref_2 != teref_3) || (teref_1 == teref_3 && teref_1 != teref_2)
                    || (teref_2 == teref_3 && teref_2 != teref_1)) {
                System.out.println("Beraberyanlidir...");
            } else if (teref_1 == teref_2 && teref_2 == teref_3) {
                System.out.println("Berabertereflidir...");
            } else {
                System.out.println("Terefler muxtelifdir...");
            }

        }
        else{
            System.out.println("Verilen qiymetler ucbucaqin tereflerine uygun gelmir...");
        }

    }
}
