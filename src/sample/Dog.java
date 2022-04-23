package sample;

public class Dog extends Animal {
	
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name +" like to eat meat");
	}
	
	public void sleep() {
		System.out.println(name +" like to sleep at night");
	}
	
	public String getVoice() {
		return name +" say WOOF WOOF";
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
	
	
	
}
