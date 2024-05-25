//40.Bir ölçülü massivin maksimum elementi ilə birinci elementinin yerini dəyişin.

public class sual40 {
    public static void main(String[] args) {
        int[] a = { 3, 5, 1, 9, 8, 24 };
        int max_index = 0;
        System.out.println("Baslangic array:");
        for (int i : a) {
            System.out.println(i + " ");
        }
        for (int j = 0; j < a.length; j++) {
            if (a[max_index] < a[j]) {
                max_index = j;
            }
        }
        int temp = a[0];
        a[0] = a[max_index];
        a[max_index] = temp;

        System.out.println("Yekun array:");
        for (int i : a) {
            System.out.println(i + " ");
        }

    }
}
