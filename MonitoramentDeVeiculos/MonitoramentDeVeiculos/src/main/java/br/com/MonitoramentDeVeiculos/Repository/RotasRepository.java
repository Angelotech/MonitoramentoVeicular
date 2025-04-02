package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RotasRepository extends JpaRepository<CadastroRotas,Integer> {
 //   @Query(value = "select c from CadastroRotas c where upper(trim(c.cidade)) LIKE %?1%")

    @Query("SELECT c FROM CadastroRotas c WHERE UPPER(TRIM(c.cidade)) LIKE %?1%")
    List<CadastroRotas> buscarrotas(String cidade);

    boolean existsByCidade(String cidade);



}
