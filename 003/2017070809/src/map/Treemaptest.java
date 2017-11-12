package map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemaptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map = new TreeMap();
		map.put(5, "a");
		map.put(3, "b");
		map.put(1, "c");
		System.out.println(map);
		Entry<Integer,String> a = map.ceilingEntry(2);
		System.out.print(a);
	}

}
