//16.Verilmiş ədədin bütün bölənlərini tapan proqram tərtib edin.
import java.util.Scanner;

public class sual16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
    }
    
}
