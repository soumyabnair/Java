package OOP_Inheritance;

public class ClassTest {

	public static void main(String[] args) {
		
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.autoparking();
		b.honk();
		b.engine();
		
		
		Car c=new Car();
		c.start();
		c.stop();
		c.honk();
		c.engine();
		
		Audi au=new Audi();
		au.start();
		au.stop();
		au.honk();
		
		
		//topcasting
		
		Car c1=new Bmw();
		c1.start();
		c1.stop();
		c1.honk();
		c1.engine();
		
		
		//downcasting
		
		Bmw b1=(Bmw) new Car();
		
		b1.start();
		
		
		
		
		
		
		
		
	}

}
