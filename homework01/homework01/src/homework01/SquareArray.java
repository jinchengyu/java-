package homework01;

/**
 *<p>日期：2017年9月22日 下午5:01:31</p> 
 *<p>姓名:靳程煜 </p>
 *<p>班级:软工1501班</p>
 *<p>学号：1508010126 </p>
 *<p>功能: 输出数字旋转方阵</p> 
 */
public class SquareArray {

	public static void main(String[] args) {
		int number = 1;       //控制数字
		int buffer = 1;       //控制书写方向
		int n,m;              //n在书写列的时候控制行号  m 在书写行的时候控制列号
		int [][] land = new int[6][6];    //二维数组存储数据
		for(int i = 0; i < 3; i++){       //一个6*6的正方形最多循环三次就可以写完
			 n = i;
			 m = i;
			if(buffer == 1){              //当值为1的时候从上往下写列，从左往右写行
				while(n <= 4 - i){        //每一行分别5、3、1个数字
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
			if(buffer == -1 ){             //当值为-1的时候从下往上写列，从右往左写行
				while(0 < n - i){          
					land[n][m] = number;   //此时m已经加到要书写的列
					number++;
					n--;
				}
				while(0 < m - i){
					land[n][m] = number;   //此时n已经减到要书写的行
					number++;
					m--;
				}
				buffer = 1;
			}
			
		}
		for(int i = 0; i < 6; i++){      //输出数组
			for(int j = 0; j < 6; j++){
				System.out.print(land[i][j]+"	");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}

}
