package kr.ac.hit.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//스프링 웹 앱에서 특정 주소로 여청을 보내면 실행될 코드를 담고 있는 클래스
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	// / 주소로 GET 방식의 요청이 오면 이 메서드를 실행
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		// 현재 애플리케이션의 지역 정보를 받을 수 있다
		logger.info("Welcome home! The client locale is {}.", locale);

		// 현재 시간을 담고 있는 date 객체를 생성
		Date date = new Date();
		// 날짜시간 데이터를 현재 지역에 맞는 형식의 문자열로 변환
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);

		// 스프링에서 컨트롤러의 데이터를 jsp로 전달하기 위해서는
		// 컨트롤러 메서드의 파라미터로 map,model,modelmap 타입의 객체를 받은후,
		// 그 객체에 데이터를 저장

		model.addAttribute("serverTime", formattedDate);
		// 모댈객체에 serverTime 라는 이름으로 formattedate를 저장
		// jsp에서는 ${servertime}라는 표현으로 꺼내서 사용가능

		// 스프링 컨트롤러의 메소드에서 문자열을 반환하면 스프링은 이것을 뷰(jsp)이름으로 해석
		return "home"; // forward 쓸필요없음

		// 스프링 설정파일 (Sevlet-context.xml)에 등록된 viewResolver에다 설정한
		// pre suf fix를 반환된 뷰이름의 앞 뒤로 붙여서만든 jsp 파일로 이동(forward)

	}

}
