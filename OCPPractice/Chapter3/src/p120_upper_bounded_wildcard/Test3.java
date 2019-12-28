// ? extends type - type can be interface as well as class

package p120_upper_bounded_wildcard;

import java.util.*;

interface Flyer{ void fly(); }
class HangGlider implements Flyer { public void fly() {} }
class Goose implements Flyer { public void fly() {} }

public class Test3 {
	private void anyFlyer(List<Flyer> flyers) {}

	private void groupOfFlyers(List<? extends Flyer> flyers) {}

}
