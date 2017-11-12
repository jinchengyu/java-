package array;

import java.awt.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
//		for(int j = 0; j < i; j++){    //常规方法进行遍历
//			System.out.println(list.get(j));
//		}
		
		ListIterator h1 = list.listIterator();     //定义一个迭代器
		System.out.println("顺序输出：");
		while(h1.hasNext()){      
			System.out.print(h1.next());       //应用迭代器访问每一个元素   迭代器是不同步的
		}
		System.out.println();
		System.out.println("逆序输出：");
		while(h1.hasPrevious()){
			System.out.print(h1.previous());
		}
		System.out.println("在第二和第三个字符之间插入一个数字：");
		for(int n = 0; n < 2; n++){
			h1.next();
		}
		//h1.set("b");    //更改刚才遍历过的数据
		h1.add("5");          //添加的时候如果是数字必须转换成字符，牵扯到类型擦除，擦除之后为String型的变量，在插入的时候没有影响，但是在输出的时候必须进行类型转换，进而出现异常
		System.out.println("重新输出：");
		for(int j = 0; j < list.size(); j++){    //常规方法进行遍历
			System.out.print(list.get(j));
		}
		list.addFirst("0");
		list.addLast("9");
		System.out.println("重新输出：");
		for(int j = 0; j < list.size(); j++){    //常规方法进行遍历
			System.out.print(list.get(j));
		}
		
		LinkedList<String> list1 = new LinkedList();
		list1.add("h");
		list1.add("i");
		list1.add("j");
		
		list.addAll(list1);
		System.out.println("重新输出：");
		for(int j = 0; j < list.size(); j++){    //常规方法进行遍历
			System.out.print(list.get(j));
		}
		
		list.addAll(2, list1);
		System.out.println("重新输出：");
		for(int j = 0; j < list.size(); j++){    //常规方法进行遍历
			System.out.print(list.get(j));
		}
		list.removeAll(list1);
		System.out.println("重新输出：");
		for(int j = 0; j < list.size(); j++){    //常规方法进行遍历
			System.out.print(list.get(j));
		}
	}

}
