import java.util.Scanner;
public class A1091106_0421_2 {
    public static void main(String[] args) {
        System.out.println("Please enter in the form of MM/DD/YYYY(2023/04/21) or YYYY/MM/DD");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        boolean dateTest = date.matches("^\\d{4}/[0-1][0-9]/[0-3][0-9]$");
        boolean dateTest2 = date.matches("^[0-1][0-9]/[0-3][0-9]/\\d{4}$");
        if (!dateTest && !dateTest2) {
            System.out.println("Please enter in the form of MM/DD/YYYY or YYYY/MM/DD");
        }else {
            System.out.println("User input is: "+date);
        }
    }
}