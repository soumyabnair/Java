package JavaSessions;
import java.util.ArrayList;
public class BrowserTemplate {
	
	String browsername;
	String vendorname;
	double currentversion;
	ArrayList<String> pluginslist;
		
	public BrowserTemplate(String browsername, String vendorname, double currentversion,
			ArrayList<String> pluginslist) {
		
		this.browsername = browsername;
		this.vendorname = vendorname;
		this.currentversion = currentversion;
		this.pluginslist = pluginslist;
	}

	public BrowserTemplate(String browsername, double currentversion) {
		
		this.browsername = browsername;
		this.currentversion = currentversion;
	}
public String getBrowsername()
{
	return this.browsername;
}

public String getVendorname()
{
	return this.vendorname;
}

public double getCurrentversion()
{
	return this.currentversion;
}
public ArrayList<String> getPluginslist()
{
	return this.pluginslist;
}
}
