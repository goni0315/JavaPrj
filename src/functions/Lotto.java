package functions;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] nums = new int[6];

		genLotto(nums);

		printLotto(nums);

		sortLotto(nums);

		printLotto(nums);


	}

	private static void sortLotto(int[] nums) {
		for (int a = 0; a < 5; a++)
			for (int i = 0; i < 5 - a; i++) {
				int temp;
				if (nums[i] > nums[i + 1]) {
					temp = nums[i];
					nums[i] = nums[i + 1];
					nums[i + 1] = temp;
				}
			}
	}

	private static void printLotto(int[] nums) {
		// 로또번호 출력
		for (int i = 0; i < 6; i++)
			System.out.printf("%d ", nums[i]);
		System.out.println();
	}

	private static void genLotto(int[] nums) {
		Random rand = new Random();
		for (int i = 0; i < 6; i++)
			nums[i] = rand.nextInt(45) + 1;

		// 로또번호 중복제거
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++)
				if (nums[j] == nums[i]) {
					nums[i] = rand.nextInt(45) + 1;
					i--;
					break;
				}
		}
	}

}
