package com.geh.server.gae.app;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GEHServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		resp.getWriter().println("Maven GAE Projet");
	}
}
