package truck;

public class WashMachine implements ComputeWeight {
	
	private double weight;    //存放重量
	
	public WashMachine(){}
	public WashMachine(double w){
		this.weight = w;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public double computeWeight() {
		// TODO Auto-generated method stub
		return getWeight();     //实现接口方法
	}

}
