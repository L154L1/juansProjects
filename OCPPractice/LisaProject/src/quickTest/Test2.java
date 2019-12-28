package quickTest;

public class Test2 {
	public static<T> int count(T[] array, T elem) {
		int count = 0;
		for(T e : array)
			if(e.compareTo(elem)>0) ++count;
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
