//20.Verilmiş ədədin sadə və ya mürəkkəb ədəd olduğunu tapan proqram tərtib edin.

import java.util.Scanner;

public class sual20 {
    public static void main(String[] args) {
        boolean f=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        for (int i=2;i<n;i++){
            if(n%i==0){
                f=true;
                break;
            }
            
        }
        if (f==true){
            System.out.println("Verilen eded murekkebdir...");
        }
        else{
            System.out.println("Verilen eded sadedir...");
        }
    }
}
