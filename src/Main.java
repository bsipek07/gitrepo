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
        int a=2;
        int b=3;
;

        double zbr=0;
        double korijen=0;

        zbr = Math.pow(a,b)+(float)b/a;
        korijen = Math.sqrt(a);
        switch(a){
            case 10:{
                System.out.println("Broj je 10");
                break;
            }
            case 5: System.out.println("Na pola puta");
            default:a+=1;

        }

        System.out.println(a);

        System.out.println(zbr);

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

