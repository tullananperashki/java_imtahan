//46.Bir ölçülü massivin elementləri arasında minimum və maksimum elementi nəzərə almadan yerdə qalan elementlərin cəmini tapın.
public class sual46 {
    public static void main(String[] args) {
        int []a={2,23,5,65,12};
        int cem=0;
        int max=a[0];
        int min=a[0];
        for (int i =0;i<a.length;i++){
            if(a[i]>=max){
                max=a[i];
            }
            if(a[i]<=min){
                min=a[i];
            }
        }
        for (int j=0 ; j<a.length;j++){
            if (a[j]!=min && a[j]!=max){
                cem=cem+a[j];
            }
        }
        System.out.println(cem);
    }
}
