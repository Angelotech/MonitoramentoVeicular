package br.com.MonitoramentDeVeiculos.Service;

import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import br.com.MonitoramentDeVeiculos.Repository.RotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;

import static org.springframework.web.servlet.function.ServerResponse.status;

@Service
public class RotasService {

    @Autowired
    private RotasRepository rotasRepository;

    public CadastroRotas salvarRotas(CadastroRotas cadastroRotas) throws Exception{
         if (rotasRepository.existsByCidade(cadastroRotas.getCidade())){
             throw new Exception("cidade ja cadastrada");
         }else {
             return rotasRepository.save(cadastroRotas);
         }

    }

    public List<CadastroRotas> listaDeRotas(String nomeDasRotas) {
        List<CadastroRotas> resultado = rotasRepository.buscarrotas(nomeDasRotas);
        System.out.println("📌 Resultado da busca: " + resultado); // Verifica se os dados vieram
        return resultado;
    }



    public CadastroRotas atualizacao(CadastroRotas novoCadastroRotas) throws Exception {

        if (novoCadastroRotas.getId() == null || !rotasRepository.existsById(novoCadastroRotas.getId())){
            throw new Exception("rota não atualizada verifique os rotas");
        }
        return rotasRepository.saveAndFlush(novoCadastroRotas);
            


    }


}








