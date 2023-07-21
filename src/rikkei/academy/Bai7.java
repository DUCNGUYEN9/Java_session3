package rikkei.academy;

public class Bai7 {
    public static void main(String[] args) {
        //Hiển thị các số nguyên tố nhỏ hơn 100
        System.out.println("Hiển thị các số nguyên tố nhỏ hơn 100 ");
        int n = 2;
        while (n < 100) {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 2) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(n + " ");
            }
            n++;
        }

    }
}
