//56.Matrisin köməkçi diaqonalından aşağıda yerləşən sıfırdan fərqli elementlərin cəmini tapan proqram tərtib edin.
public class sual56 {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } };
        int cem = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i + j > 2) {
                    if (a[i][j] != 0) {
                        cem = cem + a[i][j];
                    }

                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(cem);

    }
}