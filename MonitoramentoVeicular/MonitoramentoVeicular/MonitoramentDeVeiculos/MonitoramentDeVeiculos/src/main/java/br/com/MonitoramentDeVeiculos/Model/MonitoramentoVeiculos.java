package br.com.MonitoramentDeVeiculos.Model;


import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "monitoramente")
    private Integer id;
    @Column(nullable = false)
    private String motorista;
    @Column(nullable = false)
    private String veiculos;
    @Column(nullable = false)
    private String rota;
    private Boolean ativo;

    @CreationTimestamp
    private LocalDateTime createdAt;


}
