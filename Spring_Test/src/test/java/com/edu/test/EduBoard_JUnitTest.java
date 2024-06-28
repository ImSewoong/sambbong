package com.edu.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.min.edu.vo.EduBoardVo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/root-context.xml",
								"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class EduBoard_JUnitTest {

	@Autowired
	private InternalResourceViewResolver resolver;
	
	@Autowired
	private SqlSessionTemplate template;
	
	@Value("${namespace}")
	private String NS;
	
	
	@Test
	public void test() {
		assertNotNull(resolver);
	}

	@Test
	public void seletAllBoard_Test() {
		List<EduBoardVo> list = template.selectList(NS+"selectAllBoard");
		assertNotNull(list);
	}
	
}
