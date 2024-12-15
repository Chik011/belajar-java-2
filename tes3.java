import java.util.Scanner;

class tes3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int p = c.nextInt();
        int a = c.nextInt();
        int b = c.nextInt();

        double total = (0.25 * p) + (0.35 * a) + (0.4 * b);
        if (total >= 75)
            System.out.println("true");
        else
            System.out.println("false");
    }
}