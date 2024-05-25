//32.Bir ölçülü massivin cüt elementlərindən ən böyüyünü ekrana çıxaran proqram tərtib edin.
public class sual32 {
    public static void main(String[] args) {
        int[] a = { 24, 11, 53, 12, 77, 68 };
        int max = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                max = a[j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (max <= a[i] && a[i] % 2 == 0) {
                max = a[i];
            }
        }

        System.out.println(max);
    }
}