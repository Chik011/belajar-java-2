import java.util.Scanner;

class tes2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        double luas = 3.14 * 4 * n * n ;
        double volume = (4 * 3.14 * n * n * n) / 3;

        System.out.printf("%.2f %.2f ", luas, volume);
    }
}