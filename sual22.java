//22.Verilmiş ədədin polindrom ədəd olduğunu müəyyənləşdirən proqram tərtib edin.
import java.util.Scanner;
public class sual22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        int ters=0;
        int k=n;
        int q;
        while (n>0){
            q=n%10;
            ters=ters*10+q;
            n=n/10;
        }
        if(ters==k){
            System.out.println("Polindromdur...");
        }
        else{
            System.out.println("Polindrom deyil...");
        }

    }
}
