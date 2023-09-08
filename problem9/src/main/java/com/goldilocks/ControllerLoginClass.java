package com.goldilocks;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ControllerLoginClass {
	
	@GetMapping("/login")
	
    public String login(Model model) {
        return "login";
	
	}
	
}
	

	    
	    
	



