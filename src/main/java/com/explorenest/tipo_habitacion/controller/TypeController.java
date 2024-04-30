package com.explorenest.tipo_habitacion.controller;

import com.explorenest.tipo_habitacion.domain.Type;
import com.explorenest.tipo_habitacion.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("api/tipo_habitacion")
public class TypeController {
    @Autowired
    private TypeService service;

    @GetMapping("list")
    public List<Type> getTypes() {return service.getTypes();}

    @GetMapping("get")
    public Type getTypeById(@RequestParam("id") int id) {return service.getTypeById(id);}
}
