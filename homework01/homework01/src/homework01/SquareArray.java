package homework01;

/**
 *<p>���ڣ�2017��9��22�� ����5:01:31</p> 
 *<p>����:������ </p>
 *<p>�༶:��1501��</p>
 *<p>ѧ�ţ�1508010126 </p>
 *<p>����: ���������ת����</p> 
 */
public class SquareArray {

	public static void main(String[] args) {
		int number = 1;       //��������
		int buffer = 1;       //������д����
		int n,m;              //n����д�е�ʱ������к�  m ����д�е�ʱ������к�
		int [][] land = new int[6][6];    //��ά����洢����
		for(int i = 0; i < 3; i++){       //һ��6*6�����������ѭ�����ξͿ���д��
			 n = i;
			 m = i;
			if(buffer == 1){              //��ֵΪ1��ʱ���������д�У���������д��
				while(n <= 4 - i){        //ÿһ�зֱ�5��3��1������
					land[n][i] = number;
					number++;
					n++;
				}
				while(m <= 4 - i){
					land[n][m] = number;
					number++;
					m++;
				}
				
				buffer = -1;
			}
			if(buffer == -1 ){             //��ֵΪ-1��ʱ���������д�У���������д��
				while(0 < n - i){          
					land[n][m] = number;   //��ʱm�Ѿ��ӵ�Ҫ��д����
					number++;
					n--;
				}
				while(0 < m - i){
					land[n][m] = number;   //��ʱn�Ѿ�����Ҫ��д����
					number++;
					m--;
				}
				buffer = 1;
			}
			
		}
		for(int i = 0; i < 6; i++){      //�������
			for(int j = 0; j < 6; j++){
				System.out.print(land[i][j]+"	");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

}
