package br.com.MonitoramentDeVeiculos.Controller;

import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import br.com.MonitoramentDeVeiculos.Repository.RotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Rotas")
public class Rotascontroller {
    @Autowired
    RotasRepository rotasrepository;

    @PostMapping(value = "/cadastro")
    @ResponseBody
    public ResponseEntity<CadastroRotas> rotacad(@RequestBody CadastroRotas cadastroRotas){
        CadastroRotas cadrotas = rotasrepository.save(cadastroRotas);
        return new ResponseEntity<CadastroRotas>(cadrotas,HttpStatus.OK);
    }

    @GetMapping(value = "/buscarcidade")
    @ResponseBody
    public ResponseEntity<List<CadastroRotas>> cidade(@RequestParam(name = "nomecidade") String nomecidade){
        List<CadastroRotas> rota = rotasrepository.buscarrotas(nomecidade);
        return new ResponseEntity<List<CadastroRotas>>(rota,HttpStatus.OK);
    }

    @GetMapping(value = "buscarendereco")
    @ResponseBody
    public ResponseEntity<List<CadastroRotas>> endereco(@RequestParam (name = "endereco")String endereco){
        List<CadastroRotas> cadrastro_endereco = rotasrepository.buscarendereco(endereco);
        return new ResponseEntity<List<CadastroRotas>>(cadrastro_endereco, HttpStatus.OK);
    }
    @PutMapping(value = "/atualizarrotas")
    @ResponseBody
    public ResponseEntity<?> atualizacaoDeRotas(@RequestBody CadastroRotas cadastroRotas){
        if(cadastroRotas.getId() <= 0){
            return new ResponseEntity<String>("rota não atualizada verifique os rodas", HttpStatus.OK);
        }else {
            CadastroRotas rotasatualizadas = rotasrepository.saveAndFlush(cadastroRotas);
            return new ResponseEntity<CadastroRotas>(rotasatualizadas, HttpStatus.OK);

        }




    }






}


