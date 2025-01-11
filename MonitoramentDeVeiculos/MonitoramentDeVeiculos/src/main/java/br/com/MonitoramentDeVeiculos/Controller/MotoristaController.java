package br.com.MonitoramentDeVeiculos.Controller;

import br.com.MonitoramentDeVeiculos.Model.CadastroMotorista;
import br.com.MonitoramentDeVeiculos.Repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Motorista")
public class MotoristaController {
    @Autowired
    private MotoristaRepository motoristaRepository;

    /*salva usuario*/

    @PostMapping(value = "/salvar")
    @ResponseBody
    public ResponseEntity<CadastroMotorista> salvar (@RequestBody CadastroMotorista cadastroMotorista){
        CadastroMotorista cadmotorista = motoristaRepository.save(cadastroMotorista);
        return new ResponseEntity<CadastroMotorista>(cadmotorista, HttpStatus.CREATED);
    }

    /*buscar usuario*/

    @GetMapping(value = "/buscarId")
    @ResponseBody
    public ResponseEntity<CadastroMotorista> buscarMotoristaid(@RequestParam(name = "idmotorista")Integer idmotorista){
        CadastroMotorista motorista = motoristaRepository.findById(idmotorista).get();
        return new ResponseEntity<>(motorista,HttpStatus.OK);
    }

    @GetMapping(value = "/buscarNome")
    @ResponseBody
    public ResponseEntity<List<CadastroMotorista>> buscarnomeMotorista(@RequestParam(name = "nome")String nome){
        List<CadastroMotorista> nomemotorista = motoristaRepository.buscarnome(nome.trim().toUpperCase());
        return new ResponseEntity<List<CadastroMotorista>>(nomemotorista,HttpStatus.OK);
    }

    @GetMapping(value = "/buscarCnh")
    @ResponseBody
    public ResponseEntity<List<CadastroMotorista>> buscarcnh(@RequestParam(name = "cnh")String cnh){
        List<CadastroMotorista> cnhmotorrista = motoristaRepository.buscarcnh(cnh.trim().toUpperCase());
        return new ResponseEntity<List<CadastroMotorista>>(cnhmotorrista,HttpStatus.OK);

    }









}
