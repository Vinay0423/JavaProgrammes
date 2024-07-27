package Java;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	
	String s= sc.next();
	String rev="";
	
	for(int i=s.length()-1;i>=0;i--) {
		rev= rev+s.charAt(i);
	}
	
	System.out.println("the reveresd string is " +rev);
	
	if(rev==s) {
		System.out.println("it is a palindrome");
	} else {
		System.out.println("it is not a palindrome");
	}
}
}
