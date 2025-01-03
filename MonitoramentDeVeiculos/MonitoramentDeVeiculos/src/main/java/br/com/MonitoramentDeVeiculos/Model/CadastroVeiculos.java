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

    @Column( unique = true)
    private String modelo;
    @Column( unique = true)
    private Character placa;
    @Column()
    private String proprietarios;
    @Column( unique = true)
    private Character categoria;
    @Column( unique = true)
    private String status;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;



  



}
