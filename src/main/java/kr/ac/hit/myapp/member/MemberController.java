package kr.ac.hit.myapp.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MemberController {
    
	
	@RequestMapping (value="/member/add.do", method=RequestMethod.GET) 
	//밸류의 이름이다르거나 밸류값이 하나일땐 무조건써야함 value="", method= ?.
	public String addFrom() {
		return "member/memAdd";      // ->  web-inf/vies/????.jsp
	}
	
	
	@RequestMapping (value="/member/add.do", method=RequestMethod.POST) 
	public String add(MemberVo vo) {
		System.out.println(vo.getMemId());
		
		return "member/memAdd";      // ->  web-inf/vies/????.jsp
	}
	
}
