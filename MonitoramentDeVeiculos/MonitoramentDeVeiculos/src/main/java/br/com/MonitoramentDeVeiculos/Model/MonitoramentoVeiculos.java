package br.com.MonitoramentDeVeiculos.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "TB_Teste")
public class MonitoramentoVeiculos {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)/*atributo responsavel por passar um valor unico para ser permitido valores iguais */
    private String username;
    private String name;
    private String passoword;

    @CreationTimestamp
    private LocalDateTime createdAt;


}
