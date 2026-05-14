package domain;

import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Karoliny
 */
@Entity
@Table
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column
    private String setor;

    @OneToMany(mappedBy = "id.equipe", fetch = FetchType.LAZY)
    private List<Alocacao> alocacoes;
    
    @OneToMany(mappedBy = "id.equipe", fetch = FetchType.LAZY)
    private List<UsuarioEquipe> historicoUsuarios;

    public Equipe(int id, String nome, String setor, List<Alocacao> alocacoes) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
        this.alocacoes = alocacoes;
    }


    public Equipe() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public List<Alocacao> getAlocacoes() {
        return alocacoes;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setAlocacoes(List<Alocacao> alocacoes) {
        this.alocacoes = alocacoes;
    }

    
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Equipe other = (Equipe) obj;
        return this.id == other.id;
    }
}
