//39.Bir ölçülü massivin minimum elementlərinin sayını tapın.
public class sual39 {
    public static void main(String[] args) {
        int[] array ={2,2,4,5,234,2,2};
        int min=array[0];
        int say=0;
        for (int i =0;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        for (int j = 0 ; j<array.length;j++){
            if (min==array[j]){
                say=say+1;
            }
        }
        System.out.println(say);
    }
}
