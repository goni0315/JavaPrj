package oop.collec.col;

import java.util.Iterator;

public class GenericList<����> implements Iterable<����>{
	private ����[] list;
	private int index;
	private int capacity;

	public GenericList() {
		list = (����[]) new Object[3];
		index = 0;
		capacity = 3;
	}

	public void add(���� exam) {

		if (index >= capacity) {
			����[] temp = (����[]) new Object[capacity + 2];
			for (int i = 0; i < list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
			capacity += 2;
		}

		list[index++] = exam;
	}

	public ���� get(int i) {

		return list[i];
	}

	public int size() {

		return index;
	}
	
	// ==============================================������ �д�
	
	class GIterator implements Iterator<����> {
		
		private int current;

		public GIterator() {
			current = -1;
		}

		public ���� next() {

			return list[current];
		}

		public boolean hasNext() {
			++current;

			return index > current;
		}
	}

	public Iterator iterator() {
		
		return new GIterator();
	}

}
