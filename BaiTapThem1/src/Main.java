import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dt= new Scanner(System.in);

        System.out.println("Nhaap canh a !");
        int hinhv= dt.nextInt();

        int dthv=hinhv*hinhv;
        int cvhv =hinhv*4;
        System.out.println("Dien tich hinh vuong la "+ dthv);
        System.out.println("chu vi hinh vuong la "+ cvhv);
    }
}