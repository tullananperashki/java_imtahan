//1.	Üç tam ədəd verilmişdir. Onların üçbucağın tərəfləri olduğunu yoxlayan proqram tərtib edin.
public class sual1 {

    public static void main(String[] args) {
        int teref_1=8,teref_2=9,teref_3=17;
        if((teref_1 + teref_2 > teref_3) && (teref_1 + teref_3 > teref_2) && (teref_2 + teref_3 > teref_1)) {
            System.out.println("Üçbucağın tərəfləridir...");
        }   
        else{
            System.out.println("Üçbucağın tərəfləri deyil...");
        }    
    }
}