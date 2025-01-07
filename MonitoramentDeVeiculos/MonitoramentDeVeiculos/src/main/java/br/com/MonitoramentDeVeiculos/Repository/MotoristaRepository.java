package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroMotorista;
import br.com.MonitoramentDeVeiculos.Model.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoristaRepository extends JpaRepository<CadastroMotorista,Integer> {
    @Query(value = "select n from CadastroMotorista n where upper(trim(n.nome)) like %?1%")
    List<CadastroMotorista> buscarnome(String name);

    @Query(value = "select c from CadastroMotorista c where upper(trim(c.cnh)) like %?1%")
    List<CadastroMotorista> buscarcnh(String cnh);
}
