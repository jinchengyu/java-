package truck;

public class Television implements ComputeWeight {

	private double weight;
	
	
	public Television(){}
	public Television(double w){
		this.weight = w;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public double computeWeight() {    //实现接口方法
		// TODO Auto-generated method stub
		return getWeight();
	}

}
