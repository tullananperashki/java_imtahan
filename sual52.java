//52.Matrisin baş diaqonalında yerləşən elementlərin ədədi ortasını tapan proqram tərtib edin.
public class sual52 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int cem=0;
        int say=0;
        
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    cem=cem+a[i][j];
                    say=say+1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        double ededi_orta=cem/say;
        System.out.println(ededi_orta);

    }
}
