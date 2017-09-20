package oop.collec.col;

import oop.collec.Exam;

public class ExamList {
		private Exam[] exams;
		private int index;
		private int capacity;
		
	public ExamList() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;
		// TODO Auto-generated constructor stub
	}

	public void add(Exam exam) {
		
		if (index >= capacity) {
			Exam[] temp = new Exam[capacity + 2];
			for (int i = 0; i < exams.length; i++) {
				temp[i] = exams[i];
			}
			exams = temp;
		}
		
		exams[index++] = exam;
	}

	public Exam get(int i) {
		
		return exams[i];
	}

	public int size() {
		
		return index;
	}

	
	
}
