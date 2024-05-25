//38.Bir ölçülü massivin maksimum elementlərinin sayını tapın.
public class sual38 {
    public static void main(String[] args) {
        int[] array ={234,2,4,5,234,2,2};
        int max=array[0];
        int say=0;
        for (int i =0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        for (int j = 0 ; j<array.length;j++){
            if (max==array[j]){
                say=say+1;
            }
        }
        System.out.println(say);
    }
}
