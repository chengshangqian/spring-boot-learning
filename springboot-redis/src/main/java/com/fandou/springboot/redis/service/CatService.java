/**   
 * @Title: CatService.java 
 * @Package com.fandou.springboot.redis.service 
 * @Copyright: ©2019
 * @Company: Fandou Technology Co., Ltd.
 * @author 成尚谦
 * @email chengshangqian@foxmail.com
 * @date 2019年10月31日 下午12:04:21
 * @version V0.0.1  
 */
package com.fandou.springboot.redis.service;

import com.fandou.springboot.redis.model.Cat;

/**
 * @Title: CatService
 * @Description: TODO(一句话描述该类的业务或功能)  
 * @Copyright: ©2019
 * @Company: Fandou Technology Co., Ltd.
 * @author 成尚谦
 * @email chengshangqian@foxmail.com
 * @date 2019年10月31日 下午12:04:21
 * @version V0.0.1
 */
public interface CatService {
	Cat get(Long id);
	void create(Cat cat);
	void update(Cat cat);
	void delete(Long id);
}
