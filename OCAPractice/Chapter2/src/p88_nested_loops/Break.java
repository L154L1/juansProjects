package p88_nested_loops;

public class Break {

	public static void main(String[] args) {
		int[][] list = {{1,3,5}, {1,2,5}, {2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i = 0; i < list.length; i++){
			for(int j = 0; j < list[i].length; j++){
				if(list[i][j] == searchValue) {
					positionX = i;
					positionY = j;
					//break PARENT_LOOP;		// Value 2 found at: (1,1)		- find the first match
					//break;					// Value 2 found at: (2,0)
					// without break statement	// Value 2 found at: (2,2)	- find the last match
				}				
			}
		}
		if(positionX==-1 || positionY==-1){
			System.out.println("Value " + searchValue + " not found");
		}else{
			System.out.println("Value " + searchValue + " found at: " + "(" + positionX + "," + positionY + ")");
		}
	}

}
