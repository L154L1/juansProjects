//when overriding method in a subclass, the subclass is only allowed to declare fewer checked exceptions than the superclass or interface. 
//This rule applies only to checked exceptions. Methods are free to declare new runtime exceptions in a subclass. 
//The reason is the declaration is redundant because methods are free to throw any runtime exceptions without mentioning them in the method declaration.

package p320_subclasses_exceptions;

class CanNotHopException extends Exception {}

class Hopper1 {
	void hop() {}
}
class Bunny1 extends Hopper1 {
	void hop() throws CanNotHopException {} 
}

class Hopper2 {
	void hop() throws CanNotHopException {}
}
class Bunny2 extends Hopper2 {
	void hop() {} 
}

class Hopper3 {
	void hop() throws Exception {}
}
class Bunny3 extends Hopper3 {
	void hop() throws CanNotHopException {} 
}

class Hopper4 {
	void hop() {}
}
class Bunny4 extends Hopper4 {
	void hop() throws IllegalStateException {} // Methods are free to declare new runtime exceptions in a subclass.
}

