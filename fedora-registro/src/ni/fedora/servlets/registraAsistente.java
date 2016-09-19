package ni.fedora.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ni.fedora.dao.AsistenteDAO;
import ni.fedora.modelos.Asistente;

/**
 * Servlet implementation class registraAsistente
 */
@WebServlet(description = "Graba un asistente", urlPatterns = { "/registraAsistente" })
public class registraAsistente extends HttpServlet {
    private static final long serialVersionUID = 1L;



    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("entro a DoGet");
	try {
	    // grabando
	    Asistente a = new Asistente();
	    a.setPrimeroNombre("omar");
	    a.setSegundoNomubre("danilo");
	    AsistenteDAO.createAsistente(a);
	    
	} catch (Exception e) {
	    e.printStackTrace();
	}
	// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("entro a doPOST");
	
	// TODO Auto-generated method stub
	doGet(request, response);
	
    }

}
