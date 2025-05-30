package TestNgExecution;

import org.testng.annotations.Test;

public class SmokeTest {
	@Test(groups="smoke")
	public void createContactTest() {
		System.out.println("execute contacttest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute modify contacttest");
	}

}
