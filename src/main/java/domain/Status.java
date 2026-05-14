package domain;

/**
 *
 * @author Karoliny
 */
public enum Status {
    A_COMECAR("A começar"),
    EM_ANDAMENTO("Em andamento"),
    FINALIZADA("Finalizada");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
