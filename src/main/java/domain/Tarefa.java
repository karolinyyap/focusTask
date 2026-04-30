package domain;

import java.util.Date;
import java.util.List;

public class Tarefa {

    private int idTarefa;
    private String nomeTarefa;
    private Date dataLimite;
    private List<Equipe> equipes;
    private Categoria categoria;
    private Status status;
    private Prioridade prioridade;

    public Tarefa(int idTarefa, String nomeTarefa, Date dataLimite, List<Equipe> equipes, Categoria categoria, Status status, Prioridade prioridade) {
        this.idTarefa = idTarefa;
        this.nomeTarefa = nomeTarefa;
        this.dataLimite = dataLimite;
        this.equipes = equipes;
        this.categoria = categoria;
        this.status = status;
        this.prioridade = prioridade;
    }

    public Tarefa() {
    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public List<Equipe> getEquipes() {
        return equipes;
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

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
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
    
    

}
