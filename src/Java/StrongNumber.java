package Java;

public class StrongNumber {

	public static void main(String[] args) {

		int num = 145;
		int copy = num;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			int factNum = rem;
			int fact = 1;

			System.out.println(factNum);
			fact=factorial(factNum);
			sum += fact;
			num = num / 10;
		}

		System.out.println(sum);
	}

	static int factorial(int num) {
		int fact=1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}
}
