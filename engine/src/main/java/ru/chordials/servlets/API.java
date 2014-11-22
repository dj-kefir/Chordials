package ru.chordials.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class API
 */
public class API extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public API() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String artist = request.getParameter("artist");
		String album = request.getParameter("album");
		String song = request.getParameter("song");
        String hash = request.getParameter("hash");
        String lhash = request.getParameter("lhash"); // lyrics hash
        
        int status_code = 404;
        
        if(hash != null) {
        	switch(hash.toLowerCase()) {
        	case "1":
        		status_code = 200;
        		break;	
        	}
        }
        
        response.setContentType("text/xml");
        PrintWriter out = response.getWriter();
        
        out.println("<RESPONSE><STATUS_CODE>" + Integer.toString(status_code) + "</STATUS_CODE></RESPONSE>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
