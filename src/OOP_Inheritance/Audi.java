package OOP_Inheritance;

public class Audi extends Car{
@Override
	public void start() {
		System.out.println("Audi-----start");
	}
	@Override
	public void honk() {
		System.out.println("Audi-----honk");
	}
}
