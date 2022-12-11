package com.lucasbpaixao.fifasquadcreator.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="caracteristicas")
public class CaracteristicasPrincipais {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="geral")
    private Integer geral;

    @Column(name="potencial")
    private Integer potencial;

    @Column(name="pior_pe_estrelas")
    private Float piorPeEstrelas;

    @Column(name="drible_estrelas")
    private Float dribleEstrelas;

    @Column(name="dedicacao")
    private String dedicacao;

    @Column(name="melhor_posicao")
    private String melhorPosicao;

    public Long getId() {
        return id;
    }

    public Integer getGeral() {
        return geral;
    }

    public Integer getPotencial() {
        return potencial;
    }

    public Float getPiorPeEstrelas() {
        return piorPeEstrelas;
    }

    public Float getDribleEstrelas() {
        return dribleEstrelas;
    }

    public String getDedicacao() {
        return dedicacao;
    }

    public String getMelhorPosicao() {
        return melhorPosicao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGeral(Integer geral) {
        this.geral = geral;
    }

    public void setPotencial(Integer potencial) {
        this.potencial = potencial;
    }

    public void setPiorPeEstrelas(Float piorPeEstrelas) {
        this.piorPeEstrelas = piorPeEstrelas;
    }

    public void setDribleEstrelas(Float dribleEstrelas) {
        this.dribleEstrelas = dribleEstrelas;
    }

    public void setDedicacao(String dedicacao) {
        this.dedicacao = dedicacao;
    }

    public void setMelhorPosicao(String melhorPosicao) {
        this.melhorPosicao = melhorPosicao;
    }
}
