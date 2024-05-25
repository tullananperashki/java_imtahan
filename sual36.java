//36.Bir ölçülü massivin ən kiçik elementinin indeksini ekrana çıxaran proqram tərtib edin.
public class sual36 {
    public static void main(String[] args) {
        int [] a={23,5546,76,443,11,765};
        int min = a[0];
        for (int i=0;i<a.length;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        for (int j = 0 ; j<a.length;j++){
            if (min==a[j]){
                System.out.println(j);
            }
        }
    }
}
