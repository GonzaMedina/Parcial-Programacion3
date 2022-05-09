package main.modulo;

import java.util.List;

public abstract class ElementoForm {

    public String nombre;
    public String valor;
    public List <String> validadores;
    public List <String> error;

    public ElementoForm(String nombre) {
        this.nombre = nombre;


    }
    public ElementoForm(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public List<String> getValidadores() {
        return validadores;
    }

    public void setValidadores(List<String> validadores) {
        this.validadores = validadores;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    public boolean esValido(){

        return true;


    }

    public abstract String  renderizarHTML();
}
