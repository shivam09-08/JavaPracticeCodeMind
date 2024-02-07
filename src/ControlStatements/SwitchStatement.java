package ControlStatements;
import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		System.out.println("Please enter a character ");
		Scanner sc =new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		char c =Character.toUpperCase(ch);
		
		switch(c)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		System.out.println(ch + " " +"is a vowel");
		break;
		default:
		System.out.println(ch +  " " + "is  a consonant");
		}
		
		
	}

}
