//11.İlk 20 Fibbonaçi ədədini hesablayan proqram tərtib edin. Fibbonaçi ədədləri F(1)=1,  F(2)=1, F(3)=2, F(4)=3, F(5)=5,..., F(n)=F(n-1)+F(n-2) şərtlərini ödəyən ədədlərdir.
public class sual11 {
    public static void main(String[] args) {
        int fib1 = 1, fib2 = 1;
        int n = 20;

        System.out.println(fib1);
        System.out.println(fib2);
        for (int i = 2; i < 20; i++) {
            int fib_n = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_n;
            
            System.out.println(fib_n);
        }

    }
}
