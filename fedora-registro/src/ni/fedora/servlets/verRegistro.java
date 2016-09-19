package ni.fedora.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ni.fedora.dao.AsistenteDAO;
import ni.fedora.modelos.Asistente;

/**
 * Servlet implementation class verRegistro
 */
@WebServlet(description = "Muestra los registros actuales", urlPatterns = { "/verRegistro" })
public class verRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    List<Asistente> lista = AsistenteDAO.getList();
	    
	    for (int i=0;i<lista.size();i++){
		response.getWriter().append( "Registro ("+i+") " + ((Asistente) lista.get(i)).toLinea() +" \n " );
	    }
	}

}
