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
		
//		for(int j = 0; j < i; j++){    //���淽�����б���
//			System.out.println(list.get(j));
//		}
		
		ListIterator h1 = list.listIterator();     //����һ��������
		System.out.println("˳�������");
		while(h1.hasNext()){      
			System.out.print(h1.next());       //Ӧ�õ���������ÿһ��Ԫ��   �������ǲ�ͬ����
		}
		System.out.println();
		System.out.println("���������");
		while(h1.hasPrevious()){
			System.out.print(h1.previous());
		}
		System.out.println("�ڵڶ��͵������ַ�֮�����һ�����֣�");
		for(int n = 0; n < 2; n++){
			h1.next();
		}
		//h1.set("b");    //���ĸղű�����������
		h1.add("5");          //��ӵ�ʱ����������ֱ���ת�����ַ���ǣ�������Ͳ���������֮��ΪString�͵ı������ڲ����ʱ��û��Ӱ�죬�����������ʱ������������ת�������������쳣
		System.out.println("���������");
		for(int j = 0; j < list.size(); j++){    //���淽�����б���
			System.out.print(list.get(j));
		}
		list.addFirst("0");
		list.addLast("9");
		System.out.println("���������");
		for(int j = 0; j < list.size(); j++){    //���淽�����б���
			System.out.print(list.get(j));
		}
		
		LinkedList<String> list1 = new LinkedList();
		list1.add("h");
		list1.add("i");
		list1.add("j");
		
		list.addAll(list1);
		System.out.println("���������");
		for(int j = 0; j < list.size(); j++){    //���淽�����б���
			System.out.print(list.get(j));
		}
		
		list.addAll(2, list1);
		System.out.println("���������");
		for(int j = 0; j < list.size(); j++){    //���淽�����б���
			System.out.print(list.get(j));
		}
		list.removeAll(list1);
		System.out.println("���������");
		for(int j = 0; j < list.size(); j++){    //���淽�����б���
			System.out.print(list.get(j));
		}
	}

}
