package q12;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class AhChoo {
static class SneezeException extends Exception { }
static class SniffleException extends SneezeException { }
public static void main(String[] args) throws SneezeException {
try {
throw new SneezeException();
} catch (SneezeException e) {
	//e = new RuntimeException();		// doesn't compile, type mismatch
	//e = new SneezeException();	// works
	e = new SniffleException();
throw e;
} } }
