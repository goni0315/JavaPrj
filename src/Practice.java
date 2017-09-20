import java.util.Scanner;

class Practice {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int max = 0;
		int[] scores = null; 
		int i = scan.nextInt();
		scores = new int[i];
		for (int j = 0; j < i; j++) {
			System.out.print("nums[" + j + "]  : ");
			scores[j] = scan.nextInt();
		}
		
		for (int score : scores) {
			if (score > max)
				max = score;
		}
		
		System.out.println("ÃÖ´ñ°ª : "+max);
		scan.close();
	}
}
