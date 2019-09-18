/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Caminhao extends Automóvel {
    
    private double tamanho;
    private double largura;
    private double peso;
    private String Tipo_carga;
    
    public Caminhao(String modelo, String fabricante, int ano) {
        super(modelo, fabricante, ano);
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipo_carga() {
        return Tipo_carga;
    }

    public void setTipo_carga(String Tipo_carga) {
        this.Tipo_carga = Tipo_carga;
    }
    
    
    
}
