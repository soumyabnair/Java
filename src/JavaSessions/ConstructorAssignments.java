package JavaSessions;
import java.util.ArrayList;
public class ConstructorAssignments {

	 //1. Design a University class template with the following features:
	 	// name
		 //country
		 //stablishedDate
		 //List of course provided in Array List<String>
	//Design the constructor of this class with different parameters and all parameters.
//Write the get method of each variable with return keyword. 
		String name;
	String country;
	int Establisheddate;
	ArrayList<String> courselists;
			public ConstructorAssignments(String name, String country) {
		this.name = name;
		this.country = country;
	}
	public ConstructorAssignments(String name, String country, int establisheddate, ArrayList<String> courselists) {
		
		this.name = name;
		this.country = country;
		Establisheddate = establisheddate;
		this.courselists = courselists;
	}
public String getName() {
	return this.name;}
	public String getCountry() {
	return this.country;}
public int getEstablishedDate() {
	return this.Establisheddate;}
public ArrayList<String> getCourselists(){
	return this.courselists;}
public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("MBA");
		ar.add("B.Tech");
		ConstructorAssignments obj=new ConstructorAssignments("Stanford","USA",2004,ar);
		//System.out.println(obj.name+","+obj.country);
		//System.out.println(obj.name+","+obj.country+","+obj.Establisheddate+","+obj.courselists);
		System.out.println(obj.getName());
		System.out.println(obj.getCountry());
		System.out.println(obj.getEstablishedDate());
		System.out.println(obj.courselists);
		
	}

}
