public class Main {
    public static int Djelitelj(int n) {

        int dj = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) dj = i;
        }
        return dj;
    }
    public static int multi(int n){

         int mul=0;
        for(int i=1;i<n;i++){
            if((n*i)>=(n+10))mul+=i;

        }
        return mul;
    }


    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 4 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println(Djelitelj(sum));
        System.out.println(multi(sum));
            if (Djelitelj(sum) > multi(sum)) System.out.println("Djelitelj je veći");
                    else System.out.println("Mnozitelj je veći");

    }

    }

