import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tamGiac = new Scanner(System.in);

        System.out.println("nhap canh a!");
        float a = tamGiac.nextFloat();

        System.out.println("nhap canh b!");
        float b = tamGiac.nextFloat();

        System.out.println("nhap canh c!");
        float c = tamGiac.nextFloat();

        double gocA = Math.toRadians(a);
        double gocB = Math.toRadians(b);
        double gocC = Math.toRadians(c);

        if (a + b > c || a + c > b || b + c > a) {
            if ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2) ||
                    Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2) ||
                    Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2))
            ) {

                if (
                        Math.sin(gocA) == Math.sin(gocB) ||
                                Math.sin(gocB) == Math.sin(gocC) ||
                                Math.sin(gocA) == Math.sin(gocC)
                ) {
                    System.out.println("khong chi la tam giac thuong ma con la tam giac vuong can ");

                } else
                    System.out.println("tam giac vuong");
            } else if (a==b && b==c) {
                System.out.println("la tam giac deu");


            }else if (Math.sin(gocA) == Math.sin(gocB) ||
                    Math.sin(gocB) == Math.sin(gocC) ||
                    Math.sin(gocA) == Math.sin(gocC)) {
                System.out.println("tam giac can");
            }else
                System.out.println("la tam giac thuong");
            }

        }

    }

