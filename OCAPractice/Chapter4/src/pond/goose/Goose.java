package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {
	public void helpGooseSwim() {
		Goose other = new Goose();
		other.floatInWater();
		System.out.println(other.text);
	}
	
	public void helpOtherGooseSwim() {
		Bird other = new Goose();	// Bird is in different package than Goose and not subclass of Goose. 
									// so the protected members in Bird are not visible here.
		other.floatInWater();
		System.out.println(other.text);
	}
}
