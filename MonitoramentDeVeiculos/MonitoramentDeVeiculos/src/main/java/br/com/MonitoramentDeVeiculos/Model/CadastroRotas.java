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
    private Double status;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime created;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getStatus() {
        return status;
    }

    public void setStatus(Double status) {
        this.status = status;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
