package unite5;
//ͬһ����ֻҪ������һ����ô����һֱ�������ڲ�������ͬ��
import java.util.concurrent.locks.*;

/**
 * <p>Title: AbstractClasses</p>
 * <p>Description: �����߳���</p>
 * <p>Company: �����1501</p> 
 * @author ������
 * @date 2017��8��29�� ����4:59:48
 */
public class AbstractClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		int i;
		
			TestRunnablea testa = new TestRunnablea(a);
			Thread ta = new Thread(testa);
			ta.start();
			
			TestRunnableb testb = new TestRunnableb(a);
			Thread tb = new Thread(testb);
			tb.start();
		
	}

}

class A {
	
	Lock lockA = new ReentrantLock();
	Lock lockB = new ReentrantLock();
	public  void testA(){
		lockA.lock();
		try{
			 for(int i = 0;i<1000;i++){
		        	System.out.println("aa");
		        	testB();
		        }
			
		}
		finally{
			//lockA.unlock();
		}
	}
	public  void testB(){
		//lockA.lock();
		try{
			 for(int i = 0;i<10;i++){
		        	System.out.println("1111111");
		        }
		}
		finally{
			//lockA.unlock();
		}
		
	}
}

class TestRunnablea implements Runnable{
    A a;
	public  TestRunnablea(A a){
		this.a = a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
				a.testA();
			
	}
	
}

class TestRunnableb implements Runnable{
    A a;
	public TestRunnableb(A a){
		this.a = a;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
				//a.testA();
		        a.testB();
		        for(int i = 0;i<100;i++){
		        	System.out.println("0000000000000000000000000000000000000000000000000");
		        }
				
	}
	
}