package p269_interface_extends_interfaces;

interface HasTail {
	public int getTailLength();
}

interface HasWhiskers {
	public int getNumberOfWhiskers();
}
public interface Seal extends HasTail, HasWhiskers {
}
