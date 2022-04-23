package sample;

public class Cat extends Animal {
	
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat() {
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
		System.out.println(name + " like to eat meat and milk");
	}
	
	public void sleep() {
		System.out.println(name + " sleeping almost all day");
	}
	
	public String getVoice() {
		return name + " say MEOW";
	}

	@Override
	public String toString() {
		return "Cat [name=" + name +"]";
	}
	
	

	

}
