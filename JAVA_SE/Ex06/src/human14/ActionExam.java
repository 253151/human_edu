package human14;

public class ActionExam {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 기존의 방법
		Action a1 = new Receive();
		a1.execute();
		System.out.println("-------------------");
		
		String str1 = "human14.Receive";
		Class calzz1 = Class.forName(str1);
		Action action1 = (Action) calzz1.newInstance();
		action1.execute();
		System.out.println ("-----------");

		String[] str2 = {"human14.Receive", "human14.Send"};
		for (int i=0; i<str2.length; i++ ) {
			Class calzz2 = Class.forName(str2[i]);
			Action action2 = (Action) calzz2.newInstance();
			action2.execute();
		}

	}

}
