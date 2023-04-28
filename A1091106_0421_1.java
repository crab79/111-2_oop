import java.util.Scanner;
public class A1091106_0421_1 {
    public static void main(String[] args) {
        System.out.println("Please enter your gmail.");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();
        boolean emailTest = email.matches("^(.+)@(.+)$");
        System.out.println(emailTest);
    }
}