/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AluguelDeautomovel;
import Model.Automóvel;
import Model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Principal {
 
    public static void main (String args[]){
        
        ArrayList<Pessoa> funcionarios = new ArrayList<>();
        ArrayList<Pessoa> clientes = new ArrayList<>();
        ArrayList<Automóvel> automoveis = new ArrayList<>();
        ArrayList<AluguelDeautomovel> alugueis = new ArrayList<>();
        
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Cadastrar Funcionario\n2. Cadastrar Cliente\n3. Cadastrar Automovel\n4. Criar Aluguel\n5. Sair"));
        } while(opcao != 5);
    }
}
