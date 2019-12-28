//p427 Attempting to serialize an object will throw a NotSerializableException if the class or one of its contained classes does not properly implement the Serializable interface. 
//You can use transient keyword on the reference to the object, which will instruct the serializing process to skip it and avoid throwing NotSerializableException. 
//The only limitation is that the data stored in the object will be lost during the serialization process.(The instance variable will just use default values after serialization.)
//Besides transient instance variables, static class members will also be ignored(values kept) during serialization and deserialization process, which makes sense as static class variables do not belong to on particular instance. 
//p431 When you deserialize an object, the constructor of the serialized class and default initializations (initialization blocks) are ignored.

package p431_understand_serialization_deserialization;

import java.io.*;
import java.util.*;

public class ObjectStreamSample {
	
	// deserialize
	public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<Animal>();
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))){
			while(true) {
				Object object = in.readObject();
				if(object instanceof Animal) animals.add((Animal)object);
			}
		} catch (EOFException e) {
			// File end reached
		}
		
		return animals;
	} 
	
	// serialize
	public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException {
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))){
			for(Animal animal: animals) out.writeObject(animal);
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Tommy Tiger", 5, 'T'));
		animals.add(new Animal("Peter Penguin", 8, 'P'));
		
		File dataFile = new File("C:\\temp\\animal.data");
		createAnimalsFile(animals, dataFile);
		System.out.println(getAnimals(dataFile));	// [Animal [name=null, age=0, type=P], Animal [name=null, age=0, type=P]]
		
		
	}

}
