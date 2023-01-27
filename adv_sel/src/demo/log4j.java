package demo;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class log4j 
{
	@Test
	public void test() throws IOException, InterruptedException
	{
		
		Layout pattern=new PatternLayout("%d %c %m %n");
		FileAppender Appender = new FileAppender(pattern,"./report.txt");
		
		BasicConfigurator.configure(Appender);
		
		Logger log = Logger.getLogger(log4j.class);
		log.error("ERROR");
		log.error("WARN");
		log.error("INFO");
		
	}
}
