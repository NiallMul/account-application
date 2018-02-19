import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.app.Service;

public class AccountTests {
	private Service serv;
	@Before
	public void init() {
		serv = new Service();
		serv.addAccount("John", "Bloggs");
		serv.addAccount("Jane", "Bloggs");
		serv.addAccount("John", "Gordon");
	}
	@Test
	public void getCountForFirstNameInMap() {
		int accntNum = serv.searchForAccntByName("John");
		System.out.println(accntNum);
		Assert.assertEquals(2, accntNum);
	}
}
