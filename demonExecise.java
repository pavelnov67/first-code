import java.util.Scanner;

public class demonExecise {
    public static void main(String[] args) {

        System.out.println("hello let`s go");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a:");

        double number_a = sc.nextInt();

        System.out.println("Вы ввели a= " + number_a);

        System.out.println("Введите b:");
        double number_b = sc.nextInt();
        System.out.println("Вы ввели b= " + number_b);

        System.out.println("Введите c:");
        double number_c = sc.nextInt();
        System.out.println("Вы ввели c= " + number_c);

        double a = number_a;
        double b = number_b;
        double c = number_c;

        double min = Math.min(Math.min(number_a, number_b), Math.min(number_c, number_a));
            System.out.println("min= " + min);

        double max = Math.max(Math.max(number_a, number_b), Math.max(number_c, number_a));
            System.out.println("max= " + max);

        if (number_a > min && number_a < max) {
            System.out.println("midl= " + number_a);
        }
        else if (number_b > min && number_b < max) {
            System.out.println("midl= " + number_b);
        }
        else if (number_c > min && number_c < max) {
            System.out.println("midl= " + number_c);
        }
        }
    }
