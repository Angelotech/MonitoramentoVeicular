package Model;

import jakarta.persistence.*;


import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@SequenceGenerator(name = "veiculos", sequenceName = "veiculos", initialValue = 1, allocationSize = 1)
public class CadastroVeiculos implements Serializable {
    private static final long serialVersionUID = 1L;
     @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculos")
    private Integer id;

    @Column(nullable = false, unique = true)
    private String modelo;
    @Column(nullable = false, unique = true)
    private Character placa;
    @Column(nullable = false)
    private String proprietarios;
    @Column(nullable = false, unique = true)
    private Character categoria;
    @Column(nullable = false, unique = true)
    private String status;
    @Column(nullable = false, unique = true)
    private LocalDateTime creation;




  



}
