package cn.liyl.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoTestController {

	public ModelAndView doMain(){
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
}
