//25.Verilmiş ədədin n-ci qüvvətini hesablayan proqram tərtib edin.
import java.util.Scanner;
public class sual25 {
    static int pow(int eded, int quvvet){
        if(quvvet==0){
            return 1;
        }
        if (quvvet==1){
            return eded;
        }
        else{
            return eded*pow(eded, quvvet-1);
        }
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int eded = scanner.nextInt();
        System.out.println("Quvveti daxil edin:");
        int quvvet = scanner.nextInt();
        
        System.out.println(pow(eded, quvvet));
    }
}
