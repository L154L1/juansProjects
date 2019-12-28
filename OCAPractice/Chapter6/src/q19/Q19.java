package q19;
import java.io.*;
public class Q19 {
	void test1(){
		try{
			System.out.println("work real hard");
		} catch(Exception e) {			
		} catch (RuntimeException e){
		}
	}
	
	void test2(){
		try{
			System.out.println("work real hard");
//			throw new IOException();
		} catch(IOException e) {			
		} catch (RuntimeException e){
		}
	}
	
	void test3(){
		try{
			System.out.println("work real hard");
		} catch(IllegalArgumentException e) {			
		} catch (RuntimeException e){
		}
	}
	
	void test4(){
		try{
			System.out.println("work real hard");
		} catch(StackOverflowError e) {			
		} catch (RuntimeException e){
		}
	}

}
