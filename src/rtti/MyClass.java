package rtti;

public class MyClass {
	
	public void ccc() {
		System.out.println("dd");
	}
	
	@Print(enable=false)
	public void bbb(){
		System.out.println("hello");
	}
	
	@Print
	public void aaa(){
		System.out.println("exam.total()");
	}
}
