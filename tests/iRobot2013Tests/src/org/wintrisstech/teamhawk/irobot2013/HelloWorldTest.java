package org.wintrisstech.teamhawk.irobot2013;

import junit.framework.Assert;
import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

	public void testSayHello() {
		Assert.assertEquals("hello", new HelloWorld().sayHello());
	}

}
