/**
 * 
 */
package ni.fedora.dao;

import java.util.List;

import org.hibernate.Session;

import ni.fedora.dao.conexion.HibernateUtil;
import ni.fedora.modelos.Asistente;

/**
 * @author lkf
 *
 */
public class AsistenteDAO {

    public static void createAsistente(Asistente asistente) {
	System.out.println("Hibernate one to one (XML mapping)");
	Session session = HibernateUtil.getSessionFactory().openSession();

	session.getTransaction().begin();
	session.save(asistente);
	session.getTransaction().commit();
    }

    public static List<Asistente> getList() {
	Session session = HibernateUtil.getSessionFactory().openSession();

	List<Asistente> result = session.createQuery("FROM Asistente").getResultList();
	session.close();
	return result;
    }
}
