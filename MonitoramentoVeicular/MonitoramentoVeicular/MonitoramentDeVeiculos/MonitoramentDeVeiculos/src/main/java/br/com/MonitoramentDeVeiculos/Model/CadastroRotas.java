package br.com.MonitoramentDeVeiculos.Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Data
@Entity
@Table(name = "tb_rotas")
@SequenceGenerator(name = "rotas", sequenceName = "rotas", initialValue = 1,allocationSize = 1)
public class CadastroRotas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rotas")
    private Integer id;
    @NotBlank(message = "o campo precisar ser prenchido")
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private Boolean status;
    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;

}
