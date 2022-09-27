import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("hay nhap so a !");
        float a = number.nextFloat();

        System.out.println("hay nhap so b !");
        float b = number.nextFloat();

        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + a / b);
        System.out.println("a + b = " + a + b);
        System.out.println("a - b = " + (a - b));

    }
}