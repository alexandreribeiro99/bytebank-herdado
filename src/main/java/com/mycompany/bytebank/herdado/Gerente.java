
package com.mycompany.bytebank.herdado;
// Gerente é um funcionario
// Gerente herda  da classe funcionario
public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
    public boolean autentica( int senha){
        if(this.senha == senha){
            return true;
        }
        return false;
    }
    
//    public double getBonificacao(){
//        return this.salario;
//    }


    
}
