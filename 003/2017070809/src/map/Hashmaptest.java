package map;

import java.util.HashMap;

public class Hashmaptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
		//map.put(1);
		boolean a = map.isEmpty();
		System.out.println(a);
	}

}
