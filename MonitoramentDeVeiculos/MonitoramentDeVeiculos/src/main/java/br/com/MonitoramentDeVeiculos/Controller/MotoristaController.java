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

    /*buscar motorista*/

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
    public ResponseEntity<List<CadastroMotorista>> buscarcnh(@RequestParam(name = "cnh")int cnh){
        List<CadastroMotorista> cnhmotorrista = motoristaRepository.buscarcnh(cnh);
        return new ResponseEntity<List<CadastroMotorista>>(cnhmotorrista,HttpStatus.OK);
    }


    @PutMapping(value = "/atualizarcaomotorista")
    @ResponseBody
    public ResponseEntity<?> atualizacao (@RequestBody CadastroMotorista cadastroMotorista){
        if (cadastroMotorista.getId()<=0){
            return new ResponseEntity<String>("valor de Id invalido", HttpStatus.OK);
        }else{
            CadastroMotorista atualizacaomotorista = motoristaRepository.saveAndFlush(cadastroMotorista);
            return new ResponseEntity<CadastroMotorista>(cadastroMotorista,HttpStatus.OK);
        }
    }

    @DeleteMapping(value = "/Deletemotorista")
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Integer idmotor){
        motoristaRepository.deleteById(idmotor);
        return new ResponseEntity<String>("exluido com sucesso", HttpStatus.OK);

    }










}
