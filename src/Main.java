import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the preferred length of the password ");
        int length = scanner.nextInt();

        System.out.println("Do you want capital letters ");
        boolean useUpperCase= scanner.nextBoolean();

        System.out.println("Do you want small letters ");
        boolean useLowerCase = scanner.nextBoolean();

        System.out.println("Do you want numbers ");
        boolean useNumbers = scanner.nextBoolean();

        String password = Generator.password(length, useUpperCase, useLowerCase, useNumbers);
        System.out.println("Generated Password: " + password);


    }
}