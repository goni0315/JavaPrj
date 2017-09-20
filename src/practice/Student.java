package practice;

public class Student {
	private String name;
	private String nation;
	private int age;
	private int num;
	
	
	
	public Student() {
		this("차행주","아프리카", 20,01012341234);
	}
	
	public Student(String name, String nation, int age, int num) {
		this.name = name;
		this.nation = nation;
		this.age = age;
		this.num = num;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
