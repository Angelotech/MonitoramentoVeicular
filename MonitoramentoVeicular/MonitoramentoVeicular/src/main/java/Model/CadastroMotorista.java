package Model;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.*;


@Entity
@SequenceGenerator(name = "motorista", sequenceName = "motorista", initialValue = 1, allocationSize = 1)
public class CadastroMotorista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "motorista")
    private Integer id;

    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private Character categoria_CNH;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false, unique = true, length = 10)
    private Character numero_CNH;
    @Column(nullable = false, unique = false)
    private Character telefone;
    @Column(unique = true,nullable = false)
    private String email;
    @Column(nullable = false)
    private LocalDateTime created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getCategoria_CNH() {
        return categoria_CNH;
    }

    public void setCategoria_CNH(Character categoria_CNH) {
        this.categoria_CNH = categoria_CNH;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Character getNumero_CNH() {
        return numero_CNH;
    }

    public void setNumero_CNH(Character numero_CNH) {
        this.numero_CNH = numero_CNH;
    }

    public Character getTelefone() {
        return telefone;
    }

    public void setTelefone(Character telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
