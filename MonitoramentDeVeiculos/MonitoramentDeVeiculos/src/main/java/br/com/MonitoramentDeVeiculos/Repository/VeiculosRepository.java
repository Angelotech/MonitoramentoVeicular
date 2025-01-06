package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroVeiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VeiculosRepository extends JpaRepository<CadastroVeiculos,Integer> {
    @Query(value = "select p from CadastroVeiculos p where upper(trim(p.modelo)) like %?1%")
    List<CadastroVeiculos> buscarmodelo(String name);


}
