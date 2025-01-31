import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		
		System.out.println("Enter the Character:");
		Scanner sree = new Scanner(System.in);
		char ch = sree.next().charAt(0); 
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
		System.out.println("The character is Vowels");
		}
		else {
		System.out.println("The character is Consonants");
		}
		

	}

}


OUTPUT:

Enter the Character:
E
The character is Vowels

Enter the Character:
D
The character is Consonants


DESCRIPTION:

This Java program takes a character input and checks whether it is a vowel or consonant.
It compares the character against both lowercase and uppercase vowels ('a', 'e', 'i', 'o', 'u'). The program outputs whether the character is a vowel or a consonant based on the input.
