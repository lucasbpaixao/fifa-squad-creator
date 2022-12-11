package com.lucasbpaixao.fifasquadcreator.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="informacoes_contrato")
public class InformacoesContrato {
    
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="time_atual")
    private String timeAtual;

    @Column(name="logo_time")
    private String logoTime;

    @Column(name="preco")
    private String precoFormatado;

    @Column(name="salario")
    private String salarioFormatado;

    @Column(name="time_emprestimo")
    private String timeEmprestimo;
    
    @Column(name="inicio_contrato")
    private String inicioContrato;

    @Column(name="fim_contrato")
    private String fimContrato;

    @Column(name="multa_recisao")
    private String multaRecisoriaFormatada;

    @Column(name="moeda")
    private String moeda;

    @Column(name="salario_float")
    private Float salarioFloat;

    @Column(name="preco_float")
    private Float precoFloat;

    @Column(name="multa_recisoria_float")
    private Float multaRecisoriaFloat;
    
    public Long getId() {
        return id;
    }

    public String getTimeAtual() {
        return timeAtual;
    }

    public String getLogoTime() {
        return logoTime;
    }

    public String getPrecoFormatado() {
        return precoFormatado;
    }

    public String getSalarioFormatado() {
        return salarioFormatado;
    }

    public String getTimeEmprestimo() {
        return timeEmprestimo;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public String getFimContrato() {
        return fimContrato;
    }

    public String getMultaRecisoriaFormatada() {
        return multaRecisoriaFormatada;
    }

    public String getMoeda() {
        return moeda;
    }

    public Float getSalarioFloat() {
        return salarioFloat;
    }

    public Float getPrecoFloat() {
        return precoFloat;
    }

    public Float getMultaRecisoriaFloat() {
        return multaRecisoriaFloat;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTimeAtual(String timeAtual) {
        this.timeAtual = timeAtual;
    }

    public void setLogoTime(String logoTime) {
        this.logoTime = logoTime;
    }

    public void setPrecoFormatado(String precoFormatado) {
        this.precoFormatado = precoFormatado;
    }

    public void setSalarioFormatado(String salarioFormatado) {
        this.salarioFormatado = salarioFormatado;
    }

    public void setTimeEmprestimo(String timeEmprestimo) {
        this.timeEmprestimo = timeEmprestimo;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public void setFimContrato(String fimContrato) {
        this.fimContrato = fimContrato;
    }

    public void setMultaRecisoriaFormatada(String multaRecisoriaFormatada) {
        this.multaRecisoriaFormatada = multaRecisoriaFormatada;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public void setSalarioFloat(Float salarioFloat) {
        this.salarioFloat = salarioFloat;
    }

    public void setPrecoFloat(Float precoFloat) {
        this.precoFloat = precoFloat;
    }

    public void setMultaRecisoriaFloat(Float multaRecisoriaFloat) {
        this.multaRecisoriaFloat = multaRecisoriaFloat;
    }
}
