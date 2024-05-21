
//4.	Üç tam ədəd verilmişdir. Onların düzbucaqlı üçbucaq əmələ gətirdiyini yoxlayan proqram tərtib edin.
import java.util.Scanner;

public class sual4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1ci terefi qeyd edin:");
        int teref_1 = scanner.nextInt();
        System.out.println("2ci terefi qeyd edin:");
        int teref_2 = scanner.nextInt();
        System.out.println("3cu terefi qeyd edin:");
        int teref_3 = scanner.nextInt();
        if((teref_1 * teref_1 + teref_2*teref_2==teref_3*teref_3) || (teref_1 * teref_1 + teref_3*teref_3==teref_2*teref_2) || (teref_3 * teref_3 + teref_2*teref_2==teref_1*teref_1)){
            System.out.println("Duzbucaqli ucbucaqdir...");
        }
        else{
            System.out.println("Duzbucaqli ucbucaq deyil...");
        }
    }
}
