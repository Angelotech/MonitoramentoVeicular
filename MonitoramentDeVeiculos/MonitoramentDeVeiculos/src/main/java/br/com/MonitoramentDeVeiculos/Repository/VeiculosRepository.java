package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroUsuario;
import br.com.MonitoramentDeVeiculos.Model.CadastroVeiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VeiculosRepository extends JpaRepository<CadastroVeiculos,Integer> {


    @Query(value = "select m from CadastroVeiculos m where upper(trim(m.modelo)) like %?1%")
    List<CadastroVeiculos> buscarmodelo(String modelo);

    /*
    @Query(value = "SELECT p FROM CadastroVeiculos p WHERE UPPER(trim(p.placa)) LIKE %?1%")
    List<CadastroVeiculos> buscarplaca(String placa);
*/
    @Query("SELECT p FROM CadastroVeiculos p WHERE UPPER(p.placa) = UPPER(?1)")
    List<CadastroVeiculos> buscarplaca(String placa);

}
