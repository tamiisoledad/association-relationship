package associationrelationship;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Rocky");
		Dog anotherDog = new Dog("Firulais");
		DogOwner dogOwner = new DogOwner("Pepe", dog);
		DogWalker dogWalker = new DogWalker("Pablo");
		
		dogOwner.play();
		
		dogWalker.walkDog(dog);
		dogWalker.walkDog(anotherDog);
	}

}
