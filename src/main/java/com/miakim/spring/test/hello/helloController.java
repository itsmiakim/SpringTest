package com.miakim.spring.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

	@ResponseBody
	@RequestMapping("/hello1")
	public String helloWorld() {
	
		return "Hello!! World!!";
	}
}
