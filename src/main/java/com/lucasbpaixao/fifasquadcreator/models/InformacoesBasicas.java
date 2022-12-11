package com.lucasbpaixao.fifasquadcreator.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;

@Entity
@Table(name="informacoes_basicas")
@SecondaryTable(name="informacoes_contrato")
public class InformacoesBasicas {
    
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="idade")
    private int idade;

    @Column(name="foto")
    private String foto;

    @Column(name="nacionalidade")
    private String nacionalidade;

    @Column(name="bandeira_pais")
    private String bandeiraPais;

    @Column(name="melhor_pe")
    private String melhorPe;

    @Column(name="altura")
    private String altura;

    @Column(name="peso")
    private String peso;

    @Column(name="face_real")
    private String faceReal;

    @Column(name="posicao")
    private String posicao;

    @OneToOne
    @PrimaryKeyJoinColumn(name="id")
    private InformacoesContrato informacoesContrato;

    @OneToOne
    @PrimaryKeyJoinColumn(name="id")
    private CaracteristicasPrincipais caracteristicasPrincipais;

    @OneToOne
    @PrimaryKeyJoinColumn(name="id")
    private CaracteristicasAvancadas caracteristicasAvancadas;

    public Long getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getFoto(){
        return this.foto;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public String getBandeiraPais(){
        return this.bandeiraPais;
    }

    public String getMelhorPe() {
        return melhorPe;
    }

    public String getAltura() {
        return altura;
    }

    public String getPeso() {
        return peso;
    }

    public String getFaceReal() {
        return faceReal;
    }

    public String getPosicao() {
        return posicao;
    }

    public InformacoesContrato getInformacoesContrato() {
        return informacoesContrato;
    } 

    public CaracteristicasPrincipais getCaracteristicasPrincipais() {
        return caracteristicasPrincipais;
    }
    
    public CaracteristicasAvancadas getCaracteristicasAvancadas() {
        return caracteristicasAvancadas;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setBandeiraPais(String bandeiraPais) {
        this.bandeiraPais = bandeiraPais;
    }

    public void setMelhorPe(String melhorPe) {
        this.melhorPe = melhorPe;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void setFaceReal(String faceReal) {
        this.faceReal = faceReal;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setCaracteristicasPrincipais(CaracteristicasPrincipais caracteristicasPrincipais) {
        this.caracteristicasPrincipais = caracteristicasPrincipais;
    }

    public void setCaracteristicasAvancadas(CaracteristicasAvancadas caracteristicasAvancadas) {
        this.caracteristicasAvancadas = caracteristicasAvancadas;
    }
    
    public void setInformacoesContrato(InformacoesContrato informacoesContrato) {
        this.informacoesContrato = informacoesContrato;
    }
}
