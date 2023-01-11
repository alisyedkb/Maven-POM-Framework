package util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

	private static final Logger Log = LogManager.getLogger(Log.class);

	public static void info(String message) {
		Log.info(message);
	}

	public static void warn(String messsage) {
		Log.warn(messsage);
	}

	public static void error(String messsage) {
		Log.error(messsage);
	}

	public static void fatal(String messsage) {
		Log.fatal(messsage);
	}

	public static void debug(String messsage) {
		Log.debug(messsage);
	}

}
