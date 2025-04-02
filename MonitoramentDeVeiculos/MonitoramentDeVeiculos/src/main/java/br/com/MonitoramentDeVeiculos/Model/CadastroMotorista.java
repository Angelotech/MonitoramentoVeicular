package br.com.MonitoramentDeVeiculos.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Data
@Entity
@Table(name = "tb_motorista")
@SequenceGenerator(name = "motorista", sequenceName = "motorista", initialValue = 1, allocationSize = 1)
public class CadastroMotorista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "motorista")
    public Integer id;
    @NotBlank
    @Column(nullable = false, unique = true)
    private String nome;
    @NotBlank()
    @Column(nullable = false)
    private String categoria_CNH;
    @NotBlank
    @Column(nullable = false)
    private String endereco;
    @Max(12)
    @Column(nullable = false, unique = true, length = 11)
    private Long numero_cnh;
    @NotBlank
    @Column(nullable = false, unique = true)
    private String telefone;
    @NotBlank
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private Boolean status;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;



}