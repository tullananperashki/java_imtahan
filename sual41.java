//41.Bir ölçülü massivin minimum elementi ilə birinci elementinin yerini dəyişin.
public class sual41{
    public static void main(String[] args) {
        int [] a = {3,54,6546,1,12};
        int min_index = 0;
        System.out.println("Baslangic array:");
        for (int num : a){
            System.out.println(num + " ");
        }
        for (int i = 0 ;i < a.length;i++){
            if(a[min_index]>a[i]){
                min_index=i;
            }
        }
         int temp = a[0];
         a[0]=a[min_index];
         a[min_index]=temp;

         System.out.println("Yekun array:");
          for (int num : a){
            System.out.println(num + " ");
          }
    }
}