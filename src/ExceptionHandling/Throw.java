package ExceptionHandling;

public class Throw {

	public static void main(String[] args) {
		
		String browser="IE";
		if(browser.equals("Chrome")) {
			System.out.println("Launch chrome");
		}
 
		else if(browser.equals("Firefox")) {
			System.out.println("Launch Firefox");
		}
		
		else if(browser.equals("Safari")) {
			System.out.println("Launch Safari");
		}
		
		else {
			try {
				throw new Exception("Please pass the correct browser");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
