package weno.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import weno.helpers.conDB;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		conDB uwu= new conDB();
		
		uwu.DBConnection();
		uwu.nregistro(request.getParameter("Nombre"), request.getParameter("Usuario"), request.getParameter("Correo"),request.getParameter("Cedula"), request.getParameter("Telefono"), request.getParameter("Contrasena"));
		uwu.end();		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("LOQUESEA");
	}

}
