package org.codelabor.example.context.support;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathXmlApplicationContextTest {

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

	@Test
	public void testClassPathXmlApplicationContextString1() {
		String configLocation = "applicationContext1.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextString2() {
		String configLocation = "applicationContext2.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextStringAbsPath1() {
		String configLocation = "module1/applicationContext1.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextStringAbsPath2() {
		String configLocation = "module2/applicationContext2.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextStringWithPrefix1() {
		String configLocation = "classpath:applicationContext1.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextStringWithPrefix2() {
		String configLocation = "classpath:applicationContext2.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextStringWithWildcardPrefix1() {
		String configLocation = "classpath*:applicationContext1.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextStringWithWildcardPrefix2() {
		String configLocation = "classpath*:applicationContext2.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextStringWithWildcardPrefix3() {
		String configLocation = "classpath*:applicationContext3.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

	@Test
	public void testClassPathXmlApplicationContextStringWithWildcardPrefix4() {
		String configLocation = "classpath*:applicationContext4.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
	}

}
