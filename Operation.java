import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter a choice:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		{
		int choice = sc.nextInt();
		switch(choice)  {
		case 1: 
			System.out.println("Result:" +(num1+num2));
			break;
		case 2:
			System.out.println("Result:" +(num1-num2));
			break;
		case 3:
			System.out.println("Result:" +(num1*num2));
			break;
		case 4:
			System.out.println("Result:" +(num1/num2));
			break;
		default:
			System.out.println("Invalid choice");
		}
		}
	}
}


OUTPUT:

Enter a number:
10 
30
Enter a choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
1
Result:40


Enter a number:
35
20
Enter a choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
2
Result:15


Enter a number:
15
7
Enter a choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
3
Result:105


Enter a number:
24
4
Enter a choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
4
Result:6


Enter a number:
8
9
Enter a choice:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5
Invalid choice


DESCRIPTION:
This Java program takes two integers as input and presents a menu for performing arithmetic operations based on the user's choice. 
It uses a switch statement to execute the corresponding operation and prints the result. If an invalid choice is made, it outputs "Invalid choice".
