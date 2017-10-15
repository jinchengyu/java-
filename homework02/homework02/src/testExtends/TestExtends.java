package testExtends;

/**
 *<p>日期：2017年10月15日 下午2:07:02</p> 
 *<p>姓名:靳程煜 </p>
 *<p>班级:软工1501班</p>
 *<p>学号：1508010126 </p>
 *<p>功能: 测试类的继承，方法的重写</p> 
 */
public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("李白",18,"高中");
		UnderGraduate ug = new UnderGraduate("杜甫",20,"大学本科","汉语言文学");
		Graduate g = new Graduate("李清照",22,"硕士","汉语言文学", "宋词创作");
        s.show();
        ug.show();
        g.show();
	}

}
