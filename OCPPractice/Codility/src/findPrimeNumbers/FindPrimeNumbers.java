package findPrimeNumbers;

public class FindPrimeNumbers {

	public static void main(String[] args) {
		
		for(int i=0; i<=100; i++) {			
			 int m=0, flag=0;      
			 m=i/2; 
			 
			 if(i==0 || i==1) {  
			   //System.out.println(i+" is not prime number");      
			 } else {  
				 for(int j=2; j<=m; j++) {      
					 if(i%j == 0) {      
						 //System.out.println(i+" is not prime number");      
						 flag=1;      
						 break;      
					 }      
				 }  
				 
				 if(flag == 0)  { System.out.println(i+" is prime number"); }  
			 }  
			
		}

	}

}
