/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Funcionario  extends Pessoa{
    private int ID;
    private String cargo;
    private double salario;
    public Funcionario(String nome, int idade, String CPF, String nacionalidade) {
        super(nome, idade, CPF, nacionalidade);
    }

    /**
     *
     */
  

    public Funcionario(int ID, String cargo, double salario, String nome, int idade, String CPF, String nacionalidade) {
        super(nome, idade, CPF, nacionalidade);
        this.ID = ID;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}   
    
}
