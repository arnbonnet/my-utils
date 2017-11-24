package app;

import java.util.logging.Logger;

import utils.HttpDataService;
import utils.MyIpService;

public class MyMain {
	private static Logger logger = Logger.getAnonymousLogger();

	public static void main(String[] args) {
		HttpDataService httpDataService = new HttpDataService();
		MyIpService ipService = new MyIpService(httpDataService);
		logger.info(ipService.getMyIp());

	}

}
