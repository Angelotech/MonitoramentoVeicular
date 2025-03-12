package br.com.MonitoramentDeVeiculos.Controller;

import br.com.MonitoramentDeVeiculos.Model.CadastroUsuario;
import br.com.MonitoramentDeVeiculos.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/Usuario")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    /*salvar usuario*/
    @PostMapping(value = "/salvarusuario")
    @ResponseBody
    public ResponseEntity<CadastroUsuario> salvausuario(@RequestBody CadastroUsuario cadastroUsuario){
        CadastroUsuario usuariocadastro = usuarioRepository.save(cadastroUsuario);
        return new ResponseEntity<CadastroUsuario>(usuariocadastro,HttpStatus.CREATED);
    }
    /*buscar usuario*/
    @GetMapping(value = "/buscarid")
    @ResponseBody
    public ResponseEntity<CadastroUsuario> buscarId(@RequestParam(name = "idusuario")Integer idusuario){
        CadastroUsuario usuario = usuarioRepository.findById(idusuario).get();
        return new ResponseEntity<CadastroUsuario>(usuario,HttpStatus.OK);
    }
    /*buscar cpf*/
    @GetMapping(value = "/buscacpf")
    @ResponseBody
    public ResponseEntity<List<CadastroUsuario>> buscarcpf(@RequestParam(name = "usuariocpf") String usuariocpf){
        List<CadastroUsuario> cpfusuario = usuarioRepository.buscarcpf(usuariocpf.trim().toUpperCase());
        return new ResponseEntity<List<CadastroUsuario>>(cpfusuario, HttpStatus.OK);
    }

    @GetMapping(value = "/buscarnome")
    @ResponseBody
    public ResponseEntity<List<CadastroUsuario>> buscarUser(@RequestParam(name = "nome")String nome){
        List<CadastroUsuario> buscarusuario = usuarioRepository.buscarnome(nome.trim().toUpperCase());
        return new ResponseEntity<List<CadastroUsuario>>(buscarusuario,HttpStatus.OK);
    }

    /*atualizar usuario*/
    @PutMapping(value = "/atualizacao")
    @ResponseBody
    public ResponseEntity<?> atualizarusu(@RequestBody CadastroUsuario cadastroUsuario){
        if(cadastroUsuario.getId() <= 0){
            return new ResponseEntity<String>("usuario não encontrado", HttpStatus.OK);
        }else{
            CadastroUsuario usuario = usuarioRepository.saveAndFlush(cadastroUsuario);
            return new ResponseEntity<CadastroUsuario>(usuario,HttpStatus.OK);
        }
    }

    @DeleteMapping(value = "/deleteusuario")
    @ResponseBody
    public  ResponseEntity<String> delete(@RequestParam Integer usuarioid){
        usuarioRepository.deleteById(usuarioid);
        return new ResponseEntity<String>("usuario excluido", HttpStatus.OK);

    }










}