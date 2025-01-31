import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a>=90) {
			System.out.println("Grade is A");
		}
		else if(a>=80 && a<=89) {
			System.out.println("Grade is B");
		}
		else if(a>=70 && a<=79) {
			System.out.println("Grade is C");
		}
		else if(a>=60 && a<=69) {
			System.out.println("Grade is D");
		}
		else {
			System.out.println("Grade is F");
		}
	}

}


OUTPUT:

Enter the number:
95
Grade is A

Enter the number:
83
Grade is B

Enter the number:
71
Grade is C


DESCRIPTION:

This Java program assigns a grade based on a score input by the user. 
It checks the score using an if-else structure to determine whether the grade is A, B, C, D, or F. The program then outputs the corresponding grade.
