package test;
import java.util.*;
abstract class Writer {
	 public static void write() {
	 System.out.println("Writing...");
	 }
	}
class Author extends Writer {
	 public static void write() {
	 System.out.println("Writing book");
	 }
	}
	public class Programmer extends Writer {
	 public static void write() {
	 System.out.println("Writing code");
	 }
	 public static void main(String[] args) {
		 StringBuilder s1 = new StringBuilder("Hello Java!");
		 String s2= s1.toString();
		 List<String> lst = new ArrayList<String>();
		 lst.add(s2);
		 System.out.println(s1.getClass());
		 System.out.println(s2.getClass());
		 System.out.println(lst.getClass());
		 
		 byte i = -128;
	 }
	}