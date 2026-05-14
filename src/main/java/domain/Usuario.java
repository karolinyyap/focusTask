
package domain;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author Karoliny
 */
@Entity
@Table
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private String nome;
    
    @Column
    private String cpf;
    
    @Column
    private String email;
    
    @Column
    private String sexo;
    
    @Column
    private Date dtNascimento;
    
    @Column
    private String telefone;
    
    @ManyToOne
    @JoinColumn(name = "id_equipe")
    private Equipe equipe;
    
    @Column
    private String senha;

    public Usuario(int id, String nome, String cpf, String email, String sexo, Date dtNascimento, String telefone, Equipe equipe, String senha) {
        this.id = id;
        this.nome = nome;
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

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
