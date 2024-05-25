//43.Bir ölçülü massivin cüt elementlərinin maksimumu ilə tək elementlərinin minimumunun yerini dəyişin.
public class sual43 {
    public static void main(String[] args) {
        int[] a = { 40, 13, 24, 27, 39, 1 };
        int min_index = 0;
        int max_index = 0;
        System.out.println("Baslangic array:");
        for (int num : a) {
            System.out.println(num + " ");
        }
        for (int i = 0; i < a.length; i++) {
            if (a[min_index] > a[i]) {
                min_index = i;
            }
            if (a[max_index] < a[i]) {
                max_index = i;
            }
        }
        System.out.println("Yekun array:");
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                a[j] = a[max_index];
                System.out.println(a[j]);
            } else {
                a[j] = a[min_index];
                System.out.println(a[j]);
            }
        }

    }
}
