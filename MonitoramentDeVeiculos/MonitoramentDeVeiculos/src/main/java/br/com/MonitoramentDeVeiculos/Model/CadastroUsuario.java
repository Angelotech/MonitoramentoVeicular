package br.com.MonitoramentDeVeiculos.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.br.CPF;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_usuarios")
@SequenceGenerator(name = "usuario", sequenceName = "usuario", initialValue = 1, allocationSize = 1)
public class CadastroUsuario implements Serializable {
    public static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
    private Integer id;
    @NotBlank
    @Column(nullable = false, unique = true, length = 13)
    private String username;
    @NotBlank
    @Column(nullable = false, unique = true, length = 12)
    private String password;
    @NotBlank
    @Column(nullable = false, unique = true, length = 50)
    private String nome;
    @NotBlank
    @Column(nullable = false, length = 100)
    private String endereco;
    @NotBlank
    @Column(nullable = false, length = 50)
    private String complemento;
    @NotBlank
    @Column(nullable = false, length = 20, unique = true)
    private String telefone;
    @NotBlank
    @Column(unique = true, length = 100)
    private String email;
    @NotBlank
    @CPF
    @Column(nullable = false, unique = true, length = 13)
    private String cpf;
    @Column(nullable = false, unique = true, length = 10)
    private String rg;
    @Column(nullable = false, unique = false, length = 10)
    private String Date_nascimento;
    @Column(nullable = false)
    private String funcao;
    @Column(nullable = false, length = 30)
    private String setor;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime created;
}