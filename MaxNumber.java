public class MaximumNumber {

	public static void main(String[] args) {
		
		int a=10, b=20, c=25,max;
		max = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Maximum number among " +a+ ", " +b+ " and " +c+ " is "  + max);

	}

}


OUTPUT:

Maximum number among 10, 20 and 25 is 25


DESCRIPTION:

This Java program compares three integers (a, b, c) to find the maximum value using a ternary operator.
It checks if `a` is greater than both `b` and `c`, then if `b` is greater than `c`. The program outputs the maximum number among the three.
