package account;

import java.util.Scanner;

/**
 *<p>���ڣ�2017��10��15�� ����1:57:17</p> 
 *<p>����:������ </p>
 *<p>�༶:��1501��</p>
 *<p>ѧ�ţ�1508010126 </p>
 *<p>����: ������ж��ڴ���</p> 
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
            System.out.println("��������Ҫ���еĲ�����");
            System.out.println("1.����");
            System.out.println("2.���");
            System.out.println("3.��ѯ");
            System.out.println("4.�鿴��Ϣ");
            System.out.println("0.�˳�");
            
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
