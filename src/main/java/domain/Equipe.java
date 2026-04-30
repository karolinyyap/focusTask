
package domain;

/**
 *
 * @author Karoliny
 */
public class Equipe {
    private int idEquipe;
    private String nomeEquipe;
    private String setor;

    public Equipe(int idEquipe, String nomeEquipe, String setor) {
        this.idEquipe = idEquipe;
        this.nomeEquipe = nomeEquipe;
        this.setor = setor;
    }

    public Equipe() {
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public String getSetor() {
        return setor;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return nomeEquipe;
    }
  
}
