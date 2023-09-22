import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the square size: ");
        Scanner scanner=new Scanner(System.in);
        int s=scanner.nextInt();

        for (int i = 0; i < s; i++) {
            System.out.print("%");
        }
        System.out.println("");
        for (int i = 0; i < s-2; i++) {
            System.out.print("%");
            for (int j = 0; j < s-2; j++) {
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println("");
        }
        for (int i = 0; i < s; i++) {
            System.out.print("%");
        }
    }
}