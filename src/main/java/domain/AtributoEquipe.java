
package domain;

/**
 *
 * @author Karoliny
 */
public class AtributoEquipe {
    private String nomeEquipe;
    private String setor;
    private String lider;
    private String membros;

    public AtributoEquipe(String nomeEquipe, String setor, String lider, String membros) {
        this.nomeEquipe = nomeEquipe;
        this.setor = setor;
        this.lider = lider;
        this.membros = membros;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public String getSetor() {
        return setor;
    }

    public String getLider() {
        return lider;
    }

    public String getMembros() {
        return membros;
    }
    
    
}
