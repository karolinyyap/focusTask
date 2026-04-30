
package domain;

import java.util.Date;

/**
 *
 * @author Karoliny
 */
public class Usuario {
    private int idUsuario;
    private String nomeUsuario;
    private String cpf;
    private String email;
    private String sexo;
    private Date dtNascimento;
    private String telefone;
    private Equipe equipe;
    private String senha;

    public Usuario(int idUsuario, String nomeUsuario, String cpf, String email, String sexo, Date dtNascimento, String telefone, Equipe equipe, String senha) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.email = email;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
        this.telefone = telefone;
        this.equipe = equipe;
        this.senha = senha;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public String getSenha() {
        return senha;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
