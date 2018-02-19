import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.qa.app.Service;

public class AccountTests {
	private Service serv;
	@Before
	public void setUp() {
	}
	@Test
	public void searchTestpass() {
		serv = new Service();
		serv.addAccount("Niall", "Mulready");
		serv.addAccount("Sean", "McGee");
		serv.addAccount("Hannah", "Mitchell");
		int accntNum = serv.searchForAccntByName("Niall");
		System.out.println(accntNum);
		Assert.assertEquals(1, accntNum);
	}

}
