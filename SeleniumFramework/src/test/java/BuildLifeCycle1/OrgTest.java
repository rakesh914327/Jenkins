package BuildLifeCycle1;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups="smoke")
	public void createOrgTest() {
		System.out.println("execute Orgtest");
	}
	@Test
	public void modifyOrgTest() {
		System.out.println("execute  modify Orgtest");
	
	}
	@Test
	public void modifyTest() {
		System.out.println("execute  modify Orgtest");
	
	}

}

