package Java;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean flag=true;
		int num=26;
		
		for(int i=2;i<num/2;i++) {
			if(num%2==0) {
				flag=false;
			}
		}
		
		if(flag==true) {
			System.out.println("the number is prime number");
		} else {
			System.out.println("the number is not prime number");
		}
	}
}
