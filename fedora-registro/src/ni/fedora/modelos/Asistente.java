package ni.fedora.modelos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@javax.persistence.Entity(name = "Asistente")
@Table(appliesTo = "Asistente")
public class Asistente implements java.io.Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7042441459011942010L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer  Id;
    private String  primeroNombre	    = "";
    private String  segundoNomubre	    = "";
    private String  primerApellido	    = "";
    private String  segundoApellido	    = "";
    private String  correElectronico	    = "";
    private boolean deseaRecibirInformacion = false;
    private boolean yaEsMiembro;
    private int	    comoSupoDelEnvento	    = 0;
    private String  comentario		    = "";

    /**
     * @return the primeroNombre
     */
    public String getPrimeroNombre() {
	return primeroNombre;
    }

    /**
     * @param primeroNombre
     *            the primeroNombre to set
     */
    public void setPrimeroNombre(String primeroNombre) {
	this.primeroNombre = primeroNombre;
    }

    /**
     * @return the segundoNomubre
     */
    public String getSegundoNomubre() {
	return segundoNomubre;
    }

    /**
     * @param segundoNomubre
     *            the segundoNomubre to set
     */
    public void setSegundoNomubre(String segundoNomubre) {
	this.segundoNomubre = segundoNomubre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
	return primerApellido;
    }

    /**
     * @param primerApellido
     *            the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
	this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
	return segundoApellido;
    }

    /**
     * @param segundoApellido
     *            the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
	this.segundoApellido = segundoApellido;
    }

    /**
     * @return the correElectronico
     */
    public String getCorreElectronico() {
	return correElectronico;
    }

    /**
     * @param correElectronico
     *            the correElectronico to set
     */
    public void setCorreElectronico(String correElectronico) {
	this.correElectronico = correElectronico;
    }

    /**
     * @return the deseaRecibirInformacion
     */
    public boolean isDeseaRecibirInformacion() {
	return deseaRecibirInformacion;
    }

    /**
     * @param deseaRecibirInformacion
     *            the deseaRecibirInformacion to set
     */
    public void setDeseaRecibirInformacion(boolean deseaRecibirInformacion) {
	this.deseaRecibirInformacion = deseaRecibirInformacion;
    }

    /**
     * @return the yaEsMiembro
     */
    public boolean isYaEsMiembro() {
	return yaEsMiembro;
    }

    /**
     * @param yaEsMiembro
     *            the yaEsMiembro to set
     */
    public void setYaEsMiembro(boolean yaEsMiembro) {
	this.yaEsMiembro = yaEsMiembro;
    }

    /**
     * @return the comoSupoDelEnvento
     */
    public int getComoSupoDelEnvento() {
	return comoSupoDelEnvento;
    }

    /**
     * @param comoSupoDelEnvento
     *            the comoSupoDelEnvento to set
     */
    public void setComoSupoDelEnvento(int comoSupoDelEnvento) {
	this.comoSupoDelEnvento = comoSupoDelEnvento;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
	return comentario;
    }

    /**
     * @param comentario
     *            the comentario to set
     */
    public void setComentario(String comentario) {
	this.comentario = comentario;
    }

    public String toLinea() {
	String cadena = "";
	cadena = "Nombres: '" + getPrimeroNombre() + "',  Apellidos: '" + getPrimerApellido() + "', email: '" + getCorreElectronico() + "', comentario: '" + getComentario()
	        + "'; ";
	return cadena;
    }

}
