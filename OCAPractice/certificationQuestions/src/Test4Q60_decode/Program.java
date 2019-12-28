// Double does not have decode method like Integer.

package Test4Q60_decode;

class Program {

	public static void main(String[] args) {
		Double d1 = Double.decode("3.0");
		Double d2 = Double.valueOf("4.5");
		
		System.out.println(Double.compare(d1, d2));
		
		Integer i1 = Integer.decode("-1");
		Integer i2 = Integer.valueOf("3");
		System.out.println(Integer.compare(i1, i2));

	}

}
