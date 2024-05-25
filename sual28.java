//28.Bir ölçülü massivin tək indeksli elementlərini ekrana çıxaran proqram tərtib edin.
public class sual28 {
    public static void main(String[] args) {
        int[] array = {2,3,5,7,9,11};
        for (int i = 0 ; i < array.length ; i++){
            if(i%2!=0){
                System.out.println(array[i]);
            }
        }
    }
}
