package testExtends;

public class UnderGraduate extends Student {
	public String specialty;
	
	public UnderGraduate(){}
	
	public UnderGraduate(String name, int age, String education, String specialty){
        super(name,age,education);     //调用父类构造函数
        this.specialty = specialty;
    }
    public void show(){
        System.out.println("姓名：" + name + ", 年龄：" + age + ", 学历：" + education + ", 专业：" + specialty);
    }
}
