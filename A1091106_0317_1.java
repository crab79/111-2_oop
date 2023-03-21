import java.util.Scanner;
public class A1091106_0317_1 {
    public static void main(String[] args) {
        int n, m;
        do{
            System.out.println("Please enter a positive integer--N.");
            Scanner input1 = new Scanner(System.in);
            n = input1.nextInt();
        }while (n <= 0);
        do{
            System.out.println("Please enter another positive integer--M.");
            Scanner input2 = new Scanner(System.in);
            m = input2.nextInt();
        }while(m <= 0);

        int [][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (i+1)*(j+1);
            }
        }

        System.out.println("Your array output (N*M):");
        for (int[] first : array) {
            for (int second : first) {
                System.out.print(second + "\t");
            }
            System.out.print("\n");
        }
    }
}