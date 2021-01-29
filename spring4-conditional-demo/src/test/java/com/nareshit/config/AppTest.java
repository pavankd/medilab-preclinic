/**
 * 
 */
package com.nareshit.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * @author nsanda
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {AppConfig.class},loader=AnnotationConfigContextLoader.class)
public class AppTest {

	@Autowired
	private ApplicationContext context;
	
	@Test
	public void testDao() {
		DatabaseDao dao = context.getBean(DatabaseDao.class);
		System.out.println(dao.findUsers());
	}
	
}
