package br.com.MonitoramentDeVeiculos.Model;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Data
@Entity(name = "tb_motorista")
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
    private String telefone;
    @Column(unique = true, nullable = false)
    private String email;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;

}