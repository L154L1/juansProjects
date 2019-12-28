// You cannot use default methods to override any of the methods in java.lang.Object class.

package Test2Q67_default_method;

interface A {
	int groupID = 10;
	default boolean equals(Object obj){
		return this.groupID == ((A)obj).groupID;
	}
	
	static void print(){
		System.out.print("A");
	}

}
