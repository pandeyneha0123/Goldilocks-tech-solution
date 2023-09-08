package com.goldilocks;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class AuthControllerClass {

	    private final ServiceLoginClass loginService;

	    @Autowired
	    public AuthControllerClass(ServiceLoginClass loginService) {
	        this.loginService = loginService;
	    }

	    @PostMapping("/authenticate")
	    public String authenticate(@RequestParam String username, @RequestParam String password, Model model) {
	        if (loginService.authenticate("Neha", "12345678")) {
	            model.addAttribute("message", "Login successful!");
	        } else {
	            model.addAttribute("message", "Login failed. Invalid credentials.");
	        }
	        return "loginResult";
	    }
	


}
