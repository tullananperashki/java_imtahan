//47.Verilmiş elementin bir ölçülü massivdə neçə dəfə təkrarlandığını tapan proqram tərtib edin.
import java.util.Scanner;
public class sual47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        int[] a={23,34,54,34,65,34};
        int say=0;
        for (int num : a){
            if (num==n){
                say=say+1;
            }
        }
        System.out.println(say);
    }
}
