public class Main {
    public static int Djelitelj(int n) {

        int dj = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) dj = i;
        }
        return dj;
    }

    public static void main(String[] args) {
        int sum = 0;
        int dj5 = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 4 == 0) {
                sum = sum + i;
            }
        }
        for (int i = 0; i < 40; i++) {
            if (Djelitelj(i) < i * 5) System.out.println(i);
        }
        System.out.println(sum);
        System.out.println(dj5);
    }
}