package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroMotorista;
import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import br.com.MonitoramentDeVeiculos.Model.MonitoramentoVeiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MonitoramentoRepository extends JpaRepository<MonitoramentoVeiculos,Integer> {

    /*    @Query(value = "SELECT v FROM MonitoramentoVeiculos v WHERE upper(trim(V.MonitoramentoVeiculos)) LIKE %?1%")
    @Query("SELECT p FROM  MonitoramentoVeiculos p WHERE UPPER(p.MonitoramentoVeiculos) = UPPER(?1)")
    List<MonitoramentoVeiculos> buscarmotorista(String motorista);
*/
}



