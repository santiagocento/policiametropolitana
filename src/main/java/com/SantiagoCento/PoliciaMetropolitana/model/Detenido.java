package com.SantiagoCento.PoliciaMetropolitana.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "detenido")
public class Detenido{

    @Id
    private int clave;

    @NotNull
    private String nombreCompleto;

    @NotNull
    private int bandaPertenece;

    public Detenido() {
    }

    public Detenido(int clave, @NotNull String nombreCompleto, @NotNull int bandaPertenece) {

        this.clave = clave;
        this.nombreCompleto = nombreCompleto;
        this.bandaPertenece = bandaPertenece;
    }

    public int getClave() {
        return clave;
    }

    public Detenido setClave(int clave) {
        this.clave = clave;
        return this;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public Detenido setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
        return this;
    }

    public int getBandaPertenece() {
        return bandaPertenece;
    }

    public Detenido setBandaPertenece(int bandaPertenece) {
        this.bandaPertenece = bandaPertenece;
        return this;
    }
}
