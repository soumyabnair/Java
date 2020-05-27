package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		//Try to create multiple Object Arrays for different players
		
		Object ob[]=new Object[5];
		ob[0]="Sachin";
		ob[1]=30;
		ob[2]="India";
		ob[3]="2/3/1970";
		ob[4]=82.33;
		for(int k=0;k<ob.length;k++)
		{
		System.out.print(ob[k] + "\t");
		
		}
		System.out.println();
		
		Object ob1[]=new Object[5];
		ob1[0]="Tom";
		ob1[1]=20;
		ob1[2]="USA";
		ob1[3]="5/6/1978";
		ob1[4]=72.93;
		for(int i=0;i<ob1.length;i++)
		{
		System.out.print(ob1[i] + "\t");
		}
		
System.out.println();
		
		Object ob2[]=new Object[5];
		ob2[0]="Rahul";
		ob2[1]=36;
		ob2[2]="Brazil";
		ob2[3]="8/6/1988";
		ob2[4]=94.93;
		for(int j=0;j<ob2.length;j++)
		{
		System.out.print(ob2[j] + "\t");
		}
		
	}

}
