package JavaSessions;

import java.util.ArrayList;

public class WebpageTesting {

	public static void main(String[] args) {
		
		ArrayList<String> linklists=new ArrayList<String>();
		linklists.add("forgot pwd");
		linklists.add("reset pwd");
		
		ArrayList<String> homelinklists=new ArrayList<String>();
		homelinklists.add("forgot pwd");
		homelinklists.add("reset pwd");
		homelinklists.add("sign up");
		
		
		
		WebPage loginpage=new WebPage("login","http://www.amazon.com/login",linklists);
		WebPage homepage=new WebPage("home","http://www.amazon.com/home",homelinklists);
		
		System.out.println(loginpage.title +" "+loginpage.URL+" "+linklists);
		System.out.println(homepage.title +" "+homepage.URL+" "+homelinklists);

	}

}
