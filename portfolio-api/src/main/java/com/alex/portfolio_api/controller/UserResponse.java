package com.alex.portfolio_api.controller;

public class UserResponse {
    private String nombre;
    private String rol;
    private String ubi;

    public UserResponse(String nombre, String rol, String ubi) {
        this.nombre = nombre;
        this.rol = rol;
        this.ubi = ubi;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public String getUbi() {
        return ubi;
    }
}
