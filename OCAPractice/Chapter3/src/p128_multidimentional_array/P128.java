package p128_multidimentional_array;

public class P128 {

	public static void main(String[] args) {
		int[][] twoD = new int[3][2];
		
		for(int i = 0; i < twoD.length; i++){
			for(int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Using enhanced for loop :");
		for(int[] inner : twoD){
			for (int num : inner) 
				System.out.print(num + " ");
			System.out.println();
		}
	}

}
