package com.dxesoft.xneza.repository;

import com.dxesoft.xneza.entity.EjemploEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * xneza, com.dxesoft.xneza.repository . EjemploRepository
 * Created by ernesto on 25/10/17.
 */
@Repository
public interface EjemploRepository extends JpaRepository<EjemploEntity, Long> {


}
