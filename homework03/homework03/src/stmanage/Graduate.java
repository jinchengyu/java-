package stmanage;

import java.util.Scanner;

/**
 *<p>���ڣ�2017��11��12�� ����1:48:08</p> 
 *<p>����:������ </p>
 *<p>�༶:��1501��</p>
 *<p>ѧ�ţ�1508010126 </p>
 *<p>����: Graduate �ӿڵ�Ӧ�ã����㹤���Ƿ񹻽�ѧ�ѣ�һ����ʵ�������ӿ�</p> 
 */
public class Graduate implements StudentManageInterface, TeacherManageInterface {

	private String name;
	private String sex;
	private int age;
	private double fee;
	private double pay;
	
	public Graduate(){}
	public Graduate(String name, String sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void setPay(Double money) {
		this.pay = money;

	}

	@Override
	public double getPay() {
		
		return pay;
	}

	@Override
	public void setFee(double money) {
		
		this.fee = money;
	}

	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return fee;
	}

	public void yearFee() {     //������ù�����
		double sum,num;
		sum = this.getPay()*12;
		num = sum-fee;
		if(num < 2000){
			System.out.println("provide a loan!");
		}else{
			System.out.println("OK");
		}
	}
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		Graduate gr = new Graduate("zhangsan","��",22);   
		System.out.println("����ѧ�ѣ�");
		gr.setFee(in.nextDouble());        //�趨ѧ��
		System.out.println("�����¹��ʣ�");
		gr.setPay(in.nextDouble());        //�趨����
		gr.yearFee();
	}
}
