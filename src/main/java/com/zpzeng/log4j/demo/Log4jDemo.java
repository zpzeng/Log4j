/*
 * @(#)Log4jDemo.java
 *
 * Copyright (c) 2015-2016 Knight
 * 2999 North ReMin Road, SongJiang, ShangHai, China.
 * All Rights Reserved.
 *
 * The software's copyright statement...
 */

package com.zpzeng.log4j.demo;

import org.apache.log4j.Logger;

/**
 *<code>Log4jDemo.java</code>
 *
 *@version 1.0 
 *@author knight
 */

public class Log4jDemo {
	
	public static final Logger log = Logger.getLogger("com.zpzeng.log4j.demo");
	
	public static void main(String[] args) {
		log.debug(Log4jDemo.class.getName() + ": 我是一条debug日志");
		log.info(Log4jDemo.class.getName() + ": 我是一条info日志");
		log.warn(Log4jDemo.class.getName() + ": 我是一条warn日志");
		log.error(Log4jDemo.class.getName() + ": 我是一条error日志");
	}

}
