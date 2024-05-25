//53.Matrisin baş diaqonalında yerləşən cüt elementlərin cəmini tapan proqram tərtib edin.
public class sual53 {
    public static void main(String[] args) {
        int[][] a = { { 12, 2, 3 }, { 4, 5, 6 }, { 7, 8, 10 } };
        int cem=0;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    if(a[i][j]%2==0){
                        cem=cem+a[i][j];
                    }
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(cem);

    }
}
