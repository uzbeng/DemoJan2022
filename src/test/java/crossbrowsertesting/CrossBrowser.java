package crossbrowsertesting;

import org.testng.annotations.Test;

import base_setup.Base;

public class CrossBrowser extends Base {

	@Test
	public void test() {
		driver.get(url);
	}

}
