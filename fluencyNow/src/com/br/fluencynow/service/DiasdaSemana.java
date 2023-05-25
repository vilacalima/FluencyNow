package com.br.fluencynow.service;

/**
 * Enum que insere dias da semana
 * */
public enum DiasdaSemana {
    SEGUNDA_FEIRA("Segunda-Feira"),
    TERCA_FEIRA("Terça-Feira"),
    QUARTA_FEIRA("Quarta-Feira"),
    QUINTA_FEIRA("Quinta-Feira"),
    SEXTA_FEIRA("Sexta-Feira");


    private final String dia;

    DiasdaSemana(String dia) {
        this.dia = dia;
    }

    public String getDia(){
        return dia;
    }
}

