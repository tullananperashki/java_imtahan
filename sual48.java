//48.Bir ölçülü massivin birinci elementi ilə maksimum elementi arasındakı elementlərin cəmini tapan proqram tərtib edin.
public class sual48 {
    public static void main(String[] args) {
        int[] a= {22,3,14,8};
        int cem=0;
        int max_index=0;
        for (int i= 0;i<a.length;i++){
            if(a[i]>=a[max_index]){
                max_index=i;
            }
        }
        for(int i=1;i<max_index;i++){
            cem=cem+a[i];
        }
        System.out.println(cem);
    }
}
