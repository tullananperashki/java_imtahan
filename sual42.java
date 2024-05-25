//42.Bir ölçülü massivin maksimum elementi ilə minimum elementinin yerini dəyişin.
public class sual42 {
    public static void main(String[] args) {
        int[] a = { 23, 45, 43, 12, 32, 78 };
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
        int temp = a[min_index];
        a[min_index]=a[max_index];
        a[max_index]=temp;

        System.out.println("Yekun array:");
        for (int num : a){
            System.out.println(num + " ");
        }

    }
}
