//user input using java util;
import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();


        System.out.println("Hello my name is"+ " " + name + " " + "and I am," + age + " " + "years of age.");

        scanner.close();

    }
}
