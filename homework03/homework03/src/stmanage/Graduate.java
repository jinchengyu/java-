package stmanage;

import java.util.Scanner;

/**
 *<p>日期：2017年11月12日 下午1:48:08</p> 
 *<p>姓名:靳程煜 </p>
 *<p>班级:软工1501班</p>
 *<p>学号：1508010126 </p>
 *<p>功能: Graduate 接口的应用，计算工资是否够交学费，一个类实现两个接口</p> 
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

	public void yearFee() {     //计算费用够不够
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
		Graduate gr = new Graduate("zhangsan","男",22);   
		System.out.println("输入学费：");
		gr.setFee(in.nextDouble());        //设定学费
		System.out.println("输入月工资：");
		gr.setPay(in.nextDouble());        //设定工资
		gr.yearFee();
	}
}
