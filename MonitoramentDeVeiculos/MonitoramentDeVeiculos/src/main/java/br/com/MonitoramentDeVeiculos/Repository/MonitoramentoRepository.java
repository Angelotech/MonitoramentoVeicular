package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import br.com.MonitoramentDeVeiculos.Model.MonitoramentoVeiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MonitoramentoRepository extends JpaRepository<MonitoramentoVeiculos,Integer> {
    @Query(value = "select v from MonitoramentoVeiculos v where upper(trim(w.MonitoramentoVeiculos)) like %?1%")
    List<MonitoramentoVeiculos> buscarmotorista(String motorista);

}
