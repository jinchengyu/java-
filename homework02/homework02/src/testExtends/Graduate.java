package testExtends;

public class Graduate extends UnderGraduate {
	public String direction;
	
	public Graduate(){}
    public Graduate(String name,int age,String education, String specialty, String direction){
        super(name, age, education, specialty);  //访问父类构造函数
        this.direction = direction;
    }
    public void show(){
        System.out.println("姓名：" + name + ", 年龄：" + age + ", 学历：" + education + ", 研究方向：" + direction);
    }
}
