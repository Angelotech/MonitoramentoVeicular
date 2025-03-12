package br.com.MonitoramentDeVeiculos.Controller;

import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import br.com.MonitoramentDeVeiculos.Service.RotasService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/Rotas")
public class Rotascontroller {

    @Autowired
    private RotasService rotasService;

    @PostMapping(value = "/cadastro")
    @ResponseBody
    public ResponseEntity<CadastroRotas> Rotascadastradas(@Valid @RequestBody CadastroRotas cadastroRotas) {
        CadastroRotas rotassalvas = rotasService.salvarRotas(cadastroRotas);
        return ResponseEntity.ok(rotassalvas);
    }

    @GetMapping(value = "/buscarcidade")
    @ResponseBody
    public ResponseEntity<List<CadastroRotas>> cidade(@RequestParam(name = "nomecidade") String nomecidade) {
        List<CadastroRotas> rota = rotasService.listaDeRotas(nomecidade);
        return new ResponseEntity<List<CadastroRotas>>(rota, HttpStatus.OK);
    }

    @GetMapping(value = "buscarendereco")
    @ResponseBody
    public ResponseEntity<List<CadastroRotas>> endereco(@RequestParam(name = "endereco") String endereco) {
        List<CadastroRotas> endereco_cadastrado = rotasService.listaDeRotas(endereco);
        return new ResponseEntity<List<CadastroRotas>>(endereco_cadastrado, HttpStatus.OK);
    }

    /*Uso de <?> no ResponseEntity Como pode haver diferentes tipos de retorno (um objeto CadastroRotas ou uma String de erro), <?> permite mais flexibilidade.*/
  /*  @PutMapping(value = "/atualizarotas")
    @ResponseBody
    public ResponseEntity<?> atualizacaoDeRotas(@RequestBody CadastroRotas cadastroRotas){
        try{
            CadastroRotas rotasAtualizadas = rotasService.atualizacao(cadastroRotas);
            return ResponseEntity.ok(rotasAtualizadas);
        } catch (Exception e) {
           return ResponseEntity.badRequest().body("Rota não atualizada, verifique os dados.");
        }
    }
}
}
   */
}

