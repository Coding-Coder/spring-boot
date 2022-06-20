package com.lxy.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController.
 *
 * @author lxy
 * @date 2022/06/14
 * @description
 */
@RestController
public class TestController {
	@RequestMapping("/hi")
	public String hi() {
		String str = "Hello World!";
		System.out.println(str);
		return str;
	}
}
