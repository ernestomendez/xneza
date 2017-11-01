package com.dxesoft.xneza.rest;

import com.dxesoft.xneza.entity.EjemploEntity;
import com.dxesoft.xneza.service.EjemploService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * xneza, com.dxesoft.xneza.rest . Ejemplo
 * Created by ernesto on 25/10/17.
 */
@RestController
@RequestMapping("/api")
public class EjemploResource {

    private final EjemploService ejemploService;

    @Autowired
    public EjemploResource(EjemploService ejemploService) {
        this.ejemploService = ejemploService;
    }

    public ResponseEntity<List<EjemploEntity>> getAllEjemplos() {
        List<EjemploEntity> all = ejemploService.getAll();

        return ResponseEntity.status(HttpStatus.OK).body(all);
    }
}
