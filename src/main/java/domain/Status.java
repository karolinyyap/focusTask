package domain;

/**
 *
 * @author Karoliny
 */
public enum Status {
    A_COMECAR("A começar"),
    EM_ANDAMENTO("Em andamento"),
    FINALIZADA("Finalizada");
    
    @Override
    public String toString() {
        switch(this) {
            case A_COMECAR:
                return "A começar";
            case EM_ANDAMENTO:
                return "Em andamento";
            case FINALIZADA:
                return "Finalizada";
        }
        return "";
    }

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
