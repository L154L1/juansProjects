// When class is not generic and method wants to be generic, 
// Generic formal type is specified immediately before the return type of the method.

package p114_generic_methods;

public class Create<T> {

}

class Test{
	public static <T> Create<T> ship(T t){
		return new Create<T>();
	}
	
	public static <T> void sink(T t) {}
	
	public static <T> T identity(T t) { return t; }
	
	public static T noGood(T t) { return t; }  // does not compile
	
	
	public <T> T getValue(T t) {
		return t;
	}
}