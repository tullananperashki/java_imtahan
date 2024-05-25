//55.Matrisin köməkçi diaqonalında yerləşən tək elementlərin ədədi ortasını tapan proqram tərtib edin.
public class sual55 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 17, 6 }, { 5, 8, 9 } };
        int cem = 0;
        int say = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i + j == 2) {
                    if (a[i][j] % 2 != 0) {
                        cem = cem + a[i][j];
                        say = say + 1;
                    }
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        double ededi_orta = cem / say;
        System.out.println(ededi_orta);

    }
}