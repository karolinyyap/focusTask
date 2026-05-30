
package domain;

/**
 *
 * @author Karoliny
 */
public enum Prioridade {

    BAIXA(1, "Baixa"),
    MEDIA(2, "Média"),
    ALTA(3, "Alta");
    
    @Override
    public String toString() {
        switch(this) {
            case BAIXA:
                return "Baixa";
            case MEDIA:
                return "Média";
            case ALTA:
                return "Alta";
        }
        return "";
    }

    private int codigo;
    private String descricao;

    Prioridade(int codigo, String descricao) {
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
