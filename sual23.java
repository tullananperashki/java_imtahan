//23.Verilmiş aralıqda yerləşən bütün polindrom ədədləri tapan proqram tərtib edin.
public class sual23 {
    static boolean isPalindrome(int n){
        int ters=0;
        int k = n;
        int qaliq;
        while (k>0) {
            qaliq=k%10;
            ters=ters*10+qaliq;
            k=k/10; 
        }
        if(n==ters){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int min = 0;
        int max=100;
        for (int i=min;i<max;i++){
            if(isPalindrome(i)==true){
                System.out.println(i+" ");
            }
        }
    }

}
