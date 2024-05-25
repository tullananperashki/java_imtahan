//7.Rəqəmləri eyni olan bütün iki rəqəmli ədədləri ekrana çıxaran proqram tərtib edin.
public class sual7 {
    public static void main(String[] args) {
        
        for(int i=10;i<100;i++){
            int k=i;
            
            while(k>0){
                int qaliq = k%10;
                k=k/10;
                if(qaliq==(k%10)){
                    System.out.println(i);  
                }
                
            }
        }
    }
}
