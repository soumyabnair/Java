package JavaSessions;

public class SearchConcepts {
	
	public void login()
	{
	}
	
	public void login(int phonenumber)
	{
		System.out.println(s1);
	}
	
	public void login(long phonenumber,int otp)
	{
	}
	
	public void login(String username,String password)
	{
	}
	
	public void login(String email,int otp)
	{
	}
	
	public void login(String socialmedia)
	{
	}
	
	
	public static void main(String[] args) {
		
		SearchConcepts obj=new SearchConcepts();
		 obj.login(9798696);
		obj.login("facebook");
		obj.login(512565910, 123);
		obj.login("soumyabnair@gmail.com", 887);
		obj.login("soumya", "hgfhgd65");
		
		
	}

}
