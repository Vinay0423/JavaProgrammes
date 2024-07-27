package Java;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the your number below");
	int num=sc.nextInt();
	int sum=0;
	int copy=num;
	
	while(num>0) {
		int rem= num%10;
		sum+=rem*rem*rem;
		num=num/10;
	}
	System.out.println(sum);
	
	
	if(sum==copy) {
		System.out.println("it is a armstrong number");
	} else {
		System.out.println("it is not a armstrong number");
	}
	
	sc.close();
}
}
