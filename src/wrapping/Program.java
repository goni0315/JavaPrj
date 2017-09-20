package wrapping;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		int a = "Hello".length();
		int i = new String("dosen't work").length();
		String s = "abc" + "j";
		System.out.println(s);
		String n = "try";
		// String str = Integer.toString(n);
		String str = String.valueOf(n);
		double d = 3.4;

		//double b = Double.parseDouble(str);
		//int k = Integer.parseInt(n);
		String name1 = "ak-47";

		String name2 = "ak-47";
		System.out.println(name1.equals(name2)); // r

		String mk = "hello.avi";
		System.out.println(mk.length());
		System.out.println(mk.indexOf("."));
		System.out.println(mk.substring(0, mk.indexOf(".")));
		
		ArrayList<String> student = new ArrayList<String>();
		student.add(0, "차명건");
		
		String love = "차명건, 목대승, 백지원, 개나리";
		
		String[] names = love.split(",");
		
		for(int p = 0; p<names.length; p++)
			System.out.println(names[p]);
	}

}
