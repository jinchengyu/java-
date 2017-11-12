package truck;

import java.util.*;

/**
 *<p>日期：2017年11月12日 下午12:40:51</p> 
 *<p>姓名:靳程煜 </p>
 *<p>班级:软工1501班</p>
 *<p>学号：1508010126 </p>
 *<p>功能: 测试接口，及上转型</p> 
 */
public class Car {
	ComputeWeight [] cw;      //定义一个ComputeWeight类型的数组变量
	public Car(){
		cw = new ComputeWeight[3];    //实例化数组变量
	}
	public static void main(String[] args) {
		
		Car car = new Car();
		car.displayWeight();
	}

	public void inputWeight(){
		Scanner in = new Scanner(System.in);
		double te,co,wa;     //分别存放货物的重量
		System.out.println("请分别输入三个产品的重量：");
		te = in.nextDouble();
		co = in.nextDouble();
		wa = in.nextDouble();
		cw[0] = new Television(te);    //初始化数组每一个元素
		cw[1] = new Computer(co);
		cw[2] = new WashMachine(wa);
	}
	
	public void displayWeight(){
		inputWeight();
		double sum;
		sum = cw[0].computeWeight() + cw[1].computeWeight() + cw[2].computeWeight();   //计算货物重量
		System.out.println("卡车的载货重量为："+sum);   
	}
}
