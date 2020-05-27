package JavaSessions;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Java");
		map.put(2, "Ruby");
		map.put(3, "python");
		System.out.println(map.get(2));
		System.out.println(map.get(4));
		
		//for(Map.Entry<Integer, String> entry : map.entrySet()) {
			//System.out.println("key =" +entry.getKey() + "=" +entry.getValue());
		//}
		
		//map.forEach((a,b) -> System.out.println("key =" +a + "value=" +b));
		map.forEach((a,b)-> System.out.println("key =" +a + "value=" +b));;
		
		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		map1.put(1, 200);
		map1.put(2, 100);
		map1.put(3, 500);
		map1.put(4, 100);
		map1.put(5, null);
		map1.put(null, 900);
		map1.put(null, 700);
		System.out.println(map1.get(5));
		System.out.println(map1.get(null));
	}

}
