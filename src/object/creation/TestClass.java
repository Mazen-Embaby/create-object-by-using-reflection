package object.creation;

public class TestClass {

	int age;
	TestClass (int age) {
		this.age = age;
		System.out.println("The entered age is " + age);
	}
	
	
	public int addNumber(int num) {
		return this.age+ num;
	} 
}
