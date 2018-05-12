package by.htp.springmvc.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import by.htp.springmvc.bean.users.User;
import by.htp.springmvc.dao.UserDaoHibernateImpl;

@Controller
@RequestMapping("/hello")
public class DefaultActionController {
	
	   @RequestMapping(method = RequestMethod.POST)
	   public String printHello(ModelMap model,@RequestParam("username") String login,  @RequestParam("password") String pass) {
	      model.addAttribute("login",login);
	      model.addAttribute("pass", pass);
	      for(User user: new UserDaoHibernateImpl().readAll()) {
	    	  if(login.equals(user.getLogin()) && pass.equals(user.getPassword())) {
	    		  if( user.getRole() == 1) {
	    			  return "admin";
	    		  }
	    		  else {
	    			  return "user";
	    		  }
	    	  }
	      }
	      return "hello";
	   }
}

