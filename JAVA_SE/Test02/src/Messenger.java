
public interface Messenger {
	void sendMsg(String phoneNum, String msg);
	abstract void receiveMsg();
}
