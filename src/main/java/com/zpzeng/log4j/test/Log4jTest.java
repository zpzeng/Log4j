/*
 * @(#)Log4jTest.java
 *
 * Copyright (c) 2015-2016 Knight
 * 2999 North ReMin Road, SongJiang, ShangHai, China.
 * All Rights Reserved.
 *
 * The software's copyright statement...
 */

package com.zpzeng.log4j.test;

import org.apache.log4j.Logger;

/**
 *<code>Log4jTest.java</code>
 *
 *@version 1.0 
 *@author knight
 */

public class Log4jTest {
	
	public static final Logger log = Logger.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		log.debug("我是一条debug日志");
		log.info("我是一条info日志");
		log.warn("我是一条warn日志");
		log.error("我是一条error日志");
	}

}
