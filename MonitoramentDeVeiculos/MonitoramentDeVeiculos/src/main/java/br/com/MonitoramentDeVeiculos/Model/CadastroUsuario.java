package br.com.MonitoramentDeVeiculos.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@Entity(name = "tb_usuarios")
@SequenceGenerator(name = "usuario", sequenceName = "usuario", initialValue = 1, allocationSize = 1)
public class CadastroUsuario implements Serializable {
    public static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
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
    private String telefone;
    @Column(unique = true, length = 100)
    private String email;
    @Column(nullable = false, unique = true, length = 13)
    private String cpf;
    @Column(nullable = false, unique = false, length = 10)
    private String rg;
    @Column(nullable = false, unique = false, length = 10)
    private String Date_nascimento;
    @Column(nullable = false)
    private String funcao;
    @Column(nullable = false, length = 30)
    private String setor;

    @CreationTimestamp
    @Column( updatable = false)
    private LocalDateTime created;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CadastroUsuario that = (CadastroUsuario) o;
        return Objects.equals(id, that.id) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(nome, that.nome) && Objects.equals(endereco, that.endereco) && Objects.equals(complemento, that.complemento) && Objects.equals(telefone, that.telefone) && Objects.equals(email, that.email) && Objects.equals(cpf, that.cpf) && Objects.equals(rg, that.rg) && Objects.equals(Date_nascimento, that.Date_nascimento) && Objects.equals(funcao, that.funcao) && Objects.equals(setor, that.setor) && Objects.equals(created, that.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, nome, endereco, complemento, telefone, email, cpf, rg, Date_nascimento, funcao, setor, created);
    }


}
