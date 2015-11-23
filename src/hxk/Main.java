package hxk;

import org.apache.log4j.Logger;

/**
 * @author hxk
 * @description
 *2015年11月23日  下午3:28:55
 */
public class Main {
    public static void main(String[] args) {
	Logger logger = Logger.getLogger("MailLog");
	logger.warn("warn");
	try {
	    System.out.println(1/0);
	} catch (Exception e) {
	    logger.error("divisor can't be zero", e);
	}
	
	System.out.println("end");
    }
}
