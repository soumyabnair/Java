package OOP_Encapsulation;

public class BrowserTesting {

	public static void main(String[] args) {
		
		Browser br=new Browser();
	br.launchbrowser();
	br.setPlugin("ide");
	System.out.println(br.getplugin());
		

	}

}
