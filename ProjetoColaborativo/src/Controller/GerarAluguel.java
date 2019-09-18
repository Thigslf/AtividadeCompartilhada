/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AluguelDeautomovel;
import Model.Automóvel;
import Model.Cliente;
import Model.Diaria;
import Model.Funcionario;
import Model.Mensal;
import Model.Pessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class GerarAluguel {
  public AluguelDeautomovel gerarAluguel(Cliente c1,Funcionario f, Automóvel a,int tipo){
       
        Double preço = null;
        String Contratante = null;
        AluguelDeautomovel t = null;
      if(tipo == 1){
            String Tipo = null;
          t = new Diaria(Tipo, preço, Contratante);
           
      }else{
          if(tipo == 2){
              String Tipo = null;
              t = new Mensal(Tipo, preço, Contratante);
               
          }
      }
     return t;
  }  
  
  public Pessoa CadastroP(int TipoPessoa, Pessoa f) {
      if (TipoPessoa == 1) {
          JOptionPane.showInputDialog(, f)
          return new Funcionario();
      } else {
          return new Cliente();      
      }
  
}
}
