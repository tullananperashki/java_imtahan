//27.Bir ölçülü massivin cüt elementlərinin indeksini ekrana çıxaran proqram tərtib edin.
public class sual27{
    public static void main(String[] args) {
        int[] array= {23,45,6,67,789};
        for (int i=0;i<array.length;i++){
            if(array[i]%2==0){
                System.out.println(i);
            }
        }
    }
}