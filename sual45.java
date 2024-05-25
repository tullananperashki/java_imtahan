//45.Verilmiş ədədin bir ölçülü massivdə olub-olmadığını yoxlayan proqram tərtib edin.
import java.util.Scanner;
public class sual45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        int [] a ={23,5,6,7,87};
        boolean f=false;
        for (int num : a){
            if(n==num){
                f=true;
                break;
            }
        }
        if (f==true) {
            System.out.println("Bu eded massivde var...");
        }
        else{
            System.out.println("Bu eded massivde yoxdur...");
        }
    }
}
