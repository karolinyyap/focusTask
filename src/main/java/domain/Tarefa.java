package domain;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    @Column
    private Date dataInicio;

    @Column
    private Date dataLimite;

    @OneToMany(mappedBy = "id.tarefa", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Alocacao> alocacoes;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @Enumerated
    private Status status;

    @Enumerated
    private Prioridade prioridade;

    public Tarefa(int id, String nome, Date dataInicio, Date dataLimite, List<Alocacao> alocacoes, Categoria categoria, Status status, Prioridade prioridade) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataLimite = dataLimite;
        this.alocacoes = alocacoes;
        this.categoria = categoria;
        this.status = status;
        this.prioridade = prioridade;
    }

    public Tarefa() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public List<Alocacao> getAlocacoes() {
        return alocacoes;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Status getStatus() {
        return status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    public void setAlocacoes(List<Alocacao> alocacoes) {
        this.alocacoes = alocacoes;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Transient
    public List<Equipe> getEquipes() {

        List<Equipe> equipes = new ArrayList<>();

        for (Alocacao a : alocacoes) {
            equipes.add(a.getId().getEquipe());
        }

        return equipes;
    }

}
