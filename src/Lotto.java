import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// 
		Random rand = new Random();
		int lottoNums[] = new int[45];
		int a = 1;
		int key = 0;
		int temp;
		
		for(int i=0; i<45; i++) {
			lottoNums[i] = a;
			a++;
		}
		
		
		for(int i=0; i<lottoNums.length; i++) {
		
			key = rand.nextInt(45);
			temp = lottoNums[i];
			lottoNums[i] = lottoNums[key];
			lottoNums[key] = temp;
		}
		
		for(int i=0; i<6; i++) {
			System.out.printf("%d|", lottoNums[i]);
		}
	}

}
