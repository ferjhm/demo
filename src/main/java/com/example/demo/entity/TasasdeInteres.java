package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table (name = "Tasa_de_intereses")
public class TasasdeInteres {

    @Id
    private Long id;

    @Column (name = "interes_code")
    private String interesCode;

    @Column (name = "interes_monto")
    private String interesMonto;

    public TasasdeInteres(Long id, String interesCode, String interesMonto) {
        this.id = id;
        this.interesCode = interesCode;
        this.interesCode = interesMonto;
    }

    public TasasdeInteres() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInteres_code() {
        return interesCode;
    }

    public void setInteres_code(String interesCode) {
        this.interesCode = interesCode;
    }

    public String getInteres_monto() {
        return interesMonto;
    }

    public void setInteres_monto(String interesMonto) {
        this.interesMonto = interesMonto;
    }
}
