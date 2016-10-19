package com.hzq.shop.utils;

import javax.servlet.http.HttpSession;

public class SessionUtil {
	public static HttpSession session;

	public static HttpSession getSession() {
		return session;
	}
	public static void setSession(HttpSession _session) {
		session = _session;
	}
}
