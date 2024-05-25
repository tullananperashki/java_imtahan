//44.Bir ölçülü massivin tək elementlərinin maksimumu ilə cüt elementlərinin minimumunun yerini dəyişin.
public class sual44 {
    public static void main(String[] args) {
        int[] a = { 190, 133, 45, 76, 87,206 };

        int cut_min_index = 0;
        int tek_max_index = 0;
        System.out.println("Baslangic array:");
        for (int num : a) {
            System.out.println(num + " ");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                tek_max_index = i;

            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                cut_min_index = i;

            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] >= a[tek_max_index] && a[j] % 2 != 0) {
                tek_max_index = j;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] <= a[cut_min_index] && a[j] % 2 == 0) {
                cut_min_index = j;
            }
        }
        int temp = a[tek_max_index];
        a[tek_max_index] = a[cut_min_index];
        a[cut_min_index] = temp;

        System.out.println("Yekun array:");
        for (int num : a) {
            System.out.println(num + " ");
        }

    }
}
