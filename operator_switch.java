import java.util.Scanner;

public class operator_switch {
    public static void main(String[] args) {
        System.out.println("hello let`s go");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите case: ");
        int yorCase = sc.nextInt();

        if (yorCase > 4) {
            System.out.println("number must be 1-4");
            System.out.println("Введите case: ");
        }
        int i = sc.nextInt();
        if (i <=4) {
            System.out.println("your number is " + i);

        }

        }
}
