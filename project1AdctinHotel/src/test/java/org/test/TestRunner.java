package org.test;

import org.BaseClass.Base;
import org.PageObjectModel.Page1;
import org.PageObjectModel.Page2;
import org.PageObjectModel.Page3;
import org.PageObjectModel.Page4;
import org.PageObjectModel.Page5;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Page1.class,Page2.class,Page3.class,Page4.class,Page5.class})

public class TestRunner extends Base{

	@BeforeClass
	public static void beforeClass() {
		Edge();
		UrlLanuch("https://adactinhotelapp.com");
		timeout(10);
	}
	public static void afterClass() {
		driver.quit();
	}
}
