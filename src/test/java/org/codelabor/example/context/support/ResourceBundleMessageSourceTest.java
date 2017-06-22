package org.codelabor.example.context.support;

import static org.junit.Assert.fail;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("/META-INF/messageSource.xml")
public class ResourceBundleMessageSourceTest {
	private Logger logger = LoggerFactory.getLogger(ResourceBundleMessageSourceTest.class);

	@Autowired
	private MessageSource messageSource;

	@Test
	public void testGetMessageStringObjectArrayStringLocale() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMessageStringObjectArrayLocale() {
		logger.info("default locale: {}", Locale.getDefault());

		String messageKorean = messageSource.getMessage("code1", null, Locale.KOREAN);
		logger.info("code1(Locale.KOREAN): {}", messageKorean);

		String messageEnglish = messageSource.getMessage("code1", null, Locale.ENGLISH);
		logger.info("code1(Locale.ENGLISH): {}", messageEnglish);

		String messageUS = messageSource.getMessage("code1", null, Locale.US);
		logger.info("code1(Locale.US): {}", messageUS);

		String messageUK = messageSource.getMessage("code1", null, Locale.UK);
		logger.info("code1(Locale.UK): {}", messageUK);
	}

	@Test
	public void testGetMessageMessageSourceResolvableLocale() {
		fail("Not yet implemented");
	}

}
