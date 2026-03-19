
package domain;

import java.util.List;

public class AtributoTarefa {
    private String nomeTarefa;
    private String dataLimite;
    private String nomeEquipe;
    private String tipoCategoria;
    private String tipoStatus;
    private String tipoPrioridade;

    public AtributoTarefa(String nomeTarefa, String nomeEquipe, String tipoPrioridade,
            String dataLimite, String tipoCategoria, String tipoStatus) {
        this.nomeTarefa = nomeTarefa;
        this.dataLimite = dataLimite;
        this.nomeEquipe = nomeEquipe;
        this.tipoCategoria = tipoCategoria;
        this.tipoStatus = tipoStatus;
        this.tipoPrioridade = tipoPrioridade;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public String getDataLimite() {
        return dataLimite;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public String getTipoStatus() {
        return tipoStatus;
    }

    public String getTipoPrioridade() {
        return tipoPrioridade;
    }
    
}
