//26.Bir ölçülü massivin tək elementlərinin indeksini ekrana çıxaran proqram tərtib edin
public class sual26 {

    public static void main(String[] args) {
        int[] array={1,12,3,14,15,6,7,8,9};
        for (int i=0;i<array.length;i++){
            if (array[i]%2!=0){
                System.out.println(i+" ");
            }
        }
    }
}