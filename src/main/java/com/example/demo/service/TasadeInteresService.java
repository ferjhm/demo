package com.example.demo.service;


import com.example.demo.entity.TasasdeInteres;

import java.util.List;
import java.util.Map;

public interface TasadeInteresService {
    //public Map<int,Object> getTodo();

    public TasasdeInteres getTasaDeInteres(Long id);
    public TasasdeInteres getTasaDeInteresPorCodigo(String codigo);
    public TasasdeInteres getTasaDeInteresPorMonto(String monto);
    public List<TasasdeInteres> obtenerTodasTasas();

}
