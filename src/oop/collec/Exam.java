package oop.collec;

public class Exam {
	
	private int kor;
	private int eng;
	private int soc;
	
	

/*	public Exam() {
		this(0, 0, 0);
	}

	public Exam(int kor, int eng, int soc) {
		this.kor = kor;
		this.eng = eng;
		this.soc = soc;
	}*/
	public Exam() {
		this(0, 0, 0);
		
	}
	

	
	

	public Exam(int kor, int eng, int soc) {
	super();
	this.kor = kor;
	this.eng = eng;
	this.soc = soc;
}





	public double avg() {

		return total() / 3.0;
	}

	public double total() {

		return kor + eng + soc;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getSoc() {
		return soc;
	}

	public void setSoc(int soc) {
		this.soc = soc;
	}
	
	
}
