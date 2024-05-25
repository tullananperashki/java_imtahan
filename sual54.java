//54.Matrisin köməkçi diaqonalından yuxarıda yerləşən elementlərin cəmini tapan proqram tərtib edin.
public class sual54 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; 
        int cem=0;
        
        
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i+j<2) {
                    cem=cem+a[i][j];
                    
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(cem);
        

    }
}