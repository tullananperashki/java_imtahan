//49.Bir ölçülü massivin minimum və maksimum elementlərinin ədədi ortasını tapan proqram tərtib edin.
public class sual49 {
    public static void main(String[] args) {
        int [] a={2,2,6,7,10,10};
        int say=0;
        int cem=0;
        int max=a[0];
        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(max<=a[i]){
                max=a[i];
            }
            if (min>=a[i]) {
                min=a[i];
            }
        }
        for (int j=0;j<a.length;j++){
            if(a[j]==min || a[j]==max){
                say=say+1;
                cem=cem+a[j];
            }
        }
        int ededi_orta=cem/say;
        System.out.println(ededi_orta);
    }
}
