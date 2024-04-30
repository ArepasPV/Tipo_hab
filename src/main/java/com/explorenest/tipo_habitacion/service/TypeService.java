package com.explorenest.tipo_habitacion.service;

import com.explorenest.tipo_habitacion.domain.Type;
import com.explorenest.tipo_habitacion.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    @Autowired
    private TypeRepository repository;

    public List<Type> getTypes() {
        return repository.findAll();
    }

    public Type getTypeById(int id) {
        return repository.findOneById(id);
    }
}
