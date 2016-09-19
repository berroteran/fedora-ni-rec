package ni.fedora.modelos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int iduser = 0;
    private String login = "";
    
}
