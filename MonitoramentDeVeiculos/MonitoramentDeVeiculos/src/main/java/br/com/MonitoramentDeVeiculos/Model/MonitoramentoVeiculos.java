package br.com.MonitoramentDeVeiculos.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_Monitoramento")
@SequenceGenerator(name = "monitoramento", sequenceName = "monitoramento", initialValue = 1, allocationSize = 1)
public class MonitoramentoVeiculos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "monitoramento")
    private Integer id;
    @NotBlank
    @Column(nullable = false)
    private String motorista;
    @NotBlank
    @Column(nullable = false)
    private String veiculos;
    @NotBlank
    @Column(nullable = false)
    private String rota;
    private Boolean status;
    @CreationTimestamp
    private LocalDateTime createdAt;


}
