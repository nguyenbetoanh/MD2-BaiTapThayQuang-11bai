import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("nhap ma hoc sinh!");
        String student = input.nextLine();

        System.out.println("nhap ten hoc sinh!");
        String studentName = input.nextLine();

        System.out.println("nhap tuoi hoc sinh!");
        int studentAge = Integer.parseInt(input.nextLine());

        System.out.println("nhap gioi tinh hoc sinh!");
        String studentMale = input.nextLine();

        System.out.println("nhap email hoc sinh!");
        String studentEmail = input.nextLine();

        System.out.println("nhap phone hoc sinh!");
        int studentPhone = Integer.parseInt(input.nextLine());

        System.out.println("nhap dia chi hoc sinh!");
        String studentAdress = input.nextLine();

        System.out.printf("%1s %10s %20d %1s %1s %15d","Student ID: ",student,"StudenName: ",studentName,"StudentAge: ",studentAge);
        System.out.printf("%1s %10s %15d %s1 %1s %15d","Student Male: ",studentMale,"Student Email: ",studentEmail,"Student phone: ",studentPhone);
        System.out.println("Address :"+studentAdress);
    }
}