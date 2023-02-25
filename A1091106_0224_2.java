import java.util.Scanner;
public class A1091106_0224_2 {
    public static void main(String[] args) {
	double f, c;
	System.out.println("Now the temperature is ??°C.");
	Scanner myInput1 = new Scanner(System.in);
	c = myInput1.nextInt();
	/*
	boolean isNumeric = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isNumeric = false;
            }
        }
	
	while(isNumeric == 0) {
	    System.out.println("Please enter a number.");
	    myInput1 = new Scanner(System.in);
	    str = myInput1.nextInt();
	}
	*/
	f = 1.8*c + 32;
	System.out.println("It's also " + f +"°F.");
 	
    }	
}