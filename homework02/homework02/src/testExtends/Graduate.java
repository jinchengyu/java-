package testExtends;

public class Graduate extends UnderGraduate {
	public String direction;
	
	public Graduate(){}
    public Graduate(String name,int age,String education, String specialty, String direction){
        super(name, age, education, specialty);  //���ʸ��๹�캯��
        this.direction = direction;
    }
    public void show(){
        System.out.println("������" + name + ", ���䣺" + age + ", ѧ����" + education + ", �о�����" + direction);
    }
}
