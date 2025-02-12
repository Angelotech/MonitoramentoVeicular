package br.com.MonitoramentDeVeiculos.Controller;

import br.com.MonitoramentDeVeiculos.Model.CadastroMotorista;
import br.com.MonitoramentDeVeiculos.Model.CadastroVeiculos;
import br.com.MonitoramentDeVeiculos.Repository.VeiculosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Veiculos")
public class VeiculoController {
    VeiculosRepository veiculosRepository;

    @PostMapping(value = "/Cadastro")
    public ResponseEntity<CadastroVeiculos> cadastro(@RequestBody CadastroVeiculos cadastroVeiculos){
        CadastroVeiculos veiculos = veiculosRepository.save(cadastroVeiculos);
        return new ResponseEntity<CadastroVeiculos>(veiculos, HttpStatus.OK);
    }

    @GetMapping(value = "/consultamodelo")
    @ResponseBody
    public ResponseEntity<List<CadastroVeiculos>> consulta(@RequestParam(name = "modelo") String modelo){
        List<CadastroVeiculos> carromodelo = veiculosRepository.buscarmodelo(modelo.trim().toUpperCase());
        return new ResponseEntity<List<CadastroVeiculos>>(carromodelo, HttpStatus.OK);
    }

    @GetMapping(value = "/consultaplaca")
    @ResponseBody
    public  ResponseEntity<List<CadastroVeiculos>> buscarplaca(@RequestParam(name = "placa") String placa){
        List<CadastroVeiculos> consultadeplaca = veiculosRepository.buscarplaca(placa.trim().toUpperCase());
       return new ResponseEntity<List<CadastroVeiculos>>(consultadeplaca, HttpStatus.OK);
    }

    @PutMapping(value = "/atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizarveiculos(@RequestBody CadastroVeiculos cadastroVeiculos){
        if (cadastroVeiculos.getId() <=0) {
            return new ResponseEntity<String>("valor do id invalido", HttpStatus.OK);

        } else{
            CadastroVeiculos atualizacaoveiculos = veiculosRepository.saveAndFlush(cadastroVeiculos);
            return new ResponseEntity<CadastroVeiculos>(atualizacaoveiculos,HttpStatus.OK);

        }
    }
    @DeleteMapping(value = "deleteveiculos")
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Integer idveiculos){
        veiculosRepository.deleteById(idveiculos);
        return new ResponseEntity<String>("deletado com sucesso",HttpStatus.OK);
    }



}
