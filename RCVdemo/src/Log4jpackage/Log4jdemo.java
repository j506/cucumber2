package Log4jpackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class Log4jdemo {
	static Logger logger;
	@Test(priority=1)
	public void setup()
	{
		logger=logger.getLogger("Log4jdemo");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("set up method is started");
		logger.info("set up method is progress");
		System.out.println("complate your set up configuration");
		System.out.println("set up driver object");
	}
	@Test(priority=2)
	public void login()
	{
		logger.info("login is started");
		System.out.println("login the page");
		logger.info("Login is progressed");
		logger.info("Login is completed");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout the page");
		logger.info("Logout is completed");
	}

}
