import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner hcn = new Scanner(System.in);

        System.out.println("hay nhap canh a!");
        double a =hcn.nextDouble();

        System.out.println("hay nhap canh b!");
        double b =hcn.nextDouble();

        System.out.println("chu vi hcn la :"+(a*b)/2);
        System.out.println("dien tich  hcn la :"+(a+b)*2);
    }
}