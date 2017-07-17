package org.codelabor.example.context.support;

import org.codelabor.example.helloworld.service.HelloWorldService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextTest {
	private static final Logger logger = LoggerFactory.getLogger(ClassPathXmlApplicationContextTest.class);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=BeanDefinitionStoreException.class)
	public void testClassPathXmlApplicationContextString1() {
		String configLocation = "applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAbsPath1() {
		String configLocation = "META-INF/module1/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test(expected=BeanDefinitionStoreException.class)
	public void testClassPathXmlApplicationContextStringWithPrefix1() {
		String configLocation = "classpath:applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAbsPathWithPrefix1() {
		String configLocation = "classpath:META-INF/module1/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test(expected=NoSuchBeanDefinitionException.class)
	public void testClassPathXmlApplicationContextStringWithWildcardPrefix1() {
		String configLocation = "classpath*:applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAbsPathWithWildcardPrefix1() {
		String configLocation = "classpath*:META-INF/module1/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAntPath1() {
		String configLocation = "**/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAntPathAbsPath1() {
		String configLocation = "META-INF/module1/**/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAntPathWithPrefix1() {
		String configLocation = "classpath:**/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAntPathAbsPathWithPrefix1() {
		String configLocation = "classpath:**/META-INF/module1/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAntPathWithWildcardPrefix1() {
		String configLocation = "classpath*:**/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

	@Test
	public void testClassPathXmlApplicationContextStringAntPathAbsPathWithWildcardPrefix1() {
		String configLocation = "classpath*:**/META-INF/module1/applicationContext1.xml";
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation)) {
			HelloWorldService helloWorldService = applicationContext.getBean("helloWorldService1",
					HelloWorldService.class);
			logger.info(helloWorldService.sayHello());
		}
	}

}
