package com.dygital.controlefinanceiro;

import java.time.LocalDate;
import java.util.Date;

public class ContaCorrenteTest {
    public static void main(String[] args){
        System.out.println("*** Teste Conta Corrente ***");

        ContaCorrente contaUm = new ContaCorrente();
        contaUm.setNomeCliente("Cliente Conta Um");
        contaUm.setNumeroConta(11111);
        contaUm.setNumeroAgencia(00001);
        contaUm.setDataNascimento(LocalDate.of(1985, 12, 10));

        contaUm.depositar(50.0);
        contaUm.depositar(0.0);
        contaUm.sacar(10.0);
        contaUm.sacar(60.0);

        System.out.println(contaUm);
    }
}
