package com.lucasbpaixao.fifasquadcreator.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="caracteristicas")
public class CaracteristicasAvancadas {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="cruzamento")
    private Float cruzamento;

    @Column(name="finalizacao")
    private Float finalizacao;

    @Column(name="precisao_cabeceio")
    private Float precisaoCabeceio;

    @Column(name="passe_curto")
    private Float passeCurto;

    @Column(name="voleio")
    private Float voleio;

    @Column(name="driblando")
    private Float driblando;

    @Column(name="curva")
    private Float curva;

    @Column(name="precisao_falta")
    private Float precisaoFalta;

    @Column(name="passe_longo")
    private Float passeLongo;

    @Column(name="controle_bola")
    private Float controleBola;

    @Column(name="aceleracao")
    private Float aceleracao;

    @Column(name="velocidade_corrida")
    private Float velocidadeCorrida;

    @Column(name="agilidade")
    private Float agilidade;

    @Column(name="reacao")
    private Float reacao;

    @Column(name="equilibrio")
    private Float equilibrio;

    @Column(name="forca_chute")
    private Float forcaChute;

    @Column(name="pulo")
    private Float pulo;

    @Column(name="stamina")
    private Float stamina;

    @Column(name="forca")
    private Float forca;

    @Column(name="chute_longe")
    private Float chuteLonge;

    @Column(name="agressividade")
    private Float agressividade;

    @Column(name="interceptacoes")
    private Float interceptacoes;

    @Column(name="posicionamento")
    private Float posicionamento;

    @Column(name="visao")
    private Float visao;

    @Column(name="penalti")
    private Float penalti;

    @Column(name="compostura")
    private Float compostura;

    @Column(name="marcacao")
    private Float marcacao;

    @Column(name="desarme_em_pe")
    private Float desarmeEmPe;

    @Column(name="carrinho")
    private Float carrinho;

    @Column(name="melhor_geral")
    private Float melhorGeral;

    @Column(name="consciencia_defensiva")
    private Float conscienciaDefensiva;

    public Long getId() {
        return id;
    }

    public Float getAceleracao() {
        return aceleracao;
    }

    public Float getAgilidade() {
        return agilidade;
    }

    public Float getAgressividade() {
        return agressividade;
    }

    public Float getCarrinho() {
        return carrinho;
    }

    public Float getChuteLonge() {
        return chuteLonge;
    }

    public Float getCompostura() {
        return compostura;
    }

    public Float getConscienciaDefensiva() {
        return conscienciaDefensiva;
    }

    public Float getControleBola() {
        return controleBola;
    }

    public Float getCruzamento() {
        return cruzamento;
    }

    public Float getCurva() {
        return curva;
    }

    public Float getDesarmeEmPe() {
        return desarmeEmPe;
    }

    public Float getDriblando() {
        return driblando;
    }

    public Float getEquilibrio() {
        return equilibrio;
    }

    public Float getFinalizacao() {
        return finalizacao;
    }

    public Float getForca() {
        return forca;
    }

    public Float getForcaChute() {
        return forcaChute;
    }

    public Float getInterceptacoes() {
        return interceptacoes;
    }

    public Float getMarcacao() {
        return marcacao;
    }

    public Float getMelhorGeral() {
        return melhorGeral;
    }

    public Float getPasseCurto() {
        return passeCurto;
    }

    public Float getPasseLongo() {
        return passeLongo;
    }

    public Float getPenalti() {
        return penalti;
    }

    public Float getPosicionamento() {
        return posicionamento;
    }

    public Float getPrecisaoCabeceio() {
        return precisaoCabeceio;
    }

    public Float getPrecisaoFalta() {
        return precisaoFalta;
    }

    public Float getPulo() {
        return pulo;
    }

    public Float getReacao() {
        return reacao;
    }

    public Float getStamina() {
        return stamina;
    }

    public Float getVelocidadeCorrida() {
        return velocidadeCorrida;
    }

    public Float getVisao() {
        return visao;
    }

    public Float getVoleio() {
        return voleio;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAceleracao(Float aceleracao) {
        this.aceleracao = aceleracao;
    }
    
    public void setAgilidade(Float agilidade) {
        this.agilidade = agilidade;
    }

    public void setAgressividade(Float agressividade) {
        this.agressividade = agressividade;
    }

    public void setCarrinho(Float carrinho) {
        this.carrinho = carrinho;
    }

    public void setChuteLonge(Float chuteLonge) {
        this.chuteLonge = chuteLonge;
    }

    public void setCompostura(Float compostura) {
        this.compostura = compostura;
    }

    public void setConscienciaDefensiva(Float consciencia_defensiva) {
        this.conscienciaDefensiva = consciencia_defensiva;
    }

    public void setControleBola(Float controleBola) {
        this.controleBola = controleBola;
    }

    public void setCruzamento(Float cruzamento) {
        this.cruzamento = cruzamento;
    }

    public void setCurva(Float curva) {
        this.curva = curva;
    }

    public void setDesarmeEmPe(Float desarmeEmPe) {
        this.desarmeEmPe = desarmeEmPe;
    }

    public void setDriblando(Float driblando) {
        this.driblando = driblando;
    }

    public void setEquilibrio(Float equilibrio) {
        this.equilibrio = equilibrio;
    }

    public void setFinalizacao(Float finalizacao) {
        this.finalizacao = finalizacao;
    }

    public void setForca(Float forca) {
        this.forca = forca;
    }

    public void setForcaChute(Float forcaChute) {
        this.forcaChute = forcaChute;
    }

    public void setInterceptacoes(Float interceptacoes) {
        this.interceptacoes = interceptacoes;
    }

    public void setMarcacao(Float marcacao) {
        this.marcacao = marcacao;
    }

    public void setMelhorGeral(Float melhorGeral) {
        this.melhorGeral = melhorGeral;
    }

    public void setPasseCurto(Float passeCurto) {
        this.passeCurto = passeCurto;
    }

    public void setPasseLongo(Float passeLongo) {
        this.passeLongo = passeLongo;
    }

    public void setPenalti(Float penalti) {
        this.penalti = penalti;
    }

    public void setPosicionamento(Float posicionamento) {
        this.posicionamento = posicionamento;
    }
    public void setPrecisaoCabeceio(Float precisaoCabeceio) {
        this.precisaoCabeceio = precisaoCabeceio;
    }

    public void setPrecisaoFalta(Float precisaoFalta) {
        this.precisaoFalta = precisaoFalta;
    }

    public void setPulo(Float pulo) {
        this.pulo = pulo;
    }

    public void setReacao(Float reacao) {
        this.reacao = reacao;
    }
    
    public void setStamina(Float stamina) {
        this.stamina = stamina;
    }

    public void setVelocidadeCorrida(Float velocidadeCorrida) {
        this.velocidadeCorrida = velocidadeCorrida;
    }

    public void setVisao(Float visao) {
        this.visao = visao;
    }

    public void setVoleio(Float voleio) {
        this.voleio = voleio;
    }
}
