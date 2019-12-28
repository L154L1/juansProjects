package q21;

public class Salmon {
	int count;
	public void Salmon(){	// This is not constructor.
		count = 4;
	}
	
//	public Salmon(){		// This is constructor.
//		count = 4;
//	}
	
	public static void main(String[] args) {
		Salmon s = new Salmon();
		System.out.println(s.count);	// 0
	}
}
