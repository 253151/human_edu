package human06;

public class Product <T,M> {
	public T type;
	public M model;
	
	public void setT (T t) {
		this.type = t;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public T getT() {
		return this.type;
	}
	public M getModel() {
		return this.model;
	}
}
