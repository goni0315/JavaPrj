package seat;

import java.util.Random;

public class ShuffleSeat {
	public static void main(String[] args) {
		Random rand = new Random();
		double n =  rand.nextDouble();
		String[][] names = {{"�����",""}, {"������",""}, {"����",""}, {"������",""},{"������",""}, {"������",""}};
		System.out.println(names.hashCode());
	}
	
}
