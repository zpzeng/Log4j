/*
 * @(#)NDCAndMDCTest.java
 *
 * Copyright (c) 2015-2016 Knight
 * 2999 North ReMin Road, SongJiang, ShangHai, China.
 * All Rights Reserved.
 *
 * The software's copyright statement...
 */

package com.zpzeng.log4j.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.apache.log4j.MDC;
import org.apache.log4j.NDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <code>NDCAndMDCTest.java</code>为测试NDC与MDC获取远程主机信
 *
 * @version 1.0
 * @author knight
 */
@Controller
@RequestMapping(value = "/ndcAndmdc")
public class NDCAndMDCTest {

	private static final Logger log = Logger.getLogger(NDCAndMDCTest.class);

	/**
	 * 测试NDC获取主机信息的方法
	 * 
	 * @param request
	 *            代表客户端请求
	 * @param response
	 *            代表服务器响应
	 */
	@RequestMapping(value = "/ndcTest")
	public void ndcTest(HttpServletRequest request, HttpServletResponse response) {
		NDC.push(request.getRemoteAddr());
		log.debug("我是一条DEBUG日志");
		log.info("我是一条INFO日志");
		log.warn("我是一条WARN日志");
		log.error("我是一条ERROR日志");
		NDC.pop();
		NDC.remove();
	}

	/**
	 * 测试MDC获取主机信息的方法
	 * 
	 * @param request
	 *            代表客户端请求
	 * @param response
	 *            代表服务器响应
	 */
	@RequestMapping(value = "/mdcTest")
	public void mdcTest(HttpServletRequest request, HttpServletResponse response) {
		MDC.put("remoteAddr", request.getRemoteAddr());
		log.debug("我是一条DEBUG日志");
		log.info("我是一条INFO日志");
		log.warn("我是一条WARN日志");
		log.error("我是一条ERROR日志");
		MDC.get("remoteAddr");
		MDC.remove("remoteAddr");
	}

}
