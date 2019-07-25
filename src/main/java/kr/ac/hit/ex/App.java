package kr.ac.hit.ex;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

// 이 클래스의 객체를 생성하여 a라는 이름으로 컨테이너에 등록 
@Component("a")
public class App {

	
    // @autowired, inject , resource 중 하나를 사용하여 스프링에 등록된 객체들 중 변수의 타입에 맞는 객체를 자동으로 저장
	@Resource(name="b")  //b라는 이름으로 객체저장  이름지정안해줘도 알아서 타입에맞게 등록을해줌
	private Greet greet;
	
	public Greet getGreet() {
		return greet;
	}

	public void setGreet(Greet greet) {
		this.greet = greet;
	}

	public void act() {
		greet.say();
	}
}
