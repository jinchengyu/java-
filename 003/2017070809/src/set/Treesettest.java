package set;

import java.util.TreeSet;

public class Treesettest {
	public static void main(String [] args){
		TreeSet<String> tree = new TreeSet();
		tree.add("d");
		tree.add("b");
		tree.add("c");
		tree.add("a");
		for(String e : tree){
			System.out.println(e);
		}
		String a = tree.ceiling("");   //返回大于或等于给定元素的最小元素
		System.out.println(a);
		String b = tree.floor("h");    //返回小于或等于给定元素的最大元素
		System.out.println(b);
		
		tree.add("a");                
		//String s = tree.pollFirst();          //检索并删除第一个最小的元素
		//System.out.println("ssssss"+s);        
		
		for(String e : tree){
			System.out.print(e);
		}
		System.out.println(tree.size());
		
	

	}
}
