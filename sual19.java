//19.Verilmiş ədədin sadə vuruqlarını tapan proqram tərtib edin.
import java.util.Scanner;
public class sual19 {
    public static void main(String[] args) {
        int vuruq;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        int i=2;
        while (n>0){
            if(n%i==0){
                n=n/i;
                System.out.println(i);
            }
            else{
                i=i+1;
            }
            
        }
        
    }
}
