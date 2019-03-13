package org.spring.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.dao.cluster.CityDao;
import org.spring.springboot.dao.master.UserDao;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 文件名：TestUser.java
 * 描述：
 * 作者：KJ00019
 * 日期：2018年11月22日下午3:36:46
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestUser {

	@Autowired
	private UserDao userDao;

	@Autowired
	private CityDao cityDao;

	@Test
	public void queryMerConfigTest() {

		User user = userDao.findByName("master_123223");

		System.out.println(user.getDescription());

		City city = cityDao.findByName("深圳");

		System.out.println(city.getDescription());

	}

}
