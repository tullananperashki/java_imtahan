//21.Verilmiş aralıqda yerləşən bütün sadə ədədləri tapan proqram tərtib edin.

public class sual21 {
    public static void main(String[] args) {
        
        for (int i=2;i<100;i++){
            boolean f=false;
            for (int j=2;j<i;j++){
                if(i%j==0){
                    f=true;
                }
            }
            if(f==false){
                System.out.println(i);
            }
        }

    }
}
