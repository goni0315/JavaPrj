package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		toBinary(i);
	}

	private static void toBinary(int i) {
		ArrayList<Integer> list = new ArrayList<>();
		int mok = 0;
		do {
			mok = i / 2;
			Integer last = i%2;
			list.add(last);
			i = mok;
		} while (mok != 0);
		
		
		for(int j = list.size()-1; j>=0; j--)
			System.out.print(list.get(j));
	}
}
