package utils;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MyIpServiceTest {
	private HttpDataService httpDataServiceMock;
	private MyIpService ipService;
	
	@Before
	public void before() {
		httpDataServiceMock = Mockito.mock(HttpDataService.class);
		Mockito.when(httpDataServiceMock.getJsonIp()).thenReturn("{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Impeach Trump!\"}");
		ipService = new MyIpService(httpDataServiceMock);
	}

	@Test
	public void getMyIpTest() {
		Assert.assertThat(ipService.getMyIp(), IsEqual.equalTo("92.154.66.22"));
		Mockito.verify(httpDataServiceMock).getJsonIp();
	}
}
