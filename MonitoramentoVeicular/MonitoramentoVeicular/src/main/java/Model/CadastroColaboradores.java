package Model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@SequenceGenerator(name = "colaboradores", sequenceName = "colaboradores", initialValue = 1, allocationSize = 1)
public class CadastroColaboradores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "colaboradores")
    private Integer id;

    @Column(nullable = false,unique = true,length = 13)
    private String username;
    @Column(nullable = false, unique = true,length = 12)
    private String password;
    @Column(nullable = false, unique = true, length =  50)
    private String nome;
    @Column(nullable = false, length = 100)
    private String endereco;
    @Column(nullable = false, length = 50)
    private String complemento;
    @Column(nullable = false, length = 20, unique = true)
    private char telefone;
    @Column(unique = true, length = 100)
    private String email;
    @Column(nullable = false, unique = true, length = 13)
    private String cpf;
    @Column(nullable = false, unique = false, length = 10)
    private String rg;
    @Column(nullable = false, unique = false, length = 10)
    private String Date_nascimento;
    @Column(nullable = false)
    private String setor;
    @Column(nullable = false)
    private String funcao;
    @Column(nullable = false)
    private LocalDateTime created;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public char getTelefone() {
        return telefone;
    }

    public void setTelefone(char telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDate_nascimento() {
        return Date_nascimento;
    }

    public void setDate_nascimento(String date_nascimento) {
        Date_nascimento = date_nascimento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
