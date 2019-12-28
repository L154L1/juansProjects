//What is the result?
//A. The Engine.java file fails to compile.
//B. The EngineOperator.java file fails to compile.
//C. The Operator.java file fails to compile.
//D. ON OFF

//Answer: C

package q10_abstract_class;

// Operator.java
abstract class Operator{
	protected void turnON();
	protected void turnOFF();
	
}

// EngineOperator.java
class EngineOperator extends Operator {
	public final void turnON() {System.out.print("ON ");}
	public final void turnOFF() {System.out.print("OFF");}
}

// Engine.java
class Engine{
	Operator m = new EngineOperator();
	public void operate() {
		m.turnON();
		m.turnOFF();
	}
}

public class Test {

	public static void main(String[] args) {
		Engine carEngine = new Engine();
		carEngine.operate();
	}

}
