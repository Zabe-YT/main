package com.zabe.mcr.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.zabe.mcr.mcr;

public class Utils {
	
	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(mcr.MODID);
		}
		return logger;
	}

}
