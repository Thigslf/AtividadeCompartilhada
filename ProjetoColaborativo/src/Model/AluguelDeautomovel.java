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
public  abstract class AluguelDeautomovel {
    protected String Tipo;
    protected Double preço;
    protected String Contratante;

    public AluguelDeautomovel(String Tipo, Double preço, String Contratante) {
        this.Tipo = Tipo;
        this.preço = preço;
        this.Contratante = Contratante;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public String getContratante() {
        return Contratante;
    }

    public void setContratante(String Contratante) {
        this.Contratante = Contratante;
    }
    
}
