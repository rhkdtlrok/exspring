package kr.ac.hit.ex;

import org.springframework.stereotype.Component;

//이클래스의 객체를 생성하여 h라는 이름으로 컨테이너에 등록
@Component("h")
public class Hello implements Greet {

	@Override
	public void say() {
		System.out.println("Hello");
		
	}
       
}
