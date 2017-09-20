package structured.data;

import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) {

		Lotto[] lottos = new Lotto[6];

		gen(lottos);

		print(lottos);

		sort(lottos);

		print(lottos);

	}

	private static void gen(Lotto[] lottos) { // 1. �ζ� ��ȣ ����
		Random rand = new Random();

		for (int i = 0; i < 6; i++) {
			Lotto lotto = new Lotto();
			lotto.x = rand.nextInt(45) + 1;
			lottos[i] = lotto;
		}

		for (int i = 0; i < 6; i++) { // 2. �ζǹ�ȣ �ߺ�����
			for (int j = 0; j < i; j++)
				if (lottos[j].x == lottos[i].x) {
					Lotto lotto = new Lotto();
					lotto.x = rand.nextInt(45) + 1;
					lottos[i] = lotto;
					i--;
					break;
				}
		}
	}

	private static void print(Lotto[] lottos) { // 3. �ζǹ�ȣ ���

		for (int i = 0; i < 6; i++)
			System.out.print(lottos[i].x + " ");
		System.out.println();
	}

	private static void sort(Lotto[] lottos) {  // 4. �ζǹ�ȣ ����
		for (int a = 0; a < 5; a++)
			for (int i = 0; i < 5 - a; i++) {
				int temp;
				if (lottos[i].x > lottos[i + 1].x) {
					temp = lottos[i].x;
					lottos[i].x = lottos[i + 1].x;
					lottos[i + 1].x = temp;
				}
			}
	}

}
