package polymorphism01;

public class SamsungTV implements TV{
	private SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println(">>> SamsungTV 생성");
		//필드에 있는 SonySpeaker를 생성자에서 주입
		speaker = new SonySpeaker();
	}
	
	public void powerOn() {
		System.out.println("SamsungTV - 전원 ON");
	}
	public void powerOff() {
		System.out.println("SamsungTV - 전원 OFF");
	}
	public void volumnUp() {
		System.out.println("SamsungTV - 소리크게");
		//speaker = new SonySpeaker();
		speaker.volumnUp();
	}
	public void volumnDown() {
		System.out.println("SamsungTV - 소리작게");
		//speaker = new SonySpeaker();
		speaker.volumnDown();
	}
	//----------------------
	public void initMethod() {
		System.out.println("SamsungTV - initMethod() 실행!!");
	}
	public void destroyMethod() {
		System.out.println("SamsungTV - destroyMethod() 실행!!");
	}
}
