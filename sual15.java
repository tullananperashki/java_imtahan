//15.Verilmiş ədədin rəqəmlərinin cəmi, hasili və ədədi ortasını tapan proqram tərtib edin.
import java.util.Scanner;

public class sual15 {
    public static void main(String[] args) {
        int cem=0,hasil=1;
        int reqem;
        float ededi_orta;
        int say=0;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        while (n>0){
            reqem=n%10;
            n=n/10;
            cem=cem+reqem;
            hasil=hasil*reqem;
            say=say+1;

        }
        ededi_orta=cem/say;
        System.out.println(ededi_orta);
        System.out.println(cem);
        System.out.println(hasil);

    }
}
