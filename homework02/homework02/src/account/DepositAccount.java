package account;

import java.util.Scanner;

public class DepositAccount {
	private static double rate = 0.023;    //������
	private String account;   //�˺�
    private String name;   //��������
    private double money;    //������
    private int deposit;   //���
    
    Scanner in = new Scanner(System.in);
    
    public DepositAccount(){
        name = null;
        account = null;
        money = 0.0;
    }
    public void open_account(){   //����
        System.out.println("���������������");
        name = in.next();
        System.out.println("����������˻���");
        account = in.next();
    }
    public void deposit_money(){   //���
        System.out.println("��������Ҫ����Ľ�");
        double deposit = in.nextInt();
        money += deposit;
        System.out.println("���δ��룺"+ deposit +"Ԫ���˻����"+ money + "Ԫ��");
    }
    public void display(){    //��ѯ
        System.out.println("�˻���" + account);
        System.out.println("������" + name);
        System.out.println("�˻����"+ money + "Ԫ��");
    }
    public void interest(){    //������Ϣ
    	double im_money;
    	double iy_money;
    	
    	iy_money = money*rate;   
    	im_money = iy_money/12;
    	
    	System.out.println("����ϢΪ��" + iy_money);
        System.out.println("����ϢΪ��" + im_money);
    }
}

