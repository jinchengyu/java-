package homework01;

import java.util.Scanner;

/**
 *<p>���ڣ�2017��9��22�� ����5:03:58</p> 
 *<p>����:������ </p>
 *<p>�༶:��1501��</p>
 *<p>ѧ�ţ�1508010126 </p>
 *<p>����: һ������������0������ѭ���ͱ��ر���������n��2n��4n��8n��˳�������
 * ��ֵ����5000ʱ����ֵ����ָ��˳���������</p> 
 */
public class NumberSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("����һ����������");
		int num = in.nextInt();
		sumNumber(num);
	}
	
	public static void sumNumber(int sum){
		if(sum <= 0){
			System.out.println("������һ����������");
			return;
		}
		System.out.println(sum);       //���������������
		int k;           //���û�н��м������
		k = sum;
		if(sum > 5000){
			System.out.println(sum);
			return;     //�����������5000ʱ�ݹ����
		}
		else{
			sum = sum * 2;
			sumNumber(sum);        //�����Լ�ʵ�ֵݹ�
			System.out.println(k);    //�����������
		}
	}
}