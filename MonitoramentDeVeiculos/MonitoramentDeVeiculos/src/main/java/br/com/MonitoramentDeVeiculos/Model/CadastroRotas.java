package br.com.MonitoramentDeVeiculos.Model;
import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

@Data
@Entity(name = "tb_rotas")
@SequenceGenerator(name = "rotas", sequenceName = "rotas", initialValue = 1,allocationSize = 1)
public class CadastroRotas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rotas")
    private Integer id;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String estado;
    @Column(nullable = false)
    private String status;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;


}
