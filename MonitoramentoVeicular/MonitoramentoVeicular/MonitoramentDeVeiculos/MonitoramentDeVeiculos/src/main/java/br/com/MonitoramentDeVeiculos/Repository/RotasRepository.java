package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import br.com.MonitoramentDeVeiculos.Model.CadastroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RotasRepository extends JpaRepository<CadastroRotas,Integer> {
    @Query(value = "select c from CadastroRotas c where upper(trim(c.cidade)) like %?1%")
    List<CadastroRotas> buscarrotas(String cidade);

    @Query(value = "select e from CadastroRotas e where upper(trim(e.endereco)) like %?1%")
    List<CadastroRotas> buscarendereco(String endereco);



}
