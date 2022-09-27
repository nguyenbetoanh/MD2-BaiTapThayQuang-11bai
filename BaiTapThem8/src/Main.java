//. Nhập vào một số gồm 3 chữ số. In ra số đảo ngược

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner dao = new Scanner(System.in);

        System.out.println("mhap so chuoi ban muon!");
        int inputNumber = Integer.parseInt(dao.nextLine());
         int a=inputNumber/100;
        int b=inputNumber%100;
        int c=b/10;
        int d=b%10;
        System.out.println("dao nguoc chuoi thanh : "+d+c+a);
    }
}