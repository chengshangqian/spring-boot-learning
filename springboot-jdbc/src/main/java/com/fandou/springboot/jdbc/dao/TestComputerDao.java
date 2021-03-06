/**   
 * @Title: ComputerDao.java 
 * @Package com.fandou.springboot.jdbc.dao
 * @Copyright: ©2019
 * @Company: Fandou Technology Co., Ltd.
 * @author 成尚谦
 * @email chengshangqian@foxmail.com
 * @date 2019年10月30日 下午6:14:59
 * @version V0.0.1  
 */
package com.fandou.springboot.jdbc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fandou.springboot.jdbc.model.Computer;

/**
 * @Title: TestComputerDao
 * @Description: TODO(一句话描述该类的业务或功能)  
 * @Copyright: ©2019
 * @Company: Fandou Technology Co., Ltd.
 * @author 成尚谦
 * @email chengshangqian@foxmail.com
 * @date 2019年10月30日 下午6:14:59
 * @version V0.0.1
 */
@Repository
public class TestComputerDao {
	private Logger logger = LogManager.getLogger(TestComputerDao.class);
	@Resource(name="testJdbcTemplate")
	JdbcTemplate testJdbcTemplate;
	
	public int addComputer(Computer computer) {
		int i = testJdbcTemplate.update("insert into computer(name,model) values (?,?)", computer.getName(),computer.getModel());
		logger.debug("testJdbcTemplate computer.id => " + computer.getId());
		return i;
	}
	
	public int updateComputer(Computer computer) {
		return testJdbcTemplate.update("update computer set name = ?,model = ? where id = ?", computer.getName(),computer.getModel(),computer.getId());
	}
	
	public int deleteComputer(Integer id) {
		return testJdbcTemplate.update("delete from computer where id = ?", id);
	}
	
	public Computer getComputer(Integer id) {
		return testJdbcTemplate.queryForObject("select id,name,model from computer where id = ?", new BeanPropertyRowMapper<>(Computer.class), id);
	}
	
	public List<Computer> getAllComputers() {
		return testJdbcTemplate.query("select id,name,model from computer", new BeanPropertyRowMapper<>(Computer.class));
	}
}
