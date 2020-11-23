package com.example.demo.controller;


import com.example.demo.entity.TasasdeInteres;
import com.example.demo.service.TasadeInteresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.introspector.Property;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return  "Hola Mundillo";
    }

    @RequestMapping("/obtenerSimulacion")
    public Map ObtenerSimulacion(){

        Map result = new HashMap();

        result.put("meses",12);
        result.put("interes",2);

        return  result;
    }


    @Autowired
    private TasadeInteresService tasadeInteresService;


    @GetMapping("/obtenerTasaDeInteres/{id}")
    public TasasdeInteres obtenerTasaDeInteres(@PathVariable String id) throws Exception{

        TasasdeInteres tasaDeInteres = tasadeInteresService.getTasaDeInteres(Long.valueOf(id));
        return tasaDeInteres;
    }

    @GetMapping("/obtenerTasaDeInteresPorCodigo/{id}")
    public TasasdeInteres obtenerTasaDeInteresPorCodigo(@PathVariable String id) throws Exception{

        TasasdeInteres tasaDeInteres = tasadeInteresService.getTasaDeInteresPorCodigo(id);
        return tasaDeInteres;
    }

    @GetMapping("/obtenerTasaDeInteresPorMonto/{monto}")
    public TasasdeInteres obtenerTasaDeInteresPorMonto(@PathVariable String monto) throws Exception{

        TasasdeInteres tasaDeInteres = tasadeInteresService.getTasaDeInteresPorMonto(monto);
        return tasaDeInteres;
    }


    @GetMapping("/obtenerTasaDeInteresPorCodigoDolarizado/{codigo}")
    public Double obtenerTasaDeInteresPorCodigoDolarizado(@PathVariable String codigo) throws Exception{

        TasasdeInteres tasaDeInteres = tasadeInteresService.getTasaDeInteresPorCodigo(codigo);

        Double valor = Double.parseDouble(tasaDeInteres.getInteres_monto());

        Double dolarizado = valor* 3.8;

        return dolarizado;
    }

    @GetMapping("/obtenerTodos")
    public List<TasasdeInteres>  obtenerTodasTasas() throws Exception{

        List<TasasdeInteres> todos = tasadeInteresService.obtenerTodasTasas();
        return todos;
    }









}
