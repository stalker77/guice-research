/*
 * Copyright (c) 2018 Evgeny Dobrokvashin, All Rights Reserved.
 */

package ru.dobrokvashinevgeny.research.weld.infrastructure.presentation;

import ru.dobrokvashinevgeny.research.weld.infrastructure.Application;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

/**
 * Класс MainEntryPointServlet
 */
@WebServlet("/test")
public class MainEntryPointServlet extends HttpServlet {
	@Inject
	private Application application;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter printWriter = resp.getWriter();
		application.run(printWriter);
	}
}