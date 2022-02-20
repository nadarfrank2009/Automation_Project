package com.hooks;

import com.BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends BaseClass{

	@Before
	public void initialization() {
		SetUp();
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}
