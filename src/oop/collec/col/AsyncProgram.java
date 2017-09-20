package oop.collec.col;


public class AsyncProgram {

	public static void main(String[] args) {

		GenericList<Integer> list = new GenericList<Integer>();

		for (int i = 0; i < 123; i++)
			list.add(i + 1);
		
		/*
		 * Thread th1 = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { download(list , 1)
		 * 
		 * } });
		 */

		new Thread(() -> {

			download(list, 1);

		}).start();

		download(list, 2);

		System.out.println("프로그램 종료");

	}

	private static void download(GenericList<Integer> list, int num) {
		/*
		 * for (int i = 0; i < list.; i++) System.out.printf("%d : %d%%\n", num,
		 * list.get(i));
		 */
		//Iterator iter = list.iterator();
		
		for(Integer n : list)
			System.out.printf("%d : %d%%\n", num, n);
		/*while (iter.hasNext())
			System.out.printf("%d : %d%%\n", num, iter.next());*/

	}

}
