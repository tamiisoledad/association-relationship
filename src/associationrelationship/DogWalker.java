package associationrelationship;

public class DogWalker {
	private String name;
	
	public DogWalker(String name) {
		this.name = name;
	}
	
	public void walkDog(Dog dog) {
		System.out.println("Estoy paseando al perro " + dog.getName());
	}
}
