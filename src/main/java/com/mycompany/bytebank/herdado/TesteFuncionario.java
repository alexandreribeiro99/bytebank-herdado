
package com.mycompany.bytebank.herdado;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        nico.setNome("Nicolas");
        nico.setCpf("666-666-666-66");
        nico.setSalario(2500.00);
        
        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
    }
}
