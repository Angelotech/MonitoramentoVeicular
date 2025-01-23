package br.com.MonitoramentDeVeiculos.Model;

import jakarta.persistence.*;
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

    @Column(unique = true)
    private String modelo;
    @Column(unique = true)
    private String placa;
    @Column(nullable = false)
    private int ano;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String proprietario;
    @Column(unique = true)
    private String categoria;
    @Column(unique = true)
    private Double status;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
