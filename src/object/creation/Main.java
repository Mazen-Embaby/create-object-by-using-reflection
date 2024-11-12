package object.creation;

public class Main {

	public static void main(String[] args) {

		try {
			TestClass myObject = ObjectCreationUtils.createObject(TestClass.class, 20);
			System.out.println("call the addNumber method " + myObject.addNumber(20));
		}
		catch (Exception ex) {
			
		}
	}

}
