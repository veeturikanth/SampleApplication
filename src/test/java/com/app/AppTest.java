package com.app;

import org.junit.Assert;
import org.junit.Test;

import com.app.App;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testApp() {
		App appObject = new App();
		Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
	}
}
