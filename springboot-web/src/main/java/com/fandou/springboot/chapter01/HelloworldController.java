/**   
 * @Title: HelloController.java 
 * @Package com.fandou.springboot.chapter01.controller 
 * @Copyright: ©2019
 * @Company: Fandou Technology Co., Ltd.
 * @author 成尚谦
 * @email chengshangqian@foxmail.com
 * @date 2019年10月27日 下午8:13:22
 * @version V0.0.1  
 */
package com.fandou.springboot.chapter01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: HelloController
 * @Description: TODO(一句话描述该类的业务或功能)  
 * @Copyright: ©2019
 * @Company: Fandou Technology Co., Ltd.
 * @author 成尚谦
 * @email chengshangqian@foxmail.com
 * @date 2019年10月27日 下午8:13:22
 * @version V0.0.1
 */
@RestController
public class HelloworldController {
	/**
	 * @Title: hello 
	 * @Description: 一句话描述方法的作用
	 * @return
	 */
	@GetMapping("/helloworld")
	public String hello() {
		return "你好，Spring Boot！";
	}
}
