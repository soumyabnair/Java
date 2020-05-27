package JavaSessions;

public class StringManipulations {

	public static void main(String[] args) {
//how to find the 3rd occurance of i

		String str="This is my first java code and I am so happy";
		//System.out.println(str.length());
		
		//System.out.println(str.charAt(3));
		
System.out.println("The first occurance of i is in index :"+str.indexOf('i'));// 1st occurance of i
		
System.out.println("The second occurance of i is in index :"+str.indexOf('i', str.indexOf('i')+1));
System.out.println("The third occurance of i is in index :"+str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1));
				
System.out.println(str.indexOf("java"));	

System.out.println(str.indexOf("test"));

String msg="Welcome admin";

if(msg.indexOf("admin")>=0) {
	System.out.println("User is logged in");
	
}
else {

System.out.println("User not available");

	}

   //trim
  

  String s="  Hello world  ";
  System.out.println(s);
   System.out.println(s.trim().replace(" ", ""));
   
   String dob="06-06-2017";
   System.out.println(dob.replace("-", "/"));
   
   String lc="This is java";
   System.out.println(lc.toLowerCase());
   System.out.println(lc.toUpperCase());
   
   String a="Hello";
   String b="Selenium";
   System.out.println(a+ " " +b);
   System.out.println(a.concat(b));
   
   String h="Hey admin welcom to my portal";
   System.out.println(h.contains("test"));
   
   String s1="This is my code";
   String s2="this is my code";
   System.out.println(s1.equalsIgnoreCase(s2));
   
   String sr="Your transaction id is 123456";
   System.out.println(sr.substring(0, 10));
   System.out.println(sr.substring(0));
   System.out.println(sr.substring(sr.indexOf("is")));
   
   String data="Tom;25;IBM;London;99999";
   String details[]=data.split(";");
  System.out.println(details.length); 
  
  for(int i=0;i<details.length;i++)
  {
	  System.out.println(details[i]);
  }
  
  String test="xXjavaXxXpythonxXXxRuby";
 String result[]=test.split("xX");
 System.out.println("0th value->"+result[0]);
 System.out.println("1st value->"+result[1]);
 System.out.println("2nd value->"+result[2]);
 System.out.println("3rd value->"+result[3]);

 
 String main="Selenium";
 String rev="";
 for(int j=main.length()-1 ; j>=0; j--) {
	 rev=rev+main.charAt(j);
	 
 }
		 
 System.out.println(rev); 
 
 StringBuffer obj=new StringBuffer(main);
 System.out.println(obj.reverse() 	);
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   

	}
}
