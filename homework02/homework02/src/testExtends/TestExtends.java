package testExtends;

/**
 *<p>���ڣ�2017��10��15�� ����2:07:02</p> 
 *<p>����:������ </p>
 *<p>�༶:��1501��</p>
 *<p>ѧ�ţ�1508010126 </p>
 *<p>����: ������ļ̳У���������д</p> 
 */
public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("���",18,"����");
		UnderGraduate ug = new UnderGraduate("�Ÿ�",20,"��ѧ����","��������ѧ");
		Graduate g = new Graduate("������",22,"˶ʿ","��������ѧ", "�δʴ���");
        s.show();
        ug.show();
        g.show();
	}

}
