package com.goldilocks;
import org.springframework.stereotype.Service;

@Service
public class ServiceLoginClass {
	
    public boolean authenticate(String username, String password) {
        
        return "admin".equals(username) && "password".equals(password);
    }
}
	

	
	

	



