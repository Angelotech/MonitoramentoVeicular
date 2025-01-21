package br.com.MonitoramentDeVeiculos.Controller;

import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import br.com.MonitoramentDeVeiculos.Model.CadastroUsuario;
import br.com.MonitoramentDeVeiculos.Repository.RotasRepository;
import br.com.MonitoramentDeVeiculos.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Rotas")
public class Rotascontroller {
    @Autowired
    RotasRepository rotasRepository;

    @PostMapping(value = "/cadastro")
    @ResponseBody
    public ResponseEntity<CadastroRotas> cadrotas(@RequestBody CadastroRotas cadastroRotas){
        CadastroRotas rota = rotasRepository.save(cadastroRotas);
        return new ResponseEntity<CadastroRotas>(rota,HttpStatus.OK);
    }


}
