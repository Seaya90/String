package di_annotation;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//이름지정 안하면 클래스명의 첫글자 소문자인 이름사용(lgTV)
@Component 
public class LgTV implements TV {
	//@Resource : 이름으로 찾아서 주입
	//@Resource : name 속성 값 필수
	@Resource(name="speaker")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println(">>> LgTV - 객체생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTV - 전원 ON");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV - 전원 OFF");
	}
	@Override
	public void volumnUp() {
		System.out.println("LgTV - 소리 크게");
		speaker.volumnUp();
	}
	@Override
	public void volumnDown() {
		System.out.println("LgTV - 소리 작게");
		speaker.volumnDown();
	}
	
	//----------------------
	public void initMethod() {
		System.out.println("LgTV - initMethod() 실행!!");
	}
	public void destroyMethod() {
		System.out.println("LgTV - destroyMethod() 실행!!");
	}
}
