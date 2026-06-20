
package domain;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author Karoliny
 */
@Entity
@Table
public class UsuarioEquipe {
    @EmbeddedId
    private UsuarioEquipePK id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaida;

    public UsuarioEquipe() {
    }

    public UsuarioEquipe(UsuarioEquipePK id) {
        this.id = id;
    }

    public UsuarioEquipePK getId() {
        return id;
    }

    public void setId(UsuarioEquipePK id) {
        this.id = id;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    
}
