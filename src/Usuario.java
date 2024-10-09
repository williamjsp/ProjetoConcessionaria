import java.util.ArrayList;
import java.util.Scanner;

public abstract class Usuario {
    private String email;
    private String senha;
    private String nome;
    private String id;
    private String cpf;
    private String telefone;
    private boolean adm;

    public Usuario(String email, String senha, String cpf, String id,
                   String nome, String telefone, boolean adm) {
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
    }

    public Usuario(String email, String senha) {
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdm() { return adm; }

    private void setAdm(boolean adm) { this.adm = adm; }

    public void alterarSenha(String senhaNova){
        setSenha(senhaNova);
    }
}
