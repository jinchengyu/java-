package testExtends;

public class UnderGraduate extends Student {
	public String specialty;
	
	public UnderGraduate(){}
	
	public UnderGraduate(String name, int age, String education, String specialty){
        super(name,age,education);     //���ø��๹�캯��
        this.specialty = specialty;
    }
    public void show(){
        System.out.println("������" + name + ", ���䣺" + age + ", ѧ����" + education + ", רҵ��" + specialty);
    }
}
