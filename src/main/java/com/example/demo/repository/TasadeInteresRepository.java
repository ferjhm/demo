package com.example.demo.repository;

import com.example.demo.entity.TasasdeInteres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasadeInteresRepository extends JpaRepository<TasasdeInteres,Long> {

    TasasdeInteres findByInteresCode(String interesCode);
    TasasdeInteres findByInteresMonto(String interesMonto);


}
