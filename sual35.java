//35.Bir ölçülü massivin tək elementlərindən ən kiçiyini ekrana çıxaran proqram tərtib edin.

public class sual35 {
    public static void main(String[] args) {
        int[] a = { 24, 11, 53, 12, 77, 68 };
        int min = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                min = a[j];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (min >= a[i] && a[i] % 2 != 0) {
                min = a[i];
            }
        }

        System.out.println(min);
    }
}