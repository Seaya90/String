package polymorphism02;

public class SamsungTV implements TV{
	private SonySpeaker speaker;
	private int price;
	private int width;
	private int height;
	
	public SamsungTV() {
		System.out.println(">>> SamsungTV 생성");
		//필드에 있는 SonySpeaker를 생성자에서 주입
		//speaker = new SonySpeaker();
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println(">>> SamsungTV(speaker) - 객체생성");
		this.speaker = speaker;
	}
	public SamsungTV(SonySpeaker speaker, int price) {
		System.out.println(">>> SamsungTV(speaker,price) - 객체생성");
		this.speaker = speaker;
		this.price = price;
	}
	public SamsungTV(SonySpeaker speaker, int width, int height) {
		System.out.println(">>> SamsungTV(speaker,width,height) - 객체생성");
		this.speaker = speaker;
		this.width = width;
		this.height = height;
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
	//--------------------
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "SamsungTV [speaker=" + speaker + ", price=" + price + ", width=" + width + ", height=" + height + "]";
	}
	
}
