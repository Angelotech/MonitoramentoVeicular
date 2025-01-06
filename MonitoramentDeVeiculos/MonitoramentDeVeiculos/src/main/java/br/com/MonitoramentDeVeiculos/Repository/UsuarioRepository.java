package br.com.MonitoramentDeVeiculos.Repository;

import br.com.MonitoramentDeVeiculos.Model.CadastroUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<CadastroUsuario,Integer>{
    @Query(value = "select u from CadastroVeiculos u where upper(trim(u.nome)) like %?1%" )
    List<CadastroUsuario> buscarnome(String name);

    @Query(value = "select us from CadastroUsuario us where upper (trim(us.username)) like %?1%")
    List<CadastroUsuario> buscarusername(String username);

    @Query(value = "select cp from CadastroUsuario cp where upper (trim(cp.cpf)) like %?1%")
    List<CadastroUsuario> buscarcpf(String cpf);
}
