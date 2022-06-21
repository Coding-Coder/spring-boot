package com.lxy;

import com.lxy.config.EnableRegisterServer;
import com.lxy.entity.SimpleBean;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableRegisterServer
class LxySpringBootStarterTestsApplicationTests {

	@Autowired
	private SimpleBean simpleBean;

	@Test
	public void testSimpleBean() {
		System.out.println(simpleBean);
	}

}
