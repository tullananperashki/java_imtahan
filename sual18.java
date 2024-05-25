//18.Verilmiş ədədin bölənlərinin cəmini və hasilini tapan proqram tərtib edin.
import java.util.Scanner;

public class sual18 {
    public static void main(String[] args) {
        int cem=0,hasil=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
                cem=cem+i;
                hasil=hasil*i;
            }
        }
        System.out.println(cem);
        System.out.println(hasil);
    }
    
}
