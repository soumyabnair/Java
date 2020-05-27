package JavaSessions;

public class Car {

    String name;
    String color;
    String model;
    int price;
    
    static int wheels=4;
    
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.name="Audi";
		c1.color="White";
		c1.model="Q5";
		c1.price=60000;
	
		
		
		Car c2=new Car();
		c2.name="Benz";
		c2.color="Black";
		c2.model="Eseries";
		c2.price=80000;
		
		
		
		Car c3=new Car();
		c3.name="BMW";
		c3.color="Grey";
		c3.model="5 series";
		c3.price=70000;
	
		System.out.println(wheels);

	}

}
