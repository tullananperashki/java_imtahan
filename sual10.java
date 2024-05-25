//10.n faktorialı hesablayan proqram tərtib edin (n!=1*2*3*...*(n-1)*n).
import java.util.Scanner;
public class sual10 {
    public static void main(String[] args) {
        int fakt=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n-ci heddi qeyd edin:");
        int n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            fakt=fakt*i;

        }
        System.out.println(fakt);
    }
}
