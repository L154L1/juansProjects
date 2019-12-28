package p256_final_method;

class Bird {
	public final boolean hasFeathers() {
		return true;
	}
}

class Penguin extends Bird {
	public final boolean hasFeathers() {
		return false;
	}
}
