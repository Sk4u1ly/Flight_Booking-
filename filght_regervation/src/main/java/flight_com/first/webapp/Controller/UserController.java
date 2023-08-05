package flight_com.first.webapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import flight_com.first.webapp.Entity.User;
import flight_com.first.webapp.Repositroy.UserRepository;

@Controller
public class UserController { 
	 
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/showPage")
	public String showPage() {
		return "login/login";
		
	}
	
	
	@RequestMapping("/viewReg")
	public String showReg() {
		return "login/viewReg";
		
	}
	 
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user")User user) {
		userRepo.save(user);
		return "login/login";
		
		
	}
       @RequestMapping("/verifyLogin")
	public String verifyLogin(@RequestParam ("email")String email ,@RequestParam("password")String password , ModelMap modelMap) {
    	  User user = userRepo.getByEmail(email);
    	  if(user!=null) {
      if(user.getEmail().equals(email)&& user.getPassword().equals(password)) {
    	  return "findFlight";
      }else {
    	  modelMap.addAttribute("error","Invalid UserId/Password");
    	  return "login/login";
      }
		
    	  }else {
    		  modelMap.addAttribute("error","Invalid UserId/Password");
        	  return "login/login";
    	  }
    	  
		
       }
	
	
}

