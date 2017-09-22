package homework01;

import java.util.Scanner;

/**
 *<p>日期：2017年9月22日 下午5:03:58</p> 
 *<p>姓名:靳程煜 </p>
 *<p>班级:软工1501班</p>
 *<p>学号：1508010126 </p>
 *<p>功能: 一个整数，大于0，不用循环和本地变量，按照n，2n，4n，8n的顺序递增，
 * 当值大于5000时，把值按照指定顺序输出来。</p> 
 */
public class NumberSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("输入一个正整数：");
		int num = in.nextInt();
		sumNumber(num);
	}
	
	public static void sumNumber(int sum){
		if(sum <= 0){
			System.out.println("请输入一个正整数！");
			return;
		}
		System.out.println(sum);       //将传进来的数输出
		int k;           //存放没有进行计算的数
		k = sum;
		if(sum > 5000){
			System.out.println(sum);
			return;     //当这个数大于5000时递归结束
		}
		else{
			sum = sum * 2;
			sumNumber(sum);        //调用自己实现递归
			System.out.println(k);    //将数逆序输出
		}
	}
}