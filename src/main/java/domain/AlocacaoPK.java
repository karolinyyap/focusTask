package domain;

/**
 *
 * @author Karoliny
 */
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AlocacaoPK implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tarefa")
    private Tarefa tarefa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_equipe")
    private Equipe equipe;

    public AlocacaoPK() {
    }

    public AlocacaoPK(Tarefa tarefa, Equipe equipe) {
        this.tarefa = tarefa;
        this.equipe = equipe;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tarefa, equipe);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        AlocacaoPK other = (AlocacaoPK) obj;

        return Objects.equals(tarefa, other.tarefa)
                && Objects.equals(equipe, other.equipe);
    }
}
