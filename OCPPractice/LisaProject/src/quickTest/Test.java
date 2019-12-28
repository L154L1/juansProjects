package quickTest;

import java.nio.file.Path;
import java.nio.file.Paths;


class Sup{
	
	String walk = "walk";
	void test1() {}
	
	static void test2() {}
}
public class Test extends Sup {
	

	
	static int i;
	int j;
	
	Test(){}
	Test(int a, int b){
		
		i = a;
		j = b;
	}
	
	{
		i = 10;
		j = 9;
	}
	
	void doit() { test1(); test2();}
	
	static void doitagain() { new Test().test1(); test2();}

	public static void main(String[] args) {
		Path ip = Paths.get("C:/", "First.txt");
		
		//Path ip = Paths.get("/First.txt");
		
		System.out.println(ip);

	}

}


final class Program{
	final private String name;
	
	//final static String name2;	// final static variable must be initialized.
//	static {
//		name2 = "";
//	}
	
	Program(String name){
		this.name = name;
		getName();
	}
	
	//public String getName(String value) {  name = value; return value; }
	public String getName() {  return name + "a"; }
}
