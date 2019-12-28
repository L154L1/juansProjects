package Test4Q32;

class Program {

	public static void main(String[] args) {
		Loop1:for(int x = 0; x<3; x++){
			for(int y = 0; y<3; y++){
				if(y==2) continue;
				if(y==2 && x==2)break Loop1;	// will never be reached but does not cause compilation error.
				System.out.print(y);
			}
		}

	}

}

//010101