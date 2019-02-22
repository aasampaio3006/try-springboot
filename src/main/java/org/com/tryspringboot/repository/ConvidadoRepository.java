package org.com.tryspringboot.repository;


import java.util.List;

import org.com.tryspringboot.model.Convidado;
import org.springframework.data.repository.CrudRepository;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{
}
