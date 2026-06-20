
package domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Karoliny
 */
public class UsuarioEquipePK implements Serializable{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_equipe")
    private Equipe equipe;

    public UsuarioEquipePK(Usuario usuario, Equipe equipe) {
        this.usuario = usuario;
        this.equipe = equipe;
    }

    public UsuarioEquipePK() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        UsuarioEquipePK other = (UsuarioEquipePK) obj;

        return Objects.equals(usuario, other.usuario)
                && Objects.equals(equipe, other.equipe);
    }
}
