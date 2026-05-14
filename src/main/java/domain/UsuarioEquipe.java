
package domain;

import jakarta.persistence.*;

/**
 *
 * @author Karoliny
 */
@Entity
@Table
public class UsuarioEquipe {
    @EmbeddedId
    private UsuarioEquipePK id;

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

    
}
