package human01;

public class ProductExam {

	public static void main(String[] args) {
		Product[] prod = new Product[10];
		
		prod[0] = new Product("TV");
		prod[1] = new Product("HandSet");
		prod[2] = new Product("Car");
		
		prod[1] = null;
		
		for (int i=0; i<10; i++) {
			System.out.printf("product[%d] = %s \n", i, prod[i].name);
		}

	}

}

