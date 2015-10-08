package cn.liyl.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/demo")
public class DemoTestController {
	
	@RequestMapping("/test")
	public String doMain(){
		return "jsp/index";
	}
	
	@RequestMapping("/test2")
	public ModelAndView doMain2(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "Hello World!");
		mv.setViewName("jsp/index");
		return mv;
	}
}
