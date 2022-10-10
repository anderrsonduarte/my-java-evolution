package com.dygital.controlefinanceiro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import static com.dygital.controlefinanceiro.AgenciaBancaria.contasBancarias;

public class ContaCorrenteTest {
    public static void main(String[] args){
        System.out.println("*** Teste Conta Corrente ***");

        contasBancarias = new ArrayList<ContaCorrente>();

        ContaCorrente contaUm = new ContaCorrente();
        contaUm.setNomeCliente("Cliente Conta Um");
        contaUm.setNumeroConta(11111);
        contaUm.setNumeroAgencia(1);
        contaUm.setDataNascimento(LocalDate.of(1985, 12, 10));
        contasBancarias.add(contaUm);

        ContaCorrente contaDois = new ContaCorrente();
        contaDois.setNomeCliente("Cliente Conta Dois");
        contaDois.setNumeroConta(22222);
        contaDois.setNumeroAgencia(2);
        contaDois.setDataNascimento(LocalDate.of(1980, 01, 20));
        contasBancarias.add(contaDois);

        contaUm.depositar(50.0 );
        contaUm.depositar(0.0);
        contaUm.sacar(10.0);
        contaUm.sacar(60.0);

        System.out.println(contaUm);
        System.out.println(contaDois);

        contaUm.transferir(10.0, contaDois);

        System.out.println(contaDois);
        System.out.println(contaUm);
    }
}
