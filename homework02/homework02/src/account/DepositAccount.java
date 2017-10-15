package account;

import java.util.Scanner;

public class DepositAccount {
	private static double rate = 0.023;    //年利率
	private String account;   //账号
    private String name;   //储户姓名
    private double money;    //存款余额
    private int deposit;   //存款
    
    Scanner in = new Scanner(System.in);
    
    public DepositAccount(){
        name = null;
        account = null;
        money = 0.0;
    }
    public void open_account(){   //开户
        System.out.println("请输入你的姓名：");
        name = in.next();
        System.out.println("请输入你的账户：");
        account = in.next();
    }
    public void deposit_money(){   //存款
        System.out.println("请输入你要存入的金额：");
        double deposit = in.nextInt();
        money += deposit;
        System.out.println("本次存入："+ deposit +"元，账户余额"+ money + "元。");
    }
    public void display(){    //查询
        System.out.println("账户：" + account);
        System.out.println("姓名：" + name);
        System.out.println("账户余额"+ money + "元。");
    }
    public void interest(){    //计算利息
    	double im_money;
    	double iy_money;
    	
    	iy_money = money*rate;   
    	im_money = iy_money/12;
    	
    	System.out.println("年利息为：" + iy_money);
        System.out.println("月利息为：" + im_money);
    }
}

