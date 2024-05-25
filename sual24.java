
//24.Verilmiş ədədin mükəmməl ədəd olduğunu müəyyənləşdirən proqram tərtib edin. Əgər natural ədədin özü bölənlərinin (özündən başqa) cəminə bərabərdirsə, ona mükəmməl ədəd deyilir.
import java.util.Scanner;

public class sual24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        int cem = 0;
        for (int i = 1; i < n; i++) {
            if (n%i==0){
                cem=cem+i;
            }
        }
        if (cem==n){
            System.out.println(n +" Ededi mukemmeldir...");
        }
        else{
            System.out.println(n + " Ededi mukemmel deyil...");
        }
    }
}
