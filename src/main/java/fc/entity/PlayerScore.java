
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
* Classe que representa a tabela PLAYERSCORE
* @generated
*/
@Entity
@Table(name = "\"PLAYERSCORE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("fc.entity.PlayerScore")
public class PlayerScore implements Serializable {
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
    @Column(name = "description", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String description;


    /**
    * @generated
    */
    @Column(name = "movePrice", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double movePrice;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_player", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "", foreignKeyDefinition = "FOREIGN KEY (fk_player) REFERENCES PLAYER (id)"))
        
        private Player player;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_match", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "", foreignKeyDefinition = "FOREIGN KEY (fk_match) REFERENCES MATCH (id)"))
        
        private Match match;


    /**
    * Construtor
    * @generated
    */
    public PlayerScore(){
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
    public PlayerScore setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém description
    * return description
    * @generated
    */
    public java.lang.String getDescription() {
        return this.description;
    }

    /**
    * Define description
    * @param description description
    * @generated
    */
    public PlayerScore setDescription(java.lang.String description) {
        this.description = description;
        return this;
    }
    /**
    * Obtém movePrice
    * return movePrice
    * @generated
    */
    public java.lang.Double getMovePrice() {
        return this.movePrice;
    }

    /**
    * Define movePrice
    * @param movePrice movePrice
    * @generated
    */
    public PlayerScore setMovePrice(java.lang.Double movePrice) {
        this.movePrice = movePrice;
        return this;
    }
    /**
    * Obtém player
    * return player
    * @generated
    */
    public Player getPlayer() {
        return this.player;
    }

    /**
    * Define player
    * @param player player
    * @generated
    */
    public PlayerScore setPlayer(Player player) {
        this.player = player;
        return this;
    }
    /**
    * Obtém match
    * return match
    * @generated
    */
    public Match getMatch() {
        return this.match;
    }

    /**
    * Define match
    * @param match match
    * @generated
    */
    public PlayerScore setMatch(Match match) {
        this.match = match;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PlayerScore object = (PlayerScore)obj;
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