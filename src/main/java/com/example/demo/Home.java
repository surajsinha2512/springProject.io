package com.example.demo;

import java.sql.SQLException;
import java.util.HashMap;

import javax.validation.Valid;

import org.hibernate.validator.internal.util.logging.Messages;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;

@RestController
public class Home {
	
	@RequestMapping("/home")
	   public JSONObject home()
	   {
		  HashMap<String, String> map = new HashMap<>();
		  String s="Suraj Sinha";
		    map.put("userName", s);
		    map.put("email", "bar");
		    map.put("phone", "bb");
		  
			return new JSONObject(map) ;
	   }
	
	@PostMapping("/signup")
	public JSONObject sign() {
		  HashMap<String, String> map = new HashMap<>();
	   return new JSONObject(map);
	}
	
	@RequestMapping(value = "/setMessages", method = RequestMethod.POST)
	public JSONObject signup(@RequestBody JSONObject a) throws SQLException {
		
		System.out.println("Message:"+a+" idUser:");
		
		return a; 


}
}


