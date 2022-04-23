package sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat sima = new Cat ("Meat", "Red", 3, "Sima");
		
		Dog hunter = new Dog ("Meat", "Black", 8, "Hunter");
		
		Veterinarian alex = new Veterinarian ("Alexander");
		

		sima.eat();
		sima.sleep();
		System.out.println(sima.getVoice());
		
		hunter.eat();
		hunter.sleep();
		System.out.println(hunter.getVoice());
		
		System.out.println(alex);
		
		alex.treatment(sima);
		
	}

}
