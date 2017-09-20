package structured.data;

import java.util.Random;

public class LottoProgram2 {

	public static void main(String[] args) {

		Lotto2 lotto = new Lotto2();

		gen(lotto); //����

		print(lotto); //���

		sort(lotto);	// ����

		print(lotto);	//�ٽ� ���

	}

	private static void gen(Lotto2 lotto) { 
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {	
			lotto.x[i] = rand.nextInt(45) + 1;  // 1. �ζ� ��ȣ ����
			for (int j = 0; j < i; j++)
				if (lotto.x[j] == lotto.x[i]) {  //2. �ߺ� ����
					lotto.x[i] = rand.nextInt(45) + 1;
					i--;
					break;
				}
		}
	}

	private static void print(Lotto2 lotto) { // 3. �ζǹ�ȣ ���

		for (int i = 0; i < 6; i++)
			System.out.print(lotto.x[i] + " ");
		System.out.println();
	}

	private static void sort(Lotto2 lotto) { // 4. �ζǹ�ȣ ����
		for (int a = 0; a < 5; a++)
			for (int i = 0; i < 5 - a; i++) {
				int temp;
				if (lotto.x[i] > lotto.x[i + 1]) {
					temp = lotto.x[i];
					lotto.x[i] = lotto.x[i + 1];
					lotto.x[i + 1] = temp;
				}
			}
	}

}
