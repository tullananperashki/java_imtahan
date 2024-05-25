//8.Rəqəmləri müxtəlif olan bütün iki rəqəmli ədədləri ekrana çıxaran proqram tərtib edin.
public class sual8 {
    public static void main(String[] args) {
        
        for(int i=10;i<100;i++){
            
            int k=i;
            while(k>=10){
                if(k%10!=(k/10)%10) 
                {
                    System.out.println(i);
                }
                k=k/10;

            }
            
            
        }
    }
}
