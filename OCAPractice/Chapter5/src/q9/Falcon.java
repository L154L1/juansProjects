package q9;

interface CanFly {
	void fly();
}

interface HasWings {
	public abstract Object getWingSpan();
}

abstract class Falcon implements CanFly, HasWings {}
