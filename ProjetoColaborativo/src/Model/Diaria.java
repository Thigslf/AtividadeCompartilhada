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
public class Diaria  extends  AluguelDeautomovel {
    private Pessoa CPF;
    private Automóvel modelo;
    public Diaria(String Tipo, Double preco, String Contratante) {
        super(Tipo, preco, Contratante);
    
    
    }

    public Pessoa getCPF() {
        return CPF;
    }

    public void setCPF(Pessoa CPF) {
        this.CPF = CPF;
    }

    public Automóvel getModelo() {
        return modelo;
    }

    public void setModelo(Automóvel modelo) {
        this.modelo = modelo;
    }
    
}
