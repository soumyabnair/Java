package OOP_Encapsulation;

public class Browser {

	public String name;
	public double version;
	
	private String plugin;
	
	public void setPlugin(String plugin) {
		this.plugin=plugin;
	}
	
	public String getplugin(){
		return plugin;
	}
	
	public void launchbrowser() {
		System.out.println("launch browser");
		checkoscompatible();
		System.out.println("bowser is launched");
	}
	
	private void checkoscompatible() {
		System.out.println("OS compatibility");
		checkBrowserExecutable();
	}
	
	private void checkBrowserExecutable() {
		System.out.println("checkBrowserExecutable");
		browserVersionCheck();
	}
	
	private void browserVersionCheck() {
		System.out.println("browserVersionCheck");
	}
}
