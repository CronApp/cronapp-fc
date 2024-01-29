
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
* Classe que representa a tabela SESSION
* @generated
*/
@Entity
@Table(name = "\"SESSION\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("fc.entity.Session")
public class Session implements Serializable {
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
    @Column(name = "year", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short year;


    /**
    * @generated
    */
    @Column(name = "finished", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean finished;


    /**
    * Construtor
    * @generated
    */
    public Session(){
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
    public Session setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém year
    * return year
    * @generated
    */
    public java.lang.Short getYear() {
        return this.year;
    }

    /**
    * Define year
    * @param year year
    * @generated
    */
    public Session setYear(java.lang.Short year) {
        this.year = year;
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
    public Session setFinished(java.lang.Boolean finished) {
        this.finished = finished;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Session object = (Session)obj;
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