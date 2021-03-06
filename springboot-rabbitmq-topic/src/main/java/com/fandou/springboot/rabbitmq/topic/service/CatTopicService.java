/**   
 * @Title: CatTopicService.java 
 * @Package com.fandou.springboot.rabbitmq.direct.service 
 * @Copyright: ©2019
 * @Company: Fandou Technology Co., Ltd.
 * @author 成尚谦
 * @email chengshangqian@foxmail.com
 * @date 2019年11月4日 下午2:13:47
 * @version V0.0.1  
 */
package com.fandou.springboot.rabbitmq.topic.service;

import com.fandou.springboot.rabbitmq.model.Cat;

/**
 * @Title: CatTopicService
 * @Description: TODO(一句话描述该类的业务或功能)  
 * @Copyright: ©2019
 * @Company: Fandou Technology Co., Ltd.
 * @author 成尚谦
 * @email chengshangqian@foxmail.com
 * @date 2019年11月4日 下午2:13:47
 * @version V0.0.1
 */
public interface CatTopicService {
	void sendCat(Cat cat,String queue);
}
