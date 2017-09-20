package practice;

import java.io.IOException;

public class HangManProgram {

	public static void main(String[] args) throws IOException {
		Hangman hangman = new Hangman();
		
		int result = hangman.playGame();
		
		System.out.println();
		if (result <=2)
			System.out.println("행맨이 멀쩡히 살았습니다.");
		else if (result <=3)
			System.out.println("행맨이 절름발이가 됐지만 살았다.");
		else if (result <= 4)
			System.out.println("행만의 팔다리가 잘렸지만 목숨은 부지했다.");
		else 
			System.out.println("행맨은 목 없는 귀신이 되었다.");
	}

}
