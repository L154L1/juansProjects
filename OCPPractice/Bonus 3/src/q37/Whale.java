// Q. 37  	What is the value of name after an instance of Whale is serialized and then deserialized?

// Answer : Monstro

// The key here is that Java will call the constructor for the first non-serializable no-argument parent class during deserialization, 
// skipping any constructors and default initializations for serializable classes in between, including the Whale class itself.

package q37;

import java.io.*;
import java.util.*;

class Mammal {
		protected transient String name = "Moby";
		//protected String name = "Moby";	// same result as above
		public void setName(String name) { this.name = name; }
		public String getName() { return name; }
		public Mammal() {
		this.name = "Monstro";
	}
}

public class Whale extends Mammal implements Serializable {
	{this.name="Lisa";}
	
	public Whale() {
		this.name="Roger";
	}
	
	// deserialize
	public static List<Whale> getWhales(File dataFile) throws IOException, ClassNotFoundException {
		List<Whale> whales = new ArrayList<Whale>();
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))){
			while(true) {
				Object object = in.readObject();
				if(object instanceof Whale) whales.add((Whale)object);
			}
		} catch (EOFException e) {
			// File end reached
		}
		
		return whales;

	} 
		
		// serialize
		public static void createWhalesFile(List<Whale> whales, File dataFile) throws IOException {
			try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))){
				for(Whale whale: whales) out.writeObject(whale);
			}
		}
		
		public String toString() {
			return "Whale [name="+name+"]";
		}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Whale> whales = new ArrayList<>();
		whales.add(new Whale());
		
		File dataFile = new File("C:\\temp\\whales.data");
		createWhalesFile(whales, dataFile);
		System.out.println(getWhales(dataFile));		// [Whale [name=Monstro]]

	}

}
