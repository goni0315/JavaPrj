package practice;

import java.io.IOException;

public class HangManProgram {

	public static void main(String[] args) throws IOException {
		Hangman hangman = new Hangman();
		
		int result = hangman.playGame();
		
		System.out.println();
		if (result <=2)
			System.out.println("����� ������ ��ҽ��ϴ�.");
		else if (result <=3)
			System.out.println("����� �������̰� ������ ��Ҵ�.");
		else if (result <= 4)
			System.out.println("�ุ�� �ȴٸ��� �߷����� ����� �����ߴ�.");
		else 
			System.out.println("����� �� ���� �ͽ��� �Ǿ���.");
	}

}
