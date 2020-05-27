package JavaSessions;

import java.util.ArrayList;

public class BrowserTemplateTesting {
	//2. Design a browser class template with the following features:
	 //variables:
		// browserName
		 //vendorName
		 //currentVersion
		 //List of plugins supported by Browser in Array List<String>

		 //--Design the constructor of this class with different parameters and all parameters.

		 //--Write the get method of each variable with return keyword.

	public static void main(String[] args) {
		
		ArrayList<String> pluginslist=new ArrayList<String>();
		pluginslist.add("plugin1");
		pluginslist.add("plugin2");
		BrowserTemplate obj=new BrowserTemplate("Firefox","abcd",13.4,pluginslist);
		
		System.out.println(obj.getBrowsername());
		System.out.println(obj.getVendorname());
		System.out.println(obj.getCurrentversion());
		System.out.println(obj.getPluginslist());
		
		
		
	}

}
