package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/second")
public class SecondController {

	@RequestMapping(value ="/user", method = RequestMethod.GET)
	   public String printHelloUser(ModelMap model) {
	      model.addAttribute("login","user");
	      model.addAttribute("pass", "pass");
	      System.out.println("user2");
	      return "user";
	   }
	@RequestMapping(value ="/admin", method = RequestMethod.GET)
	   public String printHelloAdmin(ModelMap model) {
	      model.addAttribute("login","admin");
	      model.addAttribute("pass", "adminPass");
	      System.out.println("admin2");
	      return "admin";
	   }
	
		@RequestMapping(value ="/", method = RequestMethod.GET)
	   public String printHelloAnyone(ModelMap model) {
		System.out.println("hello2");
	      return "hello";
	   }
}