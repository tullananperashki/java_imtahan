//31.Bir ölçülü massivin ən kiçik elementini ekrana çıxaran proqram tərtib edin.
public class sual31 {
    public static void main(String[] args) {
        int[] array = {2,56,68,10,76};
        int min = array[0];
        for (int  i = 0 ; i < array.length ; i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }
}