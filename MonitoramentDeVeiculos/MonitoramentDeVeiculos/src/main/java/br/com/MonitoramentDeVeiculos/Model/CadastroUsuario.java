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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
