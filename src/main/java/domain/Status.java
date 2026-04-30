package domain;

/**
 *
 * @author Karoliny
 */
public enum Status {
    A_COMECAR(1, "A começar"),
    EM_ANDAMENTO(2, "Em andamento"),
    FINALIZADA(3, "Finalizada");

    private int codigo;
    private String descricao;

    Status(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
