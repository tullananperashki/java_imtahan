//30.Bir ölçülü massivin ən böyük elementini ekrana çıxaran proqram tərtib edin.
public class sual30 {
    public static void main(String[] args) {
        int[] array = {2,56,68,0,76};
        int max = array[0];
        for (int  i = 0 ; i < array.length ; i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
