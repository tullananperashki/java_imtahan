//5.Verilmiş aralıqda son rəqəmi x olan bütün ədədləri ekrana çıxaran proqram tərtib edin.
public class sual5 {
    public static void main(String[] args) {
        int x=8;
        for(int i=10;i<=110;i++){
            if (i%10==x) {
                System.out.println(i);
            }
        }
    }
}
