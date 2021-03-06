package com.fandou.springboot.rabbitmq;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fandou.springboot.rabbitmq.direct.service.CatDirectService;
import com.fandou.springboot.rabbitmq.model.Cat;

@SpringBootTest
public class SpringbootRabbitmqDirectApplicationTests {
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(SpringbootRabbitmqDirectApplicationTests.class);
	
	@Autowired
	CatDirectService catDirectService;

	@Test
	public void contextLoads() {
		long start = System.currentTimeMillis();
		for(int i = 1; i < 10001; i++) {
			Cat c = new Cat();
			c.setId(i);
			c.setName("Jerry::" + i);
			c.setColor("Yellow");
			catDirectService.sendCat(c);
		}
		long end = System.currentTimeMillis();
		long spentTime = end - start;
		LOGGER.debug("发送1w条消息总共花费时间  => " + (spentTime/1000) + "秒");
	}

}
