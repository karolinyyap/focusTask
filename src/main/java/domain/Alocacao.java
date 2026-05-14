package domain;

import jakarta.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Karoliny
 */
@Entity
@Table
public class Alocacao implements Serializable{

    @EmbeddedId
    private AlocacaoPK id;

    public Alocacao() {
    }

    public Alocacao(AlocacaoPK id) {
        this.id = id;
    }

    public AlocacaoPK getId() {
        return id;
    }

    public void setId(AlocacaoPK id) {
        this.id = id;
    }
}
