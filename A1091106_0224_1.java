import java.util.Scanner;
public class A1091106_0224_1{
    public static void main(String[] args) {
	int a;
	System.out.println("Please input an integer.");
	Scanner myInput1 = new Scanner(System.in);
	a = myInput1.nextInt();

	while(a <= 1) {
	    System.out.println("Please enter a number bigger than one.");
	    myInput1 = new Scanner(System.in);
	    a = myInput1.nextInt();
	}

 	if(a % 2 == 0) {
            System.out.println("\n");
	    System.out.println(a + " is an even number.");
	}else {
	    System.out.println("\n");
	    System.out.println(a + " is an odd number.");
	}
    }	
}