package Repository;

import Model.CadastroVeiculos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface veiculo extends JpaRepository<CadastroVeiculos, Integer> {

}
