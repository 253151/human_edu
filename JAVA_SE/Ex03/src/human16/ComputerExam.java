package human16;

public class ComputerExam {

	public static void main(String[] args) {
		DeskTop dt = new DeskTop();
		dt.turnOn();
		dt.typing();
		dt.display();
		dt.turnOff();
		
		MyNotebook nb = new MyNotebook();
		nb.turnOn();
		nb.typing();
		nb.display();
		nb.turnOff();
	}

}
