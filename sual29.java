//29.Bir ölçülü massivin cüt indeksli elementlərini ekrana çıxaran proqram tərtib edin.
public class sual29 {
    public static void main(String[] args) {
        int[] array = {23,65,68,98,24};
        for (int i=0;i<array.length;i++){
            if(i%2==0){
                System.out.println(array[i]);
            }
        }
    }
}