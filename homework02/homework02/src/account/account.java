package account;

import java.util.Scanner;

/**
 *<p>日期：2017年10月15日 下午1:57:17</p> 
 *<p>姓名:靳程煜 </p>
 *<p>班级:软工1501班</p>
 *<p>学号：1508010126 </p>
 *<p>功能: 完成银行定期存款功能</p> 
 */
public class account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	
	public static void menu() {
		DepositAccount saver = new DepositAccount();
		boolean k = true;
		
		Scanner in = new Scanner(System.in);
        while(k){
            System.out.println("请输入你要进行的操作：");
            System.out.println("1.开户");
            System.out.println("2.存款");
            System.out.println("3.查询");
            System.out.println("4.查看利息");
            System.out.println("0.退出");
            
            int m = in.nextInt();
            
            switch (m) {
                case 1:
                    saver.open_account();
                    break;
                case 2:
                    saver.deposit_money();
                    break;
                case 3:
                    saver.display();
                    break;
                case 4:
                    saver.interest();
                    break;
                case 0:
                    k = false;
            }
        }
	}
}
