package com.dxesoft.xneza.service;

import com.dxesoft.xneza.entity.EjemploEntity;
import com.dxesoft.xneza.repository.EjemploRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;
import java.util.Optional;

/**
 * xneza, com.dxesoft.xneza.service . EjemploService
 * Created by ernesto on 25/10/17.
 */
@Service
public class EjemploService {

    private final Logger log = LoggerFactory.getLogger(EjemploService.class);

    private final EjemploRepository ejemploRepository;

    @Autowired
    public EjemploService(EjemploRepository ejemploRepository) {
        this.ejemploRepository = ejemploRepository;
    }


    public List<EjemploEntity> getAll() {

        return ejemploRepository.findAll();
    }

}
