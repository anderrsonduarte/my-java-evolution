package com.dygital.controlefinanceiro;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static com.dygital.controlefinanceiro.AgenciaBancaria.contasBancarias;

public class ContaCorrente {
    private Integer numeroConta;
    private Integer numeroAgencia;
    private String nomeCliente;
    private LocalDate dataNascimento;
    private Double saldo = 0.0;

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "Conta Bancária[";
        s += " nomeCliente:" + nomeCliente;
        s += " | numeroConta:" + numeroConta;
        s += " | numeroAgencia:" + numeroAgencia;
        s += " | dataNascimento:" + dataNascimento;
        s += " | saldo:" + saldo;
        s += "]";
        return s;
    }

    public void depositar(Double valor){
        if(valor == 0){
            System.out.println("O valor de depósito deve ser superior a zero.");
        }else{
            setSaldo(getSaldo() + valor);
        }
    }

    public void sacar(Double valor){
        if((getSaldo() - valor) < 0) {
            System.out.println("Saldo insuficiente para a transação de Saque.");
        }else{
            setSaldo(getSaldo() - valor);
        }
    }

    public void transferir(Double valor, ContaCorrente destino){
        if((getSaldo() - valor) < 0) {
            System.out.println("Saldo insuficiente para a transação de Transferência.");
        }else{
            setSaldo(getSaldo() - valor);
            destino.saldo = destino.getSaldo() + valor;
            System.out.println("Transferencia realizada com Sucesso!");
        }
    }
    public boolean cancelar(ContaCorrente conta, String justificativa) {
        boolean cancelada = false;
        if (justificativa.length() == 0) {
            System.out.println("Favor insira uma justificativa para cancelar conta.");
        } else {
            cancelada = true;
            System.out.println("Sua conta foi Cancelada com Sucesso");
        }
        return cancelada;
    }
    Double consultarSaldo(){
        return getSaldo();
    }

    List consultarExtrato(LocalDate dataInicial, LocalDate dataFinal){
        if(((dataInicial) == null) || ((dataInicial) == null)){
            System.out.println("Data Inicial e data Final não podem ser Vazio");
        }
        return null;
    }
}
