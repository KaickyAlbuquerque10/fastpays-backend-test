package com.fastpays.repository;

import com.fastpays.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa,Long>{
 List<Pessoa> findByEmpresaId(Long empresaId);
}
