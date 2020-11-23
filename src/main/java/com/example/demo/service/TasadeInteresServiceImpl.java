package com.example.demo.service;

import com.example.demo.entity.TasasdeInteres;
import com.example.demo.repository.TasadeInteresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.logging.*;

@Service
//@CacheDefaults(cacheName = "tasa_de_intereses")

public class TasadeInteresServiceImpl implements TasadeInteresService {

    @Autowired
    TasadeInteresRepository tasadeInteresRepository;

    @Override
    public TasasdeInteres getTasaDeInteres(Long i) {

        return tasadeInteresRepository.findById(i).get();
    }

    public TasasdeInteres getTasaDeInteresPorCodigo(String codigo) {

        return tasadeInteresRepository.findByInteresCode(codigo);
    }

    public TasasdeInteres getTasaDeInteresPorMonto(String monto) {

        return tasadeInteresRepository.findByInteresMonto(monto);
    }

    public List<TasasdeInteres> obtenerTodasTasas(){

        return tasadeInteresRepository.findAll();
    }




    //private static final Logger LOGGER = LogManager.getLogger(TasadeInteresServiceImpl.class.getName());


    /*@Override
    public Map<int, Object> getTodo() {

        //LOGGER.debug("Executing task");
        Map<String, Object> datos = new HashMap<String,Object>();
        for (TasasdeInteres tasadeInteres:findAll()) {
            datos.put(tasadeInteres.getId(), tasadeInteres.getInteres_code());
        }
        return datos;
*/


}
