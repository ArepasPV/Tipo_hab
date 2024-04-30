package com.explorenest.tipo_habitacion.repository;

import com.explorenest.tipo_habitacion.domain.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Integer> {
    Type findOneById(int id);
}
