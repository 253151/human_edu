 package human28;

public class MyTvExam {
	public static void main(String args[]) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.cahnnelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.volume = 100;
		t.channelUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
	}
}
