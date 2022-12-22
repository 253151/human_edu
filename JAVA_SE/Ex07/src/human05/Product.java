package human05;

public class Product <T> {
	public T type;
	public String model;
	
	public void setT (T t) {
		this.type = t;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public T getT() {
		return this.type;
	}
	public String getModel() {
		return this.model;
	}
}
