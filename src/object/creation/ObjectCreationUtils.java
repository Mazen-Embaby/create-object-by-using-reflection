package object.creation;

import java.lang.reflect.Constructor;

// create an object dynamically using reflection on the fly
public class ObjectCreationUtils {

	public static <T> T createObject (Class <T> clazz, Object... constructorArgs) throws Exception {
		// get all the constructor of the class
		Constructor <?> [] constructors = clazz.getDeclaredConstructors();
		
		// find the constructor with matching parameter count
		Constructor<?> matchingConstructor = null;
		for (Constructor<?> constructor: constructors) {
			if (constructor.getParameterCount() == constructorArgs.length) {
				matchingConstructor = constructor;
				break;
			}
		}
		
		if (matchingConstructor == null) {
			throw new NoSuchMethodException("No constructor with "+ constructorArgs.length + "params found." );
		}
		
		matchingConstructor.setAccessible(true);
		
		// create an instance of the class using the matching constructor
		return clazz.cast(matchingConstructor.newInstance(constructorArgs));
	}
}
