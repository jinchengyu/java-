package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashsettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hset = new HashSet();
		hset.add("a");
		hset.add("b");
		hset.add("c");
		
		Iterator h = hset.iterator();
		while(h.hasNext()){
			System.out.print(h.next());
		}
		
		hset.add("a");
		
	    for(String e: hset){
	    	System.out.println(e);
	    }
	}

}
