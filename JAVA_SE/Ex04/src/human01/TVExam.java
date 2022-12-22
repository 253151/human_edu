package human01;

public class TVExam {

	public static void main(String[] args) {
//		RemoteControl rc = new Television();
		
		Television tv = new Television();
		RemoteControl rc1 = tv;
		// rc는 구현객체이고, Television은 구현클래스
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.setMute(true);
		rc1.setVolume(RemoteControl.MIN_VOL);
		// RemoteControl.MIN_VOL ==> 0
		// 그래서 rc.setVolume(0)와 같은 동작을 함.
		rc1.turnOff();
		RemoteControl.changeBatt();
		
		System.out.print("--------------------- \n");
		
		// 아래는 RemoteControl에 Audio 연결시
		Audio au = new Audio();
		RemoteControl rc2 = au;
		// rc는 구현객체이고, Audio는 구현클래스
		rc2.turnOn();
		rc2.setVolume(5);
		rc2.setMute(false);	//무음해제.
		rc2.setVolume(RemoteControl.MIN_VOL);
		// RemoteControl.MIN_VOL ==> 0
		// 그래서 rc.setVolume(0)와 같은 동작을 함.
		rc2.turnOff();
		RemoteControl.changeBatt();
	}

}
