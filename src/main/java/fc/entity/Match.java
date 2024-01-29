
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
* Classe que representa a tabela MATCH
* @generated
*/
@Entity
@Table(name = "\"MATCH\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("fc.entity.Match")
public class Match implements Serializable {
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
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "playDate", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.util.Date playDate;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_team_1", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "", foreignKeyDefinition = "FOREIGN KEY (fk_team_1) REFERENCES TEAM (id)"))
        
        private Team team1;


    /**
    * @generated
    */
    @Column(name = "team1Score", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short team1Score;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_team_2", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "", foreignKeyDefinition = "FOREIGN KEY (fk_team_2) REFERENCES TEAM (id)"))
        
        private Team team2;


    /**
    * @generated
    */
    @Column(name = "team2Score", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Short team2Score;


    /**
    * @generated
    */
    @Column(name = "finished", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean finished;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_round", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = "", foreignKeyDefinition = "FOREIGN KEY (fk_round) REFERENCES ROUND (id)"))
        
        private Round round;


    /**
    * Construtor
    * @generated
    */
    public Match(){
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
    public Match setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém playDate
    * return playDate
    * @generated
    */
    public java.util.Date getPlayDate() {
        return this.playDate;
    }

    /**
    * Define playDate
    * @param playDate playDate
    * @generated
    */
    public Match setPlayDate(java.util.Date playDate) {
        this.playDate = playDate;
        return this;
    }
    /**
    * Obtém team1
    * return team1
    * @generated
    */
    public Team getTeam1() {
        return this.team1;
    }

    /**
    * Define team1
    * @param team1 team1
    * @generated
    */
    public Match setTeam1(Team team1) {
        this.team1 = team1;
        return this;
    }
    /**
    * Obtém team1Score
    * return team1Score
    * @generated
    */
    public java.lang.Short getTeam1Score() {
        return this.team1Score;
    }

    /**
    * Define team1Score
    * @param team1Score team1Score
    * @generated
    */
    public Match setTeam1Score(java.lang.Short team1Score) {
        this.team1Score = team1Score;
        return this;
    }
    /**
    * Obtém team2
    * return team2
    * @generated
    */
    public Team getTeam2() {
        return this.team2;
    }

    /**
    * Define team2
    * @param team2 team2
    * @generated
    */
    public Match setTeam2(Team team2) {
        this.team2 = team2;
        return this;
    }
    /**
    * Obtém team2Score
    * return team2Score
    * @generated
    */
    public java.lang.Short getTeam2Score() {
        return this.team2Score;
    }

    /**
    * Define team2Score
    * @param team2Score team2Score
    * @generated
    */
    public Match setTeam2Score(java.lang.Short team2Score) {
        this.team2Score = team2Score;
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
    public Match setFinished(java.lang.Boolean finished) {
        this.finished = finished;
        return this;
    }
    /**
    * Obtém round
    * return round
    * @generated
    */
    public Round getRound() {
        return this.round;
    }

    /**
    * Define round
    * @param round round
    * @generated
    */
    public Match setRound(Round round) {
        this.round = round;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Match object = (Match)obj;
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