package array;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		for(String e : list){
			System.out.println(e);
		}
		int a = list.indexOf("d");
		System.out.println(a);
	}
}
