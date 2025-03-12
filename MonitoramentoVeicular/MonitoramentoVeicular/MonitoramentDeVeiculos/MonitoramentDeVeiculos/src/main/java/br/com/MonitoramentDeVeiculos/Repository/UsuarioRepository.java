package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroMotorista;
import br.com.MonitoramentDeVeiculos.Model.CadastroUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<CadastroUsuario,Integer>{

    @Query(value = "select us from CadastroUsuario us where upper (trim(us.nome)) like %?1%")
    List<CadastroUsuario> buscarnome(String nome);

     @Query(value = "select cp from CadastroUsuario cp where upper (trim(cp.cpf)) LIKE %?1%")
    List<CadastroUsuario> buscarcpf(String cpf);



}
