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
		String a = tree.ceiling("");   //���ش��ڻ���ڸ���Ԫ�ص���СԪ��
		System.out.println(a);
		String b = tree.floor("h");    //����С�ڻ���ڸ���Ԫ�ص����Ԫ��
		System.out.println(b);
		
		tree.add("a");                
		//String s = tree.pollFirst();          //������ɾ����һ����С��Ԫ��
		//System.out.println("ssssss"+s);        
		
		for(String e : tree){
			System.out.print(e);
		}
		System.out.println(tree.size());
		
	

	}
}
