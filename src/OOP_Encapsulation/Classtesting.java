package OOP_Encapsulation;

public class Classtesting {

	public static void main(String[] args) {
	Class obj=new Class();
	obj.setName("IBM");
	obj.setLogo("IBM logo");
	obj.setTenderamount(1000);
	obj.setTotalEmp(7675646);
	obj.setInformation("Someting");
	
	
	System.out.println(obj.getName());
	System.out.println(obj.getInformation());
	System.out.println(obj.getLogo());
	System.out.println(obj.getTenderamount());
	System.out.println(obj.getTotalEmp());
	
	
	}

}
