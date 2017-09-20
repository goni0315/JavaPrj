package practice;

public class Euler {

	int max;

	public Euler(int max) {
		this.max = max;
	}

	public int sumOf3And5() {
		int sum = 0;
		for (int i = 0; i < max + 1; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(new Euler(6).sumOf3And5());

	}
}
