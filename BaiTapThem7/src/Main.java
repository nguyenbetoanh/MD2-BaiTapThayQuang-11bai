//Nhập vào một số 0-9, phiên âm số vừa nhập
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("nhap so ban can phiern dich tu 0 den 9 !");
        int inputNumber = number.nextInt();

        switch (inputNumber){
            case 1:
                System.out.println("so mot");
                break;
            case 2:
                System.out.println("so hai");
                break;
            case 3:
                System.out.println("so ba");
                break;
            case 4:
                System.out.println("so bon");
                break;
            case 5:
                System.out.println("so nam");
                break;
            case 6:
                System.out.println("so sau");
                break;
            case 7:
                System.out.println("so bay");
                break;
            case 8:
                System.out.println("so tam");
                break;
            case 9:
                System.out.println("so chin");
                break;

        }
    }
}