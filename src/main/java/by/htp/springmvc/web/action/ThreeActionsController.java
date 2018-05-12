package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/main")
public class ThreeActionsController {
	
	@RequestMapping
	//@RequestMapping(value ="/user", method = RequestMethod.GET)
	   public String printHelloUser(ModelMap model) {
	      model.addAttribute("login","user");
	      model.addAttribute("pass", "pass");
	      System.out.println("user");
	      return "user";
	   }
	
	@RequestMapping
	//@RequestMapping(value ="/admin", method = RequestMethod.GET)
	   public String printHelloAdmin(ModelMap model) {
	      model.addAttribute("login","admin");
	      model.addAttribute("pass", "adminPass");
	      System.out.println("admin");
	      return "admin";
	   }
	@RequestMapping
	//@RequestMapping(value ="/", method = RequestMethod.GET)
	   public String printHelloAnyone(ModelMap model) {
		System.out.println("hello");
	      return "hello";
	   }

	
	/*@RequestMapping(value ="/user", method = RequestMethod.POST)
	   public v printHelloUser(ModelMap model,@RequestParam("username") String login,  @RequestParam("password") String pass) {
	      model.addAttribute("login",login);
	      model.addAttribute("pass", pass);
	      return "user";
	   }

	@RequestMapping(value ="/admin", method = RequestMethod.POST)
	   public String printHelloAdmin(ModelMap model,@RequestParam("username") String login,  @RequestParam("password") String pass) {
	      model.addAttribute("login",login);
	      model.addAttribute("pass", pass);
	      return "admin";
	   }

	@RequestMapping(value ="/", method = RequestMethod.POST)
	   public String printHelloAnyone(ModelMap model,@RequestParam("username") String login,  @RequestParam("password") String pass) {
	      model.addAttribute("login",login);
	      model.addAttribute("pass", pass);
	      return "hello";
	   }*/
}
