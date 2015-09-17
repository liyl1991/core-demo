package cn.liyl.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoTestController {
	
	@RequestMapping("/test")
	public ModelAndView doMain(){
		ModelAndView mv = new ModelAndView();
		mv.setView("index");
		mv.addObject("msg", "Hello World!");
		return mv;
	}
	
}
