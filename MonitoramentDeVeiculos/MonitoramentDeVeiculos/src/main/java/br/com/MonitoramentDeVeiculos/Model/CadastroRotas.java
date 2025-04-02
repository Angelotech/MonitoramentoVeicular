package br.com.MonitoramentDeVeiculos.Model;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@Data
@Entity
@Table(name = "tb_rotas")
@SequenceGenerator(name = "rotas", sequenceName = "rotas", initialValue = 1,allocationSize = 1)
public class CadastroRotas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rotas")
    private Integer id;
    @NotBlank(message = "erro 1")
    @Column(nullable = false, length = 50)
    private String cidade;
    @NotBlank(message = "erro 3")
    @Column(nullable = false, length = 2)
    private String estado;
    @Column(nullable = false)
    private Boolean status;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;

}
