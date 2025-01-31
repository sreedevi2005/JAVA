import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		if(a>50) {
			System.out.println("The number is above 50");
		}
		else if (a>=40 && a<=50) {
			System.out.println("The number is between 40 to 50");
		}
		else {
			System.out.println("The number is less than 40 ");
		}

	}

}


OUTPUT:

Enter a number:
65
The number is above 50

Enter a number:
46
The number is between 40 to 50

Enter a number:
23
The number is less than 40 


DESCRIPTION:

This Java program takes an integer input and checks its value using an if-else structure. 
It prints whether the number is above 50, between 40 and 50, or less than 40. The program outputs the corresponding message based on the input number.
