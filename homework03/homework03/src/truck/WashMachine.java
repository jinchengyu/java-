package truck;

public class WashMachine implements ComputeWeight {
	
	private double weight;    //�������
	
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
		return getWeight();     //ʵ�ֽӿڷ���
	}

}
