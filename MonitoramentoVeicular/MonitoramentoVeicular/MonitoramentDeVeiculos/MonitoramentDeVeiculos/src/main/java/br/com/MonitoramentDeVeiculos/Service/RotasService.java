package br.com.MonitoramentDeVeiculos.Service;

import br.com.MonitoramentDeVeiculos.Model.CadastroRotas;
import br.com.MonitoramentDeVeiculos.Repository.RotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RotasService {

    @Autowired
    private RotasRepository rotasRepository;

    public CadastroRotas salvarRotas(CadastroRotas cadastroRotas) {
        return rotasRepository.save(cadastroRotas);
    }

    public List<CadastroRotas> listaDeRotas(String nomeDasRotas) {
        return rotasRepository.buscarrotas(nomeDasRotas);
    }

    public List<CadastroRotas> localDosenderecos(String local) {
        return rotasRepository.buscarendereco(local);
    }

    public CadastroRotas atualizacao(CadastroRotas novoCadastroRotas) throws Exception {

        if (novoCadastroRotas.getId() == null || !rotasRepository.existsById(novoCadastroRotas.getId())){
            throw new Exception("rota não atualizada verifique os rotas");
        }
        return rotasRepository.saveAndFlush(novoCadastroRotas);
            


    }


}








