package Test1Q65;

class OCAJP {

	public static void main(String[] args) {
		L1:for(int x=5, y=0; x>0; x--) {
			L2:for(;y<5;y++) {				// after one iteration, y becomes 5 so L1 can only execute L2 once.
				System.out.print(x+""+y+" ");
				if(x==0)
					continue L1;
			}			
		}
	}
}
