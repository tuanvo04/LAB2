package Task1;

public class Task1_1 {
//method 1
	public static int getSn1(int n) {

		if (n == 1) {
			return 1;

		} else if (n > 0) {
			int value = (n % 2 == 0) ? -1 : 1;
			return value * n + getSn1(n - 1);

		}
		return 0;

	}

// method 2
	public static int getSn2(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		}

		if (n > 0) {

			return getSn2Add(n) + getSn2(n - 1);
		}
		return 0;
	}

	public static int getSn2Add(int x) {
		if (x == 1) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}
		if (x > 0) {
			return x * getSn2Add(x - 1);
		}
		return 0;
	}

// method 3			
	public static int getSn3(int n) {

		if (n == 0) {
			return 0;
		}
		if (n > 0) {
			int value = (int) Math.pow(n, 2);
			return value + getSn3(n - 1);
		}
		return 0;

	}

// method 4		
	public static double getSn4(int n) {
		if (n < 0) {
			return 0;
		} else {

			return 1 + 1 / getSn4Add(n) + getSn4(n - 1);
		}

	}

	public static double getSn4Add(int n) {
		if (n <= 0) {
			return 1;
		} else {

			return n * 2 * getSn4Add(n - 1);
		}

	}

	public static void main(String[] args) {
		int n1 = 3;

		System.out.println(Task1_1.getSn1(n1));

		System.out.println(Task1_1.getSn2(n1));

		System.out.println(Task1_1.getSn3(n1));
		System.out.println(Task1_1.getSn4(n1));
	}
}
