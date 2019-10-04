package com.stackroute.Movie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration({"classpath*:spring/applicationContext.xml"})
public class MovieApplicationTests {

	@Test
	public void contextLoads() {

	}


}
