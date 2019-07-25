package kr.ac.hit.ex;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class AppMain {
	public static void main(String[] args) {
		// App app = new App();
		// app.acts();

		// ApplicationContext == BeanContainer 
		// 스프링의 실체 : 설정파일에 등록된 클래스의 객체생성후 보관하는 컨테이너
		ClassPathXmlApplicationContext Context = new ClassPathXmlApplicationContext("/kr/ac/hit/ex/context.xml");
        //스프링에 a라는 이름으로 등록되어있는 객체 가져옴
		App app = (App) Context.getBean("a");
	     app.act();
	} 
}
