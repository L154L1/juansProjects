package quickTest;

public class Test3 {

	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
//			static {
//				System.out.println("initial");
//			}
			
			int i;
			static int j = 0;
			static final int k = 0;
			
			@Override
			public void run(){
				System.out.println("start");
			}
			
		});
		
		th.start();

	}

}
