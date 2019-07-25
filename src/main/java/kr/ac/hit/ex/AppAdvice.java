package kr.ac.hit.ex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // aop관련
@Component("aop") // 스프링에 등록
public class AppAdvice {

	// 실행하기전에 beforeMethod를 시작해라

	// @Before("execution(* kr.ac.hit.ex.Greet.say(..))")

	// 패캐지의 모든 메서드 실행전에
	@Before("execution(* kr.ac.hit.ex.*.*(..))")
	public static void beforeMethod(JoinPoint joinPoint) {
		// joinpoint 이메서드가 끼어들어가서 실행되는 지점에 대한 정보를 인자로 받을 수 있다
		System.out.println("메소드 시작 :" + joinPoint.getSignature().getName());

	}
	
	@After("execution(* kr.ac.hit.ex.*.*(..))")
	public static void afterMethod(JoinPoint joinPoint) {
		// joinpoint 이메서드가 끼어들어가서 실행되는 지점에 대한 정보를 인자로 받을 수 있다
		System.out.println("메소드 끝 :" + joinPoint.getSignature().getName());

	}
}
