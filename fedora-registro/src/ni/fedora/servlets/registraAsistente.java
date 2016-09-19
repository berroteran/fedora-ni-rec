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
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("entro a doPOST");

	String pname = request.getParameter("form-first-name") == null ? "" : request.getParameter("form-first-name").toString();
	String papellido = request.getParameter("form-last-name") ==  null? "" : request.getParameter("form-last-name").toString();
	String pemail = request.getParameter("form-email") == null ? "": request.getParameter("form-email").toString();
	String pdatos = request.getParameter("form-about-yourself") == null ? "" : request.getParameter("form-about-yourself").toString();

	try {
	    // grabando
	    Asistente a = new Asistente();
	    a.setPrimeroNombre(pname);
	    a.setSegundoNomubre("");
	    a.setPrimerApellido(papellido);
	    a.setCorreElectronico( pemail );
	    a.setComentario( pdatos);;
	    AsistenteDAO.createAsistente(a);
		// TODO Auto-generated method stub
		response.getWriter().append("{'type':'success','message':'Registro Guardado' }");

	} catch (Exception e) {
	    e.printStackTrace();
	    // TODO Auto-generated method stub
		response.getWriter().append("{'type':'fail','message':'"+e.getMessage()+"' }");
	}
    }

}
