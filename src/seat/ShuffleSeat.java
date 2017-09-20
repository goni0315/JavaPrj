package seat;

import java.util.Random;

public class ShuffleSeat {
	public static void main(String[] args) {
		Random rand = new Random();
		double n =  rand.nextDouble();
		String[][] names = {{"차명건",""}, {"개나리",""}, {"목대승",""}, {"차형주",""},{"백지원",""}, {"이종혁",""}};
		System.out.println(names.hashCode());
	}
	
}
