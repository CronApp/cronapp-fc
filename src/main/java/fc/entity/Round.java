
package fc.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;


/**
* Classe que representa a tabela ROUND
* @generated
*/
@Entity
@Table(name = "\"ROUND\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("fc.entity.Round")
public class Round implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Column(name = "number", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short number;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "stard", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date stard;


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date end;


    /**
    * @generated
    */
    @Column(name = "finished", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean finished;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_session", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "", foreignKeyDefinition = "FOREIGN KEY (fk_session) REFERENCES SESSION (id)"))
        
        private Session session;


    /**
    * Construtor
    * @generated
    */
    public Round(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Round setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém number
    * return number
    * @generated
    */
    public java.lang.Short getNumber() {
        return this.number;
    }

    /**
    * Define number
    * @param number number
    * @generated
    */
    public Round setNumber(java.lang.Short number) {
        this.number = number;
        return this;
    }
    /**
    * Obtém stard
    * return stard
    * @generated
    */
    public java.util.Date getStard() {
        return this.stard;
    }

    /**
    * Define stard
    * @param stard stard
    * @generated
    */
    public Round setStard(java.util.Date stard) {
        this.stard = stard;
        return this;
    }
    /**
    * Obtém end
    * return end
    * @generated
    */
    public java.util.Date getEnd() {
        return this.end;
    }

    /**
    * Define end
    * @param end end
    * @generated
    */
    public Round setEnd(java.util.Date end) {
        this.end = end;
        return this;
    }
    /**
    * Obtém finished
    * return finished
    * @generated
    */
    public java.lang.Boolean getFinished() {
        return this.finished;
    }

    /**
    * Define finished
    * @param finished finished
    * @generated
    */
    public Round setFinished(java.lang.Boolean finished) {
        this.finished = finished;
        return this;
    }
    /**
    * Obtém session
    * return session
    * @generated
    */
    public Session getSession() {
        return this.session;
    }

    /**
    * Define session
    * @param session session
    * @generated
    */
    public Round setSession(Session session) {
        this.session = session;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Round object = (Round)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}