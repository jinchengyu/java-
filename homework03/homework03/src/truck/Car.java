package truck;

import java.util.*;

/**
 *<p>���ڣ�2017��11��12�� ����12:40:51</p> 
 *<p>����:������ </p>
 *<p>�༶:��1501��</p>
 *<p>ѧ�ţ�1508010126 </p>
 *<p>����: ���Խӿڣ�����ת��</p> 
 */
public class Car {
	ComputeWeight [] cw;      //����һ��ComputeWeight���͵��������
	public Car(){
		cw = new ComputeWeight[3];    //ʵ�����������
	}
	public static void main(String[] args) {
		
		Car car = new Car();
		car.displayWeight();
	}

	public void inputWeight(){
		Scanner in = new Scanner(System.in);
		double te,co,wa;     //�ֱ��Ż��������
		System.out.println("��ֱ�����������Ʒ��������");
		te = in.nextDouble();
		co = in.nextDouble();
		wa = in.nextDouble();
		cw[0] = new Television(te);    //��ʼ������ÿһ��Ԫ��
		cw[1] = new Computer(co);
		cw[2] = new WashMachine(wa);
	}
	
	public void displayWeight(){
		inputWeight();
		double sum;
		sum = cw[0].computeWeight() + cw[1].computeWeight() + cw[2].computeWeight();   //�����������
		System.out.println("�������ػ�����Ϊ��"+sum);   
	}
}
