package Java;

public class Star3 {
	public static void main(String[] args) {

		int space = 3;
		int star = 1;
		for (int i = 1; i < 5; i++) {

			for (int j = 1; j <= space; j++) {
				System.err.print(" ");
			}

			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}

			System.out.println();
			space--;
			star++;
		}
	}
}
