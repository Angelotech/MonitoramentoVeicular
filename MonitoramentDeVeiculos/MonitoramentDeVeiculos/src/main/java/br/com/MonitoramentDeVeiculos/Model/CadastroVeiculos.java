package br.com.MonitoramentDeVeiculos.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tb_veiculos")
@SequenceGenerator(name = "veiculos", sequenceName = "veiculos", initialValue = 1, allocationSize = 1)
public class CadastroVeiculos implements Serializable {
    private static final long serialVersionUID = 1L;
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculos")
    private Integer id;
    @NotBlank
    @Column(unique = true)
    private String modelo;
    @NotBlank
    @Column(unique = true)
    private String placa;
    @NotBlank
    @Column(nullable = false)
    private int ano;
    @NotBlank
    @Column(nullable = false)
    private String marca;
    @NotBlank
    @Column(nullable = false)
    private String proprietario;
    @NotBlank
    @Column(nullable = false)
    private String tipo_de_veiculo;
    @Column(nullable = false, length = 7)
    private String cavalo;

    @Column(unique = true)
    private String categoria;

}
