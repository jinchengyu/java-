package testExtends;

public class Student {
	public String name;
    public int age;
    public String education;
    
    public Student(){}
    
    public Student(String name,int age,String education){
        this.name = name;
        this.age = age;
        this.education = education;
    }
    public void show(){
        System.out.println("������" + name + ", ���䣺" + age + ", ѧ��:" + education);
    }
}
