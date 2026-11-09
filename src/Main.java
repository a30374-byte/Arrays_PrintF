import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.printf("Hello and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        String strCad = sc.nextLine();

        System.out.println(strCad);

        System.out.printf("Hello %-10s! %55S%n", "world", "Que pasa Manolo");
        System.out.printf("%08.2f%n", 5.1473);
        System.out.printf("%5.2f%n", 15.1473);
        System.out.printf("%5.2f%n", 8.1473);
    }
}