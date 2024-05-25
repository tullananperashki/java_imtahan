//37.Bir ölçülü massivin ən böyük elementinin indeksini ekrana çıxaran proqram tərtib edin.
public class sual37 {
    public static void main(String[] args) {
        int [] a={23,5546,76,443,11,765};
        int max = a[0];
        for (int i=0;i<a.length;i++){
            if (max<a[i]){
                max=a[i];
            }
        }
        for (int j = 0 ; j<a.length;j++){
            if (max==a[j]){
                System.out.println(j);
            }
        }
    }
}