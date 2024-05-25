//17.Verilmiş ədədin bölənlərinin sayını tapan proqram tərtib edin.

import java.util.Scanner;

public class sual17 {
    public static void main(String[] args) {
        int say=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int n = scanner.nextInt();
        for (int i=1;i<=n;i++){
            if(n%i==0){
                say=say+1;
            }
        }
        System.out.println(say);
    }
}
