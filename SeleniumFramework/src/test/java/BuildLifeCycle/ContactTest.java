package BuildLifeCycle;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		
		String URL=System.getProperty("url");
		String Browser=System.getProperty("browser");
		
		System.out.println(URL);
		System.out.println(Browser);
		System.out.println("execute contacttest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute modify contacttest");
	}
}
