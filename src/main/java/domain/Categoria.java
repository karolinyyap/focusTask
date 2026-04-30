
package domain;

/**
 *
 * @author Karoliny
 */
public class Categoria {
    private int idCat;
    private String nomeCat;
    private String descricaoCat;

    public Categoria(int idCat, String nomeCat, String descricaoCat) {
        this.idCat = idCat;
        this.nomeCat = nomeCat;
        this.descricaoCat = descricaoCat;
    }

    public Categoria() {
    }

    public int getIdCat() {
        return idCat;
    }

    public String getNomeCat() {
        return nomeCat;
    }

    public String getDescricaoCat() {
        return descricaoCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public void setNomeCat(String nomeCat) {
        this.nomeCat = nomeCat;
    }

    public void setDescricaoCat(String descricaoCat) {
        this.descricaoCat = descricaoCat;
    }

   
   
}
