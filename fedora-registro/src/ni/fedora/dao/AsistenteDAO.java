/**
 * 
 */
package ni.fedora.dao;

import org.hibernate.Session;

import ni.fedora.dao.conexion.HibernateUtil;
import ni.fedora.modelos.Asistente;

/**
 * @author lkf
 *
 */
public class AsistenteDAO {

    public static void createAsistente(Asistente asistente){
	System.out.println("Hibernate one to one (XML mapping)");
	Session session = HibernateUtil.getSessionFactory().openSession();
	
	session.getTransaction().begin();
	session.save(asistente);
	session.getTransaction().commit();
    }
}
