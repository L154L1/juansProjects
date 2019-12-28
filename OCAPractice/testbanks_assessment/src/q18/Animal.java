package q18;

public interface Animal { public default String getName() { return null; } }
interface Mammal { public default String getName() { return null; } }

abstract class Otter implements Mammal, Animal {abstract public String getName();}

abstract class Otter2 implements Mammal, Animal {public String getName(){return "otter";}}

abstract class Otter implements Mammal, Animal {}
