
package fc.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela SESSION
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"SESSION\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("fc.entity.Session")
@CronappTable(role=CronappTableRole.CLASS)
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
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="SHORT", label="Year")
    @Column(name = "year_col", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short year;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Finished")
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
