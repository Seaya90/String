package polymorphism02;

public class TVUser {

	public static void main(String[] args) {
		//삼성TV 사용
		TV tv = new SamsungTV();
		
		//TV tv = new LgTV();
		tv.powerOn();
		tv.volumnUp();
		tv.volumnDown();
		tv.powerOff();
		
		//LgTV 사용
//		LgTV tv = new LgTV();
//		tv.powerOn();
//		tv.volumnUp();
//		tv.volumnDown();
//		tv.powerOff();


	}

}
