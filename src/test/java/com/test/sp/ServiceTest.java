package com.test.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.sp.service.TtInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class ServiceTest {
	
	@Autowired
	private TtInfoService tis;
	
	public void listTest() {
		assertEquals(3,tis.getTtInfoList().size());
	}
	
	@Test
	public void objTest() {
		assertNotNull(tis.getTtinfo(1));
	}
}
