package truck;

public class Computer implements ComputeWeight {

	private double weight;
	
	public Computer(){}
	public Computer(double w){
		this.weight = w;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public double computeWeight() {   //实现接口方法
		return getWeight();
	}

}
